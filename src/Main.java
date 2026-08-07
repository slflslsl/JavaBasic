public class Main {
    static int max(int a, int b) {
        if( a > b) {
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(50, 30));
    }
}