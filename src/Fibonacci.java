import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayisi giriniz : ");
        int n = input.nextInt();
        int toplam = 1;
        for (int i = 0; i <= n; i = (toplam-i)){
            System.out.println( i + "+" + toplam + "=" + (toplam+i) );
            toplam += i;
        }

    }
}
