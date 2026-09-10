import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {

public static int bSearch(int[] arr, int target, int low, int high) {

// Base case: target is not found
if (low > high) {
return -1;
}

// Find the middle index
int mid = low + (high - low) / 2;

System.out.println("Binary Search: " + low + " " + mid + " " + high); // Prints the indexes and each step to finding the target element

// If target is found at the middle
if (arr[mid] == target) {
return mid;
}

// If target is smaller, search the left half of the array
if (target < arr[mid]) {
return bSearch(arr, target, low, mid - 1); // returns whatever element is in that index
}

// Otherwise, search the right half
return bSearch(arr, target, mid + 1, high); // returns whatever element is in that index
    
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter Array Size: ");
int arraySize = input.nextInt();
int[] numbers = new int[arraySize];

for(int i = 0; i < arraySize ; i++){
    System.out.print("Enter Element #" + i + ": ");
    numbers[i] = input.nextInt();
}

System.out.print("Enter Target Element: ");
int target = input.nextInt();
input.close(); // Closed Scanner

Arrays.sort(numbers);

int result = bSearch(numbers, target, 0, numbers.length - 1 );

System.out.print("Sorted Array: ");
for(int i = 0; i < arraySize ; i++){
    System.out.print(numbers[i] + " ");
}
System.out.println("");

if (result == -1) {
System.out.println("Element not found.");
} 
else {
System.out.println("Element found at index: " + result);
        }
    }
}

/* Description: <Describe what this program does briefly>

Programmed by: Sheire Nyle D Cuevas, BSIT, 48079, Data Structures and Algorithms

Last Modified: September 10, 2026 -- 2:59 PM

Version: 3

[Acknowledgements: Gemini AI - How to sort Arrays, 
                   Gemini AI - how to use input Array size, 
                   Claude AI - "(Whole code paste) + 'What is wrong here???'",
                   Gemini AI - "Is the part with 'Binary Search: low + mid + high' correct??"
]

*/