package Entitiy;

import java.util.Scanner;

public class Addwater {
    private static int suv = 1;
    private static int maxLimt = 100;


    public static void addwather() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qancha suv qo'shmoqchisiz");
        int add = scanner.nextInt();
        if (suv <= maxLimt) {
            suv += add;
            System.out.println("Suv qo'shildi");
        } else {
            System.out.println("Siz qo'shmoqchi bo'lgan suv bochkaga sig'maydi!!!");
        }
    }

    public static void showWater() {
        System.out.println("-------------------------------------------");
        System.out.println("to'la hajmi: " + maxLimt + " litr");
        System.out.println((maxLimt - suv) + " litr hajmi bo'sh");
        System.out.println("-------------------------------------------");
    }
}
