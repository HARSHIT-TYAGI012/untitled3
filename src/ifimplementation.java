import java.util.Scanner;

public class ifimplementation {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("please enter positive integer");
        int number = object.nextInt();
        if (number > 50) {
            System.out.println("You have entereed a value grater then 50");
        } else {
            System.out.println("number is less then 50");
        }


    }

}