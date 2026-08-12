
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


        Player player1 = new Player("철수", 100, 30);
        Player player2 = new Player("영희", 80, 20);

        System.out.println("캐릭터명 : " + player1.name);
        System.out.println("체력 : " + player1.hp);
        System.out.println("공격력 : " + player1.damage);
        System.out.println();

        System.out.println("캐릭터명 : " + player2.name);
        System.out.println("체력 : " + player2.hp);
        System.out.println("공격력 : " + player2.damage);
        System.out.println();

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

class Player {
    String name;
    int hp;
    int damage;

    Player(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
}