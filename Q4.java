import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double n1,n2,n3,avg;
        System.out.println("Please enter three number " );
        System.out.println("The first number =");
        Scanner input=new Scanner(System.in);
        n1=input.nextDouble();
        System.out.println("The second number =");
        n2=input.nextDouble();
        System.out.println("The third number =");
        n3=input.nextDouble();
        avg=(n1+n2+n3)/3;
        System.out.println("The average ="+avg);

    }
}
