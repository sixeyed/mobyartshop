package com.docker.mobystore.repositories;

import com.docker.mobystore.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
		
	Cart findOne(Long cartId);
}