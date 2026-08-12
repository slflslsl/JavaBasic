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

class Order {
    String customerName;
    Product product;
    int quantity;

    Order(String customerName, Product product, int quantity) {
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
    }

    boolean placeOrder() {
        return product.decreaseStock(quantity);
    }
}

public class Main {
    public static void main(String[] args) {

        Product keyboard = new Product("키보드", 50000, 5);

        Order order = new Order("철수", keyboard, 2);

        boolean success = order.placeOrder();

        if (success) {
            System.out.println("주문 성공");
            System.out.println("고객명 : " + order.customerName);
            System.out.println("상품명 : " + order.product.name);
            System.out.println("주문 수량 : " + order.quantity);
            System.out.println("주문 후 재고 : " + order.product.stock);
        } else {
            System.out.println("주문 실패");
        }
    }
}