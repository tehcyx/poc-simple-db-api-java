package com.hybris.cloudnativedemo.repositories;

import com.hybris.cloudnativedemo.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ItemRepository extends CrudRepository<Item, Integer>{
}