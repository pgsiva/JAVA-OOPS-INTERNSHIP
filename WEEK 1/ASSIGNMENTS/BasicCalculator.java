import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter operation: ");
        char operation=sc.next().charAt(0);
        if(operation=='+'){
            System.out.println("Addition of two numbers: "+(a+b));
        }
        else if(operation=='-'){
            System.out.println("Subraction of two numbers: "+(a-b));
        }
        else if(operation=='*'){
            System.out.println("Multiplication of two numbers: "+(a*b));
        }
        else if(operation=='/' && b>0){
            System.out.println("Division of two numbers: "+(a/b));
        }
        else if(operation=='/' && b==0){
            System.out.println("Zero division error");
        }
        else if(operation=='%'){
            System.out.println("Modulus of two numbers: "+(a%b));
        }
        else{
            System.out.println("Invalid operation");
        }
    }
}