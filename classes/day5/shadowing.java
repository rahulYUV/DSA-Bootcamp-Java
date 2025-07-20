import java.util.Arrays;

public class shadowing {
    static int x= 25;
        public static void main(String[] args) {    
            int x =346;
            System.out.println(x);

            // var lenth argument knows are varargs method
           
    }
    // function loading 
    static void fun(){

    }
    static void fun(int a ){
        

    }
    static void fun(int ...v){
        int[] arr={v};
        System.out.println(Arrays.toString(arr));
    }
}
/*
 * Shadowing in Java occurs when a variable declared within a specific scope has the same name as a variable declared in an outer scope. In such cases, the inner variable "shadows" or hides the outer variable, making the outer variable temporarily inaccessible within that inner scope. 
Key aspects of shadowing:
Scope:
Shadowing is directly related to variable scope. A variable in a more localized scope (e.g., a method's local variable) can shadow a variable in a broader scope (e.g., an instance variable).
Same Name:
The core requirement for shadowing is that both variables have the exact same name.
Accessibility:
Within the inner scope where shadowing occurs, the inner variable takes precedence, and any reference to that variable name will refer to the inner variable. To access the shadowed outer variable, one typically needs to use this (for instance variables) or the class name (for static variables).
 */