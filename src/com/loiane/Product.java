package com.loiane;

import java.io.Serializable;

public record Product(Long id, String name, String description)
        implements Serializable, Comparable<Product>, Mailable {

    public static int COUNT = 0;
    public void myMethod() {}

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    @Override
    public double calculateShippingPrice() {
        return 0;
    }
}
