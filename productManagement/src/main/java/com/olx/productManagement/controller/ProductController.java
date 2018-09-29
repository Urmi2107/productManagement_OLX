package com.olx.productManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olx.productManagement.pojo.ProductPojo;
import com.olx.productManagement.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ProductPojo addNewProduct(@RequestBody ProductPojo product) {
		//LOG.info("Saving user.");
		return productService.addProduct(product);
	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<ProductPojo> getAllProduct() {
		//LOG.info("Getting all users.");
		return productService.findAllProducts();
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ProductPojo updateProduct(@RequestBody ProductPojo product){
		return productService.updateOldProduct(product);
	}
	@RequestMapping(value = "/delete/{productId}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable String productId) {
		//LOG.info("Getting all users.");
		productService.deleteProduct(productId);
	}

}
