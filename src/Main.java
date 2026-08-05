public class Main {
    static int heal(int amount) {
        return amount;
    }
    static int limitHp(int hp) {

        if (hp > 100) {
            hp = 100;
        }

        return hp;
    }
    public static void main(String[] args) {
        int playerHp = 50;
        playerHp += heal(30);
        playerHp = limitHp(playerHp);
        System.out.println("HP : " + playerHp);
        playerHp += heal(80);
        playerHp = limitHp(playerHp);
        System.out.println("HP : " + playerHp);
        playerHp += heal(100);
        playerHp = limitHp(playerHp);
        System.out.println("HP : " + playerHp);
    }
}
