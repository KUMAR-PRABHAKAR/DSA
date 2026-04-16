
import java.util.Scanner;


/*||||||||||||||||||||||||||||||||||||||||||||||||1st Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' solid square pattern.


/*

public class Pattern_Printing {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){ //outer loop which will traverse the num of rows
            for(int j=1; j<=n; j++){ //inner loop which will print * for the columns
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||2nd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' solid rectangle pattern.

/*


public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){  //outer loop which will traverse the num of rows
            for(int j=1; j<=n+1; j++){  //inner loop which will print * for the columns (n+1 so that it prints 1 star more than row to make it a rectangle)
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}


*/

/*||||||||||||||||||||||||||||||||||||||||||||||||3rd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' solid right angle Triangle pattern.


/*

public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){  //outer loop which will traverse the num of rows
            for(int j=1; j<=i; j++){  //inner loop which will print * for the columns
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||4th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' Inverted solid right angle Triangle pattern.

/*

public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){  //outer loop which will traverse the num of rows
            for(int j=1; j<=n-i+1; j++){  //inner loop which will print * for the columns
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||5th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' solid Pyramid pattern.

/*


public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row =1; row<=n; row++){  //outer loop which will traverse the num of rows

            //for printing spaces
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            //for printing stars
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||6th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' Inverted solid Pyramid pattern.

/*

public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row =1; row<=n; row++){  //outer loop which will traverse the num of rows

            //for printing spaces
            for(int col=1; col<=row-1; col++){
                System.out.print("  ");
            }

            //for printing stars
            for(int col=1; col<=2*n-2*row+1; col++){
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||7th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/

/*

// Print '*' solid parallelogram pattern1.


public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row =1; row<=n; row++){  //outer loop which will traverse the num of rows

            //for printing spaces
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }

            //for printing stars
            for(int col=1; col<=n; col++){
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||8th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' solid parallelogram pattern2.

/*

public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row =1; row<=n; row++){  //outer loop which will traverse the num of rows

            //for printing spaces
            for(int col=1; col<=row-1; col++){
                System.out.print("  ");
            }

            //for printing stars
            for(int col=1; col<=n; col++){
                System.out.print("*  ");
            }
            System.out.println(); // moving to the next line
        }
    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||9th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' hollow square/rectangle pattern.

/*

public class Pattern_Printing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int col = 1; col <= n; col++) {
            for (int row = 1; row <= n; row++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                }
                else{                           // Note-: Number of spaces taken to print the output should be same.
                        System.out.print("  "); // including the print character(*) in both output.
                    }
            }
            System.out.println();
        }

    }
}


*/

/*||||||||||||||||||||||||||||||||||||||||||||||||10th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' hollow rightangle triangle pattern.

/*


public class Pattern_Printing  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row=1; row<=n; row++) {
            if(row==1 || row==2 || row==n) {
                for(int col=1; col<=row; col++) {
                    System.out.print("* ");
                }
            }
            //middle rows logic (* _ _ _ _ *)
            else{
                //printing 1 star first, in the row (like this *
                System.out.print("* ");

                //printing spaces between the stars (like this * _ _ _ _
                for(int col=1; col<=(row-2); col++) {
                    System.out.print("  ");
                }
                //printing the last star of the row (like this * _ _ _ _ *)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||11th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' hollow triangle pattern.

/*


public class Pattern_Printing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                //printing 1 star first, in the row (like this *
                System.out.print("* ");

                //printing spaces between the stars (like this * _ _ _ _
                for (int col = 1; col <= (2*row - 3); col++) {
                    System.out.print("  ");
                }
                //printing the last star of the row (like this * _ _ _ _ *)
                System.out.print("* ");
            }
             System.out.println();
        }

    }

}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||12th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' Solid Diamond pattern.

/*


public class Pattern_Printing {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {  //outer loop which will traverse the num of rows

            //for printing spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            //for printing stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println(); // moving to the next line
        }

            for (int row = 1; row <= n; row++) {  //outer loop which will traverse the num of rows
                if (row == 1) {
                    continue;
                }
                //for printing spaces
                for (int col = 1; col <= row - 1; col++) {
                    System.out.print("  ");
                }

                //for printing stars
                for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                    System.out.print("* ");
                }
                System.out.println(); // moving to the next line
            }
    }
}


*/

/*||||||||||||||||||||||||||||||||||||||||||||||||13th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print '*' hollow Diamond pattern.


public class Pattern_Printing {
    public static void main(Strings[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            if (row == 1) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                //printing 1 star first, in the row (like this *
                System.out.print("* ");

                //printing spaces between the stars (like this * _ _ _ _
                for (int col = 1; col <= (2*row - 3); col++) {
                    System.out.print("  ");
                }
                //printing the last star of the row (like this * _ _ _ _ *)
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= (n-1); row++) {


            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            if(row == (n-1)){
                System.out.print("* ");
            }
            else{
                System.out.print("* ");

                for (int col = 1; col <= 2*(n-row)-3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

































































