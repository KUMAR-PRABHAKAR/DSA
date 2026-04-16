import java.lang.*;


/*||||||||||||||||||||||||||||||||||||||||||||||||1st Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Create a method PrintWelcomeMessage() that prints a greeting.

/*
public class Method {
    public static void PrintWelcomeMessage() {
        System.out.println("Welcome To the squad Kumar Prabhakar");
    }

    // Standard main method signature
     public static void main(String[] args) {
        PrintWelcomeMessage();
        System.out.print("Hello gys")
    }
}





/*||||||||||||||||||||||||||||||||||||||||||||||||2nd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Create a method Add(int a, int b) that returns the sum.

/*

public class Method {

    // Method 1: Outside of Main
    static int Add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Method 2: Separate from Add, but inside the class
    public static void main(String[] args) {
        int result = Add(15, 50);
        System.out.println("The sum is: " + result);
    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||3rd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Create a method IsEven(int num) that returns true if number is even.


/*


public class Method{
    public static boolean IsEven(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean number = IsEven(20);
        System.out.println(number);
    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||4th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Create a method GetMaximum(int a, int b) that returns the larger number.

/*

public class Method{
    public static int GetMaximum(int a,  int b){
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        int maxNum = GetMaximum(15,6);
        System.out.println(maxNum);
    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||5th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Create a method CalculatePercentage(int obtained, int total).

/*


public class Method{
    public static int CalculatePercentage(int obtained, int total) {
        int percentage = (obtained*100)/ total;
        return percentage;
    }
    public static void main(String[] args) {
        int gotpercentage = CalculatePercentage(75,150);
        System.out.println(gotpercentage);

    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||6th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Create an overloaded method Display() with one int parameter or one string parameter.

/*

public class Method{
    public static int Display(int a){
        return a;
    }
    public static String Display(String Name){
        return Name;
    }
    public static void main(String[] args){
        String call = Display( "Kumar Prabhakar");
        System.out.println(call);

        int callint = Display(29);
        System.out.println(callint);
    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||7th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a method updateValue(int x) and verify that original variable in main() does not change.


public class Method{
    public static void updateValue(int x){
        System.out.println("2. The value is inherited from main method: "+x);
         x =4*x;
        System.out.println("3. This belongs to the updatevalue method: "+x);
    }
    public static void main(Strings[] args){
        int num = 5;
        System.out.println("1. The num is: "+ num);
        updateValue(num);
        System.out.println("4.This num belongs to main function: "+num);
    }
}





