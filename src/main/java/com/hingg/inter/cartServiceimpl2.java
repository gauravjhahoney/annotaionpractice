package com.hingg.inter;

import org.springframework.stereotype.Component;

@Component("cart2")
public class cartServiceimpl2 implements CartService {

	@Override
	public void addCart() {
		// TODO Auto-generated method stub
		
		System.out.println("this is qualifier 2");
		
	}

}
