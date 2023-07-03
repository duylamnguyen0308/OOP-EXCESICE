package SalesSystem;

import java.util.ArrayList;
import java.util.List;

public class Oders {
    private Costumers customer;
    private List<Products> products;

    public Oders(Costumers customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public void removeProduct(Products product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Products product : products) {
            total += product.getPrice();
        }
        return total;
    }
}