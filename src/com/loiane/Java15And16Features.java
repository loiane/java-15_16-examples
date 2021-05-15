package com.loiane;

public class Java15And16Features {

    public static void main(String[] args) throws Exception {
        textBlocks();
        sealedClassesPreview();
        patternMatching();
        recordsExample();
    }

    private static void textBlocks() {
        String beforeQuery = "update products\n" +
                             "    set quantityInStock = ?\n" +
                             "    ,modifiedDate = ?\n" +
                             "    ,modifiedBy = ?\n" +
                             "where productCode = ?\n";

        String updateQuery = """
                update products
                    set quantityInStock = ?
                    ,modifiedDate = ?
                    ,modifiedBy = ?
                where productCode = ?
                """;
        System.out.println(updateQuery);
        System.out.println(".");

        // new in Java 14
        String updateQuery2 = """
                update products \
                    set quantityInStock = ?
                    ,modifiedDate = ?
                    ,modifiedBy = ?  \s
                where productCode = ?
                """;
        System.out.println(updateQuery2);
                System.out.println("."); 
    }

    private static void sealedClassesPreview() {
        
    }

    private static void patternMatching() {
        
    }

    private static void recordsExample() {
    
    }    
}
