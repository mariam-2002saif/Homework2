import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("please enter two number");
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1=");
        n1=input.nextInt();
        System.out.println("Enter number 2=");
        n2=input.nextInt();
        System.out.println("number1+number2 ="+(n1+n2));
        System.out.println("number1-number2 ="+(n1-n2));
        System.out.println("number1*number2 ="+(n1*n2));
        System.out.println("The average ="+((n1+n2)/2));
        System.out.println("The distance ="+Math.abs(n1-n2));
        System.out.println("The maximum ="+Math.max(n1,n2));
        System.out.println("The minimum ="+Math.min(n1,n2));

    }
}
