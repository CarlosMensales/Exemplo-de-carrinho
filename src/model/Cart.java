package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println(product.getName() + " foi adicionado ao carrinho!");
    }

    public void removeProduct(Product product) {
        if (this.products.remove(product)) {
            System.out.println(product.getName() + " foi removido do carrinho.");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return this.products.stream().mapToDouble(Product::getPrice).sum();
    }
}
