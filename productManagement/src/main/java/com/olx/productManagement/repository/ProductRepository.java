package com.olx.productManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.olx.productManagement.pojo.ProductPojo;

@Repository
public interface ProductRepository extends MongoRepository<ProductPojo, String>{

	
}
