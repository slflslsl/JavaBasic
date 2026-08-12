
class Product {
    String name;
    int price;
    int stock;

    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    boolean decreaseStock(int quantity) {
        if (stock < quantity) {
            System.out.println("재고 부족");
            return false;
        }
        stock -= quantity;
        return true;
    }
}
public class Main {
    public static void main(String[] args) {

        Product keyboard = new Product("키보드", 50000, 5);

        int quantity = 6;

        boolean success = keyboard.decreaseStock(quantity);

        if (success) {
            System.out.println("주문 성공");
            System.out.println("주문 수량: " + quantity);
            System.out.println("주문 후 재고: " + keyboard.stock);
        } else {
            System.out.println("주문 실패");
            System.out.println("주문 수량: " + quantity);
            System.out.println("현재 재고: " + keyboard.stock);
        }
    }
}