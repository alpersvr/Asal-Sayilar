import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;
        System.out.println("Please enter a number");
        number=input.nextInt();
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Number is not prime");
            return;
            //sfsff
        }
        if (number < 1) {
            System.out.println("Invalid number");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number +" is prime number");
        }
    }
}