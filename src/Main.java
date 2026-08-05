public class Main {

    static int heal(int amount) {
        return amount;
    }

    public static void main(String[] args) {

        int playerHp = 50;

        playerHp += heal(10);
        System.out.println("HP : " + playerHp);
        playerHp += heal(20);
        System.out.println("HP : " + playerHp);
        playerHp += heal(30);
        System.out.println("HP : " + playerHp);

    }
}