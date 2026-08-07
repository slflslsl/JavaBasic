public class Main {

    static boolean critical() {
        return true;
    }
       static int attack (int damage) {
           if (critical()) {
               System.out.println("크리티컬 데미지가 발생하였습니다!");
               return damage * 2;
           }
           return damage;
       }
      public static void main(String[] args) {
         System.out.println("데미지 : " + attack(30));
       }
}