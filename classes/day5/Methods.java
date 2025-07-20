import java.util.Scanner;



public class Methods {
    public static void main(String[] args) {
        // mthod definition 
            Scanner sc  = new Scanner(System.in);
            System.out.println(("enter two numbers"));
            int numb1 = sc.nextInt();
            int numb2 = sc.nextInt();
                System.out.println(numb1+numb2);
                    System.out.println(("this is the sum"+ sum(5,67)));
    }
    public static int sum(int a , int b ){
        int sum =a+b;
        
        return sum;

    }
    // access modifier (oops concept) 
    // return type  funcation name(){
    //  body of the }

}
