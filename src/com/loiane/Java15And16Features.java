package com.loiane;

import java.util.ArrayList;
import java.util.List;

public class Java15And16Features {

    public static void main(String[] args) throws Exception {
        textBlocks();
        sealedClassesPreview();
        patternMatching(1);
        recordsExample();
        localInterface();
    }

    private static void textBlocks() {
        String beforeQuery = "update products\n" +
                             "    set quantityInStock = ?\n" +
                             "    ,modifiedDate = ?\n" +
                             "    ,modifiedBy = ?\n" +
                             "where productCode = ?\n";

        // new in Java 14
        String updateQuery = """
                update products \
                    set quantityInStock = ?
                    ,modifiedDate = ?
                    ,modifiedBy = ?  \s
                where productCode = ?
                """;
        System.out.println(updateQuery);
        System.out.println(".");
    }

    private static void sealedClassesPreview() {

    }

    private static void patternMatching(Object num) {
        if (num instanceof Integer n && n.toString().equals("1")) {
            System.out.println(n);
        }
    }

    public static void recordsExample() {
        Product product = new Product(1L, "product name", "desc");

        List<Product> products = new ArrayList<>();
        products.add(product);

        record Temp(String name) {}

        Temp temporary = new Temp("Loiane");
        temporary.name().trim();
    }

    public static void localInterface() {

        interface MyInterface {}

        enum DAYS { SUNDAY, MONDAY }

        record MyRecord() implements  MyInterface {}
    }

    public static double shapeArea(Shape shape) {
        if (shape instanceof Circle c) {
            return Math.PI * c.getRadius() * c.getRadius();
        }
        if (shape instanceof Rectangle r) {
            return r.getLength() * r.getWidth();
        }
        if (shape instanceof Square s) {
            return s.getSide() * s.getSide();
        }
        return 0;
        // future state, not supported yet - JDK 17: JEP 406
        /* return switch (shape) {
            case Circle c -> Math.PI * c.getRadius() * c.getRadius();
            case Rectangle r -> r.getLength() * r.getWidth();
            case Square s -> s.getSide() * s.getSide();
        } */
    }
}
