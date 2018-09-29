package com.olx.productManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.olx.productManagement.pojo.ProductPojo;
import com.olx.productManagement.repository.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
	@Mock
	ProductRepository productRepository;
	@InjectMocks
	ProductService productService;
	@Test
	public void addProductTest_1()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		Mockito.when(productRepository.save(product)).thenReturn(product);
		ProductPojo product1=productService.addProduct(product);
		Assert.assertNotNull(product1);
	}
	@Test
	public void addProductTest_2()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		Mockito.when(productRepository.save(product)).thenReturn(product);
		ProductPojo product1=productService.addProduct(null);
		Assert.assertNotNull(product1);
	}
	@Test
	public void findAllProducts_1()
	{
		List<ProductPojo> productList=new ArrayList<ProductPojo>();
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		productList.add(product);
		product=new ProductPojo(null,"xyz", "xyz", "xyz", null, "urmi", "87979789", "kol");
		productList.add(product);
		Mockito.when(productRepository.findAll()).thenReturn(productList);
		List<ProductPojo> products=productService.findAllProducts();
		Assert.assertEquals(productList.size(),products.size());
		
	}
	@Test
	public void updateOldProductTest_1()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "87979789", "kol");
		Mockito.when(productRepository.save(product)).thenReturn(product);
		ProductPojo product1=productService.addProduct(product);
		System.out.println(product1);
		Assert.assertNotNull(product1);
		
	}
	@Test
	public void updateOldProductTest_2()
	{
		ProductPojo product=new ProductPojo(null,"abc", "abc", "abc", null, "urmi", "79789", "kol");
		Mockito.when(productRepository.save(product)).thenReturn(product);
		ProductPojo product1=productService.addProduct(null);
		Assert.assertNotNull(product1);
		
	}
}
