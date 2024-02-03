package Entitiy;

import java.util.Scanner;

public class Addwater {
    private static int suv = 0;
    private static int maxLimt = 100;


    public static void addwater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qancha suv qo'shmoqchisiz");
        int add = scanner.nextInt();
        if ( suv + add <= maxLimt) {
            suv += add;
            System.out.println("Suv qo'shildi");
        } else {
            System.out.println("Siz qo'shmoqchi bo'lgan suv bochkaga sig'maydi!!!");
            System.out.println("Qayta kiriting");
        }
    }


    public static void showWater() {
        System.out.println("-------------------------------------------");
        System.out.println("to'la hajmi: " + maxLimt + " litr");
        System.out.println((maxLimt - suv) + " litr hajmi bo'sh");
        System.out.println("-------------------------------------------");
    }

    public static void pourWater() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qancha suv to`kmoqchsiz :");
        int n = scanner.nextInt();
        if(n>suv){
            System.out.println("ERROR! Buncha suv mavjud emas!");
            pourWater();
        }else{
            suv = suv-n;
            System.out.println("Suv to`kildi!");
            System.out.println("==> SUCCES! <==");
        }
    }
}