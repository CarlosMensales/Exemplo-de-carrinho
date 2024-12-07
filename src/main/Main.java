package main;

import model.Cart;
import model.Product;
import service.CartService;

public class Main {
    public static void main(String[] args) {
        Product notebook = new Product("Notebook", 3000.0);
        Product smartphone = new Product("Smartphone", 2000.0);

        Cart cart = new Cart();
        CartService cartService = new CartService(cart);

        cart.addProduct(notebook);
        cart.addProduct(smartphone);

        cartService.showCart();

        cart.removeProduct(notebook);

        cartService.showCart();
    }
}
