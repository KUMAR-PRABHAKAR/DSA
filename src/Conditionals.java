import java.util.Scanner;

/*||||||||||||||||||||||||||||||||||||||||||||||||1st Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


//Take age Input and Print if he/she is eligible to vote or not.


/*  public class Conditionals {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        Scanner secondEntry = new Scanner(System.in);
        System.out.println("Enter your sex");
        String sex = secondEntry.nextLine();

        if (sex == "Male") {

            if (age >= 18) {
                System.out.println("You're a Male Candidate & eligible to Vote");
            } else {
                System.out.println("You're  a Male Candidate & not eligible to Vote");
            }
        }
    }
    else{
        if (age >= 18) {
            System.out.println("You're a Female Candidate & eligible to Vote");
        } else {
            System.out.println("You're  a Female Candidate & not eligible to Vote");
        }

    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||2nd Approach|||||||||||||||||||||||||||||||||||||||||||||||||||*/


/*import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        // Clear the buffer after nextInt()
        sc.nextLine();

        System.out.println("Enter your sex (Male/Female)");
        String sex = sc.nextLine();

        // Use .equalsIgnoreCase to be safe with "male" vs "Male"
        if (sex.equalsIgnoreCase("Male")) {
            if (age >= 18) {
                System.out.println("You're a Male Candidate & eligible to Vote");
            } else {
                System.out.println("You're a Male Candidate & not eligible to Vote");
            }
        }
        else {
            if (age >= 18) {
                System.out.println("You're a Female Candidate & eligible to Vote");
            } else {
                System.out.println("You're a Female Candidate & not eligible to Vote");
            }
        }
    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||2nd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Take input of 5 subjects marks and print the overall percentage of student.

/*
public class Conditionals {
    public static void main(String[] args) {

        int subsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter All the 5 Subjects marks");
        int Subject1Marks = sc.nextInt();
        int Subject2Marks = sc.nextInt();
        int Subject3Marks = sc.nextInt();
        int Subject4Marks = sc.nextInt();
        int Subject5Marks = sc.nextInt();

        subsum =  Subject1Marks + Subject2Marks + Subject3Marks + Subject4Marks + Subject5Marks;
        int Percentage = (subsum*100)/250;
        System.out.println("The Percentage is: "+Percentage);


    }

}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||3rd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/

// Take Input a lowercase character and print it's uppercase version.


/*
public class Conditionals {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Character");
       char lowercase = sc.next().charAt(0);
       //char uppercase = Character.toUpperCase(lowercase);

       char uppercase = (char) (lowercase-32);// ---Converting using ASCII Difference----

       System.out.println("The Uppercase is "+uppercase);


    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||4th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Take Input an uppercase character and print it's lowercase version.

/*

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char uppercase = sc.next().charAt(0);
        //char lowercase = Character.toLowerCase(uppercase);

        char lowercase = (char) (uppercase+32);// ---Converting using ASCII Difference----

        System.out.println("The Lowercase is "+lowercase);


    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||5th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Take input of 5 subjects marks,exclude the least scoring subject's marks and
// calculate the overall percentage considering the top 4 Subjects marks and print it.

public class Conditionals {
    public static void main(Strings[] args) {

        int subsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter All the 5 Subjects marks");
        int Subject1Marks = sc.nextInt();
        int Subject2Marks = sc.nextInt();
        int Subject3Marks = sc.nextInt();
        int Subject4Marks = sc.nextInt();
        int Subject5Marks = sc.nextInt();

       //Finding least scored Subject
         int min = Subject1Marks;
         if(Subject2Marks < min) min = Subject2Marks;
         if(Subject3Marks < min) min = Subject3Marks;
         if(Subject4Marks < min) min = Subject4Marks;
         if(Subject5Marks < min) min = Subject5Marks;

         subsum =  Subject1Marks + Subject2Marks + Subject3Marks + Subject4Marks + Subject5Marks;
         int best4Subjects = subsum - min;
         int Percentage = (best4Subjects*100)/200;
            System.out.println("The Percentage is: "+Percentage);






    }

}





