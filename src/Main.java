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