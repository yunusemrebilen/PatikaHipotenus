

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk kenarı giriniz");
        int ilkKenar  = scan.nextInt();
        System.out.println("Lütfen ikinci kenarı giriniz");
        int ikinciKenar = scan.nextInt();

        double hipo =(ilkKenar*ilkKenar) + (ikinciKenar*ikinciKenar);
        double hipotenus =Math.sqrt(hipo);
        System.out.println(hipotenus);

    }
}
