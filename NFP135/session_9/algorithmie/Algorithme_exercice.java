// This program applies the algorithms covered in NFP135 (session 9) by solving all the exercises.

// To experiment with different algorithms, I have created public functions for each exercise. 
// This allows calling the functions with desired variables as needed, without conflicting with the other alogrithms.


import java.util.Scanner;

public class Algorithme_exercice {


    // exercice 2: counter: call the function using a pos integer
    public static void counter(int n) {
        while (n >= 0){
            System.out.println("Number: " + n);
            n--;
            }
    }



    // exercice 3: maximum => call the function using an pos. integer to set up the number of inputs asked by the function
    public static void maximum(int n) {
        // initalize the number to 0 for comparison
        int maximum = 0;
        
        // open a scanner to recieve user input
        Scanner scanner = new Scanner(System.in);

        while (n >= 0 ){
            
            System.out.println("Enter a positive integer:");
            int number = scanner.nextInt();

            // if the number is not positive, ask for another number
            if (number < 0) {
                System.out.println("Integer not positive!");
                continue;
            }

            else if (number > maximum) {
                maximum = number;
            }

            System.out.println("The maximum so far is: " + maximum);
            n--;
        }

        // close the scanner to avoid memory leak.
        scanner.close();
    }




    // exercice 5: pass a quantity in kg as parameter (float accepted). The function will then successively input the weight in g until the quantity is reached
    public static void quantity(float n){

        // Parameter checking => return and abord if the parameter < 0.
        if (n < 0) {
            System.out.println("Please check the parameter you passed to the function!");
            return;
        }

        // open a scanner to input the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("You asked for " + n + "kg of potatoes.");

        // converting n in g:
        n *= 1000;

        // initialize the total weight of potatoes:
        int total = 0;

        // initialize potato coutner
        int counter = 0;

        while (total <= n){
            System.out.println("Enter the weight (int in g) of the potato");
            int input = scanner.nextInt();

            // input checking
            if (input <= 0) {
                System.out.println("Please enter a positive integer");
                continue;
            }
            counter += 1;
            total += input;

            System.out.println("You weighed " + counter + " potatoes for a total of " + total + "g");
        }

        // close the scanner
        scanner.close();

        System.out.println("There is " + counter + " potatoes in the bag");
        }


    public static void main() {

        quantity(1);

    }
}