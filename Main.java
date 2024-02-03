import Entitiy.Addwater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            DisplayMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> Addwater.addwater();
                case 2 -> Addwater.showWater();
                case 3 -> Addwater.pourWater();
                case 0 -> {return;}
            }
        }
    }

    private static void DisplayMenu() {
        System.out.print("""
                =================
                1.add water
                2.show water
                3.pour water
                =================
                (0) - exit
                
                Enter :""");
    }
}