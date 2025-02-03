package com.devsenior.jorgee;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Producto añadido: " + product);
    }

    public void sellProduct(String name, Integer quantity) {
        // Producto exista
        var product = getProductByName(name);

        // Hay cantidad suficiente
        if (product.getStock() < quantity) {
            // No hay cantidad suficiente
        }
        product.setStock(product.getStock() - quantity);

    }

    public Double calculateTotalInventory() {
        var total = 0d;

        for (Product product : products) {
            total += product.getStock() * product.getPrice();

        }
        return total;
    }

    private Product getProductByName(String name) {
        
            for (Product product : products) {
                if (name.equalsIgnoreCase(product.getName())) {
                    return product;
                }
            }

            throw new NullPointerException("el producto " + name + " No se encuentra en el inventario");
                
        
            
        }
        
        
    
        
    }


