public class Main {

    static int attack(int playerHp, int damage) {
        System.out.println("공격!");

        if (playerHp - damage <= 0) {
            return 0;
        }

        return playerHp - damage;
    }

    public static void main(String[] args) {

        int[] playerHp = {100, 80, 50};
        int damage = 30;

        for (int i = 0; i < playerHp.length; i++) {
            playerHp[i] = attack(playerHp[i], damage);
            System.out.println("플레이어 HP : " + playerHp[i]);
        }
    }
}