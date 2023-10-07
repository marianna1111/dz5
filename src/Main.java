public class Main {
    public static void main(String[] args) {
        //initialize
        int a = 5;
        int b = 7;
        int c = 9;
        int d = 11;
        int sumAB = a + b;
        int sumCD = c + d;
        System.out.println(sumAB > sumCD ? true : false);
        sumAB++;
        sumCD--;
        sumCD--;
        System.out.println(sumAB > sumCD ? true : false);
        System.out.println(sumAB % 2 == 0 || sumCD % 2 == 0 ? true : false);
    }
}