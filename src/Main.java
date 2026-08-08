public class Main {

    static int heal(int playerHp, int amount) {
        if (playerHp + amount >= 100) {
            System.out.println("체력이 가득 찼습니다!");
            return 100;
        }

        System.out.println("회복했습니다!");
        return playerHp + amount;
    }

    public static void main(String[] args) {

        int playerHp = 70;

        playerHp = heal(playerHp, 20);
        System.out.println("HP : " + playerHp);

        playerHp = heal(playerHp, 20);
        System.out.println("HP : " + playerHp);
    }
}