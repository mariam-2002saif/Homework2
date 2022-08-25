import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double n;

        System.out.println("Please enter the number ");
        Scanner input=new Scanner(System.in);
        n=input.nextDouble();
        System.out.println("The Square ="+n*n);
        System.out.println("The Cube ="+n*n*n);
        System.out.println("The Fourth Power ="+Math.pow(n,4));
    }
}
