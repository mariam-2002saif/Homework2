import java.util.Scanner;
//Area and perimeter of a circle.
public class Q2 {
    public static void main(String[] args) {
        double r;
        System.out.println("Please enter the value of radius ");
        Scanner input=new Scanner(System.in);
        r=input.nextDouble();
        System.out.println("Area= "+(r*r*3.14));
        System.out.println("Perimeter ="+(2*r*3.14));
    }
}
