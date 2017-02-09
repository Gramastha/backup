package com.exception;

public class ShoppingCartNotFoundException extends Exception {
	public ShoppingCartNotFoundException() {
		super("Failed to load Shopping Cart: The system cannot find the user requested");
	}
}
