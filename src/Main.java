
class Product {
    String name;
    int price;
    int stock;
    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
public class Main {
    public static void main(String[] args) {
        Product keyboard = new Product("키보드", 50000, 10);
        Product mouse = new Product("마우스", 30000, 20);
        System.out.println("상품명: " + keyboard.name);
        System.out.println("가격: " + keyboard.price);
        System.out.println("재고: " + keyboard.stock);
        System.out.println();
        System.out.println("상품명: " + mouse.name);
        System.out.println("가격: " + mouse.price);
        System.out.println("재고: " + mouse.stock);
    }
}
