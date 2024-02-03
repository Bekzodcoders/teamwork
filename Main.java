import Entitiy.Addwater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            DisplayMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> Addwater.addwather();
                case 2 -> Addwater.showWater();

            }
        }
    }

    private static void DisplayMenu() {
        System.out.println("""
                1.add water
                2.show water
                3.pour water
                """);
    }
}
