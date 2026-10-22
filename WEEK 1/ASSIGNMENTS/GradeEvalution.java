import java.util.Scanner;
public class GradeEvalution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Grade Evalution");
        System.out.println("Enter Student Mark: ");
        int mark=sc.nextInt();
        if(mark>80){
            System.out.println("Grade : A");
        }
        else if(mark>70){
            System.out.println("Grade : B");
        }
        else if(mark>=50){
            System.out.println("Grade : C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
