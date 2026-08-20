class Product {
    private String name;

    Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Product product = new Product("키보드");

        System.out.println(product.getName());
    }
}