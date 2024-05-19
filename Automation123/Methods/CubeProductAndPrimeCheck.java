package Methods;

import java.util.Scanner;

public class CubeProductAndPrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int cubeProduct = calculateCubeProduct(num);
        
        System.out.println("Product of cube of digits: " + cubeProduct);
        
        if (isPrime(cubeProduct)) {
            System.out.println(cubeProduct + " is a prime number.");
        } else {
            System.out.println(cubeProduct + " is not a prime number.");
        }
    }

    // Method to calculate the product of cube of each digit
    public static int calculateCubeProduct(int num) {
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            product = product*(digit * digit * digit);
            num = num/10;
        }
        return product;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
    	 if (num <= 1) {
             return false;
         }
         if (num <= 3) {
             return true;
         }
         if (num % 2 == 0 || num % 3 == 0) {
             return false;
         }
         for (int i = 5; i * i <= num; i += 6) {
             if (num % i == 0 || num % (i + 2) == 0) {
                 return false;
             }
         }
        return true;
    }
}


