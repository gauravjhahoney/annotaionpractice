package com.hingg.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hingg.inter.CartService;

@Component
public class CatogoryService {

	@Autowired
	private productservice productservice;
	
	@Autowired
	@Qualifier("cart2")
	private CartService cartservice;
	
	

	public CartService getCartservice() {
		return cartservice;
	}

	public void setCartservice(CartService cartservice) {
		this.cartservice = cartservice;
	}

	public productservice getProductservice() {
		return productservice;
	}

	public void setProductservice(productservice productservice) {
		this.productservice = productservice;
	}
	
	
}
