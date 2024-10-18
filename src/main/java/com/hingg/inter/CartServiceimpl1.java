package com.hingg.inter;

import org.springframework.stereotype.Component;

@Component("cart1")
public class CartServiceimpl1 implements CartService {

	@Override
	public void addCart() {
		// TODO Auto-generated method stub
		
		System.out.println("hello this is a qualifier classsssssss");
		
	}
	
	

}
