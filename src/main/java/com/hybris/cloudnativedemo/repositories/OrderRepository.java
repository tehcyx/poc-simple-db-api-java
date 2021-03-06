package com.hybris.cloudnativedemo.repositories;

import com.hybris.cloudnativedemo.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends CrudRepository<Order, Integer>{
}