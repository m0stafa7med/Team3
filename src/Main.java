
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static String[] arr;
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        arr = new String[siz];

        System.out.println("Enter array elements:");
        	for(int i=0;i<siz;i++)
                arr[i] = sc.next();


        printMenu();
        int choice = sc.nextInt();
        sc.close();
        switch (choice){
            case 1: // Reverse Array
         reverse (arr);
                break;

            case 2: // Check palindrome
            	CheckPalindrome(arr);
                break;

            case 3: // Sort

                break;

            case 4: // Check Sorted

                break;

            case 5: // Get the maximum 3 numbers

                break;

            case 6: // Most repeated value
                most_Repeated_Value(arr);
                break;

            case 7: // Get median

                break;

            case 8: // Shuffle

                break;

            case 9: // Find smallest prime

                break;

            case 10: // Get the minimum 3 numbers

                break;

            case 11: // Distnict Array

                break;

            case 12: // Zero if less than zero

                break;

            case 13: // Count primes

                break;

            case 14: // Return only primes

                break;

            case 15: // Find Largest Prime

                break;

            case 16: // Shift Array

                break;

            case 17: // Get Average

                break;

            case 18: //execute all
            	CheckPalindrome(arr);
            	 most_Repeated_Value(arr);
            	  reverse (arr);

                break;
        }

    }

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tReverse Array");
        System.out.println("2-\tCheck palindrome");
        System.out.println("3-\tSort");
        System.out.println("4-\tCheck Sorted");
        System.out.println("5-\tGet the maximum 3 numbers");
        System.out.println("6-\tMost repeated value");
        System.out.println("7-\tGet median");
        System.out.println("8-\tShuffle");
        System.out.println("9-\tFind smallest prime");
        System.out.println("10-\tGet the minimum 3 numbers");
        System.out.println("11-\tDistnict Array");
        System.out.println("12-\tZero if less than zero");
        System.out.println("13-\tCount primes");
        System.out.println("14-\tReturn only primes");
        System.out.println("15-\tFind Largest Prime");
        System.out.println("16-\tShift Array");
        System.out.println("17-\tGet Average");
        System.out.println("18-\tExecute All");

    }



    public static void CheckPalindrome(String arr[])
    {

        String[] reverse = new String[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
	        reverse[i] = arr[arr.length - i - 1];
        }
	    Boolean isPal = Arrays.toString(arr).equals(Arrays.toString(reverse));

	    if (isPal)
	        System.out.println("Entered string is a palindrome.");
	    else
	        System.out.println("Entered string isn't a palindrome.");
    }

    static void most_Repeated_Value(int arr[])
    {
        // Name : Islam Ibrahim Amin
        // ID   : 20160320

        Arrays.sort(arr);
        int n = arr.length;
        int max_count = 1, result = arr[0];
        int current_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                current_count++;
            else {
                if (current_count > max_count) {
                    max_count = current_count;
                    result = arr[i - 1];
                }
                current_count = 1;
            }
        }
        System.out.printf("most repeated Value is : %d\n", result);
        System.out.printf("Repeated times is : %d\n",max_count);
    }

    static void reverse (int []arr){
        ArrayList arr2 = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++ )
            arr2.add(arr[i]);
        for(int i = 1 ; i <= arr.length ; i++ )
            arr[i-1] = (int) arr2.get(arr.length-i);
    }


}
