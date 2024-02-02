package Entitiy;

import java.util.Scanner;

public class Addwater {
    private static int suv = 0;
    private static int maxLimt = 100;


    public static void addwather() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qancha suv qo'shmoqchisiz");
        int add = scanner.nextInt();
        if (suv<maxLimt){
            suv+=add;
            System.out.println("Suv qo'shildi");
        }else {
            System.out.println("Siz qo'shmoqchi bo'lgan suv bochkaga sig'maydi!!!");
        }
    }
}
