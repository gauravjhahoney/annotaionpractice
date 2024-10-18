package com.hingg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hingg.configuration.CatogoryService;
import com.hingg.configuration.productservice;

@SpringBootApplication
//this is the combination of three annotation: 1.@configuration that indicates the class is configuration that decalare one or more bean
//2.@EnableAutoconfiguration  3. @ComponentScan


//response body ka use 
public class AnnotationtestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(AnnotationtestApplication.class, args);
		
		productservice product=context.getBean(productservice.class);
		product.creatingProduct();
		
		System.out.println(product);
		
		CatogoryService catogory=context.getBean(CatogoryService.class);
		System.out.println(catogory);
		catogory.getProductservice().creatingProduct();
		
		catogory.getCartservice().addCart();
	}

}
