package com.olx.productManagement.controller;

import java.util.ArrayList;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.olx.productManagement.pojo.ProductPojo;
import com.olx.productManagement.service.ProductService;
@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {
	@Mock
	ProductService productService;
	@InjectMocks
	ProductController productController;
	@Test
	public void addNewProductTest_1()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		Mockito.when(productService.addProduct(product)).thenReturn(product);
		ProductPojo product1=productController.addNewProduct(product);
		//System.out.println(product1);
		Assert.assertNotNull(product1);
		
	}
	@Test
	public void addNewProductTest_2()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "79789", "kol");
		Mockito.when(productService.addProduct(product)).thenReturn(product);
		ProductPojo product1=productController.addNewProduct(null);
		Assert.assertNotNull(product1);
		
	}
	@Test
	public void getAllProductTest_1()
	{
		List<ProductPojo> productList=new ArrayList<ProductPojo>();
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		productList.add(product);
		product=new ProductPojo(null,"xyz", "xyz", "xyz", null, "urmi", "87979789", "kol");
		productList.add(product);
		Mockito.when(productService.findAllProducts()).thenReturn(productList);
		List<ProductPojo> products=productController.getAllProduct();
		Assert.assertEquals(productList.size(),products.size());
		
	}
	@Test
	public void updateProductTest_1()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		Mockito.when(productService.addProduct(product)).thenReturn(product);
		ProductPojo product1=productController.addNewProduct(product);
		System.out.println(product1);
		Assert.assertNotNull(product1);
		
	}
	@Test
	public void updateProductTest_2()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "79789", "kol");
		Mockito.when(productService.addProduct(product)).thenReturn(product);
		ProductPojo product1=productController.addNewProduct(null);
		Assert.assertNotNull(product1);
		
	}
	

}
