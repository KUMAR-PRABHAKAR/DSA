/*||||||||||||||||||||||||||||||||||||||||||||||||1st Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find minValue in a 2D array and print the output.

/*

public class Array {
    public static void main(String[] args) {

        int arr[][] = {{1,-5,4}, {3,97,-7}};
        int n = arr.length;
        int minValue = arr[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <arr[i].length; j++) {
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
            }
        }
        System.out.print(minValue);


    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||2nd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find maxValue in a 2D array and print the output.

/*

public class Array {
    public static void main(String[] args) {

        int arr[][] = {{1,-5,94}, {3,97,-7}};
        int n = arr.length;
        int maxValue = arr[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <arr[i].length; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.print(maxValue);


    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||3rd Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find sum of elements of a 2D array and print the sum as output.

/*

public class Array {
    public static void main(String[] args) {

        int arr[][] = {{1,5,4}, {3,27,-7}};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                int value = arr[i][j];
                   sum = sum + value;
            }
        }
        System.out.print(sum);


    }
}


*/

/*||||||||||||||||||||||||||||||||||||||||||||||||4th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find multiply of elements of a 2D array and print the multiplication as output.

/*

public class Array {
    public static void main(String[] args) {

        int arr[][] = {{1,5,4}, {3,2,4}};
        int n = arr.length;
        int multiple = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                int value = arr[i][j];
                multiple = multiple * value;
            }
        }
        System.out.print(multiple);


    }
}


*/


/*||||||||||||||||||||||||||||||||||||||||||||||||5th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find multiply of elements of a 1D array and print the multiplication as output.

/*

public class Array{
    public static void main(String[] args){
        int arr[] = {2,5,7,3,10};
        int n  = arr.length;
        int multiple = 1;
        for(int i=0; i<n; i++){
            int value = arr[i];
            multiple = multiple * value;
        }
        System.out.println(multiple);

    }
}


*/

/*||||||||||||||||||||||||||||||||||||||||||||||||6th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find sum of elements of a 1D array and print the sum as output.

/*

public class Array{
    public static void main(String[] args){
        int arr[] = {2,5,7,3,10};
        int n  = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println(sum);

    }
}

*/


/*||||||||||||||||||||||||||||||||||||||||||||||||7th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find minValue in a 1D array and print the output.

/*

public class Array {
    public static void main(String[] args) {
        int arr[] = {3,6,-2,10,-5,8};
        int n = arr.length;
        int minValue =arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Minimum value is "+minValue);
    }
}

*/

/*||||||||||||||||||||||||||||||||||||||||||||||||8th Question|||||||||||||||||||||||||||||||||||||||||||||||||||*/


// Write a code to find maxValue in a 1D array and print the output.

public class Array {
    public static void main(Strings[] args) {
        int arr[] = {3,6,-2,10,-5,8};
        int n = arr.length;
        int maxValue =arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Minimum value is "+maxValue);
    }
}









