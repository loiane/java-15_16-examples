package com.loiane;

import java.io.Serializable;

public record Product(Long id, String name, String description)
        implements Serializable, Comparable<Product> {

    public static int COUNT = 0;
    public void myMethod() {}

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
