import java.lang.*;
import java.lang.String;

void main() {
    System.out.println("Hello World");

    // Define variables

    int num = 123;
    long num1 = 32433;
    float num2 = 123.45f;
    double num3 = 123.456;
    char alphabet = 'a';
    boolean Boy = true;


    // How to take input in Java
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt(); // Integer Data Type
    long number = sc.nextLong(); // Long Data Type
    float price = sc.nextFloat(); // Float Data type
    double percentage = sc.nextDouble(); // Double Data Type
    boolean answer = sc.nextBoolean(); // Boolean Data Type
    char color = sc.next().charAt(0); // Char Data Type
    String namePlace = sc.nextLine(); // String for 2 or more words
    String name = sc.next(); // String 1 word

}
