public class Swap {
    public static void main(String[] args) {
        // Method 1: Using XOR swap (demonstrates the algorithm)
        System.out.println("=== XOR Swap Demo ===");
        swapAndPrint(1, 3);
        
        // Method 2: Using array to actually swap values
        System.out.println("\n=== Array Swap Demo ===");
        int[] numbers = {1, 3};
        System.out.println("Before swap: a = " + numbers[0] + ", b = " + numbers[1]);
        swapArray(numbers);
        System.out.println("After swap: a = " + numbers[0] + ", b = " + numbers[1]);
    }
    
    // XOR swap method - demonstrates the algorithm but doesn't modify original variables
    static void swapAndPrint(int num, int num1){
        System.out.println("Before swap: a = " + num + ", b = " + num1);
        
        // XOR swap algorithm
        num = num ^ num1;   // num now contains XOR of both numbers
        num1 = num ^ num1;  // num1 becomes original num
        num = num ^ num1;   // num becomes original num1
        
        System.out.println("After swap: a = " + num + ", b = " + num1);
    }
    
    // Method to actually swap values using array (pass by reference)
    static void swapArray(int[] arr) {
        if (arr.length >= 2) {
            // Using temporary variable method
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
}
