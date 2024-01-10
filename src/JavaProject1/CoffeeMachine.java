package JavaProject1;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // TODO 1st Conditional Section
        System.out.println("Which coffee would you like?");
        System.out.println("1- Turkish Coffee");
        System.out.println("2- Filter Coffee");
        System.out.println("3- Espresso");

        String chosenCoffee;
        while (true) {
            chosenCoffee = scan.nextLine().toLowerCase(Locale.ROOT);
            if (chosenCoffee.equals("turkish coffee")) {
                System.out.println("Turkish Coffee is being prepared.");
                break;
            } else if (chosenCoffee.equals("filter coffee")) {
                System.out.println("Filter Coffee is being prepared.");
                break;
            } else if (chosenCoffee.equals("espresso")) {
                System.out.println("Espresso is being prepared");
                break;
            } else {
                System.out.println("Incorrect keystroke. Please try again.");
            }
        }

        // TODO 2nd Conditional Section
        System.out.println("Would you like us to add milk? (Answer with Yes or No): ");
        String addMilk;
        while (true) {
            addMilk = scan.nextLine().toLowerCase(Locale.ROOT);
            if (addMilk.equals("yes")) {
                System.out.println("Milk is added...");
                break;
            }
            else if (addMilk.equals("no")) {
                System.out.println("No milk is being added");
                break;
            }
            else {
                System.out.println("Incorrect keystroke. Please try again.");
            }
        }


        // TODO 3rd Conditional Section
        System.out.println("Do you want sugar? (Answer with Yes or No): ");
        String dummyCode = scan.nextLine(); //Adding dummy code for transition from int to String
        String addSugar;
        while (true) {
            addSugar = scan.nextLine().toLowerCase(Locale.ROOT);
            if (addSugar.equals("yes")) {
                System.out.println("How many sugar do you want?");
                int numberOfSugar = scan.nextInt();
                System.out.println("Adding " + numberOfSugar + " sugars.");
                break;
            } else if (addSugar.equals("No")) {
                System.out.println("No sugar is being added.");
                break;
            } else{
                System.out.println("Incorrect keystroke. Please try again.");
            }
        }

        // TODO 4th Conditional Section
        System.out.println("What size would you like? (Large size - Medium size- Small size): ");
        String size;
        while (true) {
            size = scan.nextLine().toLowerCase(Locale.ROOT);
            if (size.equals("large")) {
                System.out.println("Your Large size coffee is being prepared.");
                break;
            } else if (size.equals("medium")) {
                System.out.println("Your Medium size coffee is being prepared.");
                break;
            } else if (size.equals("small")) {
                System.out.println("Your Small size coffee is being prepared.");
                break;
            }
            else {
                System.out.println("Incorrect keystroke. Please try again.");
            }
        }

        System.out.println(chosenCoffee + " " + size + " size is ready. Enjoy!");

        // scan.close();






    }

}
