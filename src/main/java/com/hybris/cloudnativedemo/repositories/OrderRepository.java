package com.hybris.cloudnativedemo.repositories;

import com.hybris.cloudnativedemo.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
}