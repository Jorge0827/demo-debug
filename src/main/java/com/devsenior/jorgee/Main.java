package com.devsenior.jorgee;

public class Main {
    public static void main(String[] args) {
        var inventory = new Inventory();
        inventory.addProduct(new Product("Laptop", 10, 3000.0));
        inventory.addProduct(new Product("Phone", 0, 600.0));

        inventory.sellProduct("laptop", 5);
        inventory.sellProduct("phone", 1);
        inventory.sellProduct("tablet", 2);

        var total = inventory.calculateTotalInventory();
        System.out.printf("Valor total del inventario es: $ %.2f%n", total);
    }
}