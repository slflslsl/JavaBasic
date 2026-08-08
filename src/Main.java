
public class Main {

    static int attack(int monsterHp, int damage) {
        return monsterHp - damage;
    }

    public static void main(String[] args) {

        int monsterHp = 100;

        monsterHp = attack(monsterHp, 30);
        System.out.println("몬스터 HP : " + monsterHp);

        monsterHp = attack(monsterHp, 50);
        System.out.println("몬스터 HP : " + monsterHp);
    }
}