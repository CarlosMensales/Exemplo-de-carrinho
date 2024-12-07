package service;

import model.Cart;

public class CartService {
    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void showCart() {
        if (cart.getProducts().isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            cart.getProducts().forEach(System.out::println);
            System.out.println("Total: R$" + cart.getTotalPrice());
        }
    }
}
