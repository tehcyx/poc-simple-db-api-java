package com.hybris.cloudnativedemo.controllers;

import com.hybris.cloudnativedemo.domain.Order;
import com.hybris.cloudnativedemo.domain.Item;
import com.hybris.cloudnativedemo.domain.CommerceOrder;
import com.hybris.cloudnativedemo.domain.CommerceOrderEntry;
import com.hybris.cloudnativedemo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.Sets;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Value("${GATEWAY_URL:}")
    private String gateway_url;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/read")
    public Set<Order> read(){
        return Sets.newHashSet(orderRepository.findAll());
    }

    @PostMapping("/create")
    public Order create(@Valid @RequestBody Order order) {
        if (gateway_url != null && !gateway_url.equals("")) {
            String requestUrl = gateway_url + "/" + order.getBaseSiteUid() + "/orders/" + order.getOrderCode();
            CommerceOrder ord = restTemplate.getForObject(
                    requestUrl, CommerceOrder.class);

            Set<Item> items = new HashSet<Item>();
            for (CommerceOrderEntry item : ord.getentries()) {
                Item i = new Item();
                i.setname(item.getproduct().getname());
                i.setquantity(item.getquantity());
                items.add(i);
            }
            order.setitems(items);
        }

        return orderRepository.save(order);
    }

}