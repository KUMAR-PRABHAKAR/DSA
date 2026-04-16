/*||||||||||||||||||||||||||||||||||||||||||||||||1st Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/

// Print counting from 1 to n.

/*

public class Loops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till which you want the counting");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

    }

}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||2nd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/

// Print counting from n to 1.

/*

public class Loops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from which you want the counting till 1");
        int n = sc.nextInt();
        for(int i = n ; i >= 1; i--){
            System.out.println(i);
        }

    }

}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||3rd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print the 10 multiples of n.


/*

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to write 10 multiples of it");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

        }

    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||4th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print your name 100 times.

/*

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Input");
        String name = sc.next();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+ "." + "My name is Kumar Prabhakar");

        }

    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||5th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print all Prime number from 1 to 100.

/*

public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println(i + "is a Prime Number");
            }

        }

    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||6th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print all even number from 1 to 100.

/*

public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
           if (i % 2 == 0){
               System.out.println(i + " is an even number");

           }

        }

    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||7th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print the sum of all the numbers from 1 to n.


/*


public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number till which you want the sum :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum is" +" "+ sum );

    }
}



*/

/*||||||||||||||||||||||||||||||||||||||||||||||||7th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Print the all the integers in range from 50 to 100, that are perfectly divisible by 7.


public class Loops {
    public static void main(Strings[] args) {

        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0){
                System.out.println(i + " is perfectly divisible by 7");

            }

        }

    }
}














