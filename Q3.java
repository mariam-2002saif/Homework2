import java.util.Scanner;
//Area and perimeter of arectangle.
public class Q3 {
    public static void main(String[] args) {
        double l , w;
        System.out.println("Please enter the value of length ");
        Scanner input=new Scanner(System.in);
        l=input.nextDouble();
        System.out.println("Please enter the value of Width ");
        w=input.nextDouble();
        System.out.println("Area= "+(l*w));
        System.out.println("Perimeter ="+(2*(l+w)));
    }
}
