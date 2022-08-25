import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int x,y,m;
        System.out.println("The first value X =");
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        System.out.println("The second value Y =");
        y=input.nextInt();
        m=x;
        x=y;
        y=m;
        System.out.println("X="+x);
        System.out.println("y="+y);
    }
}
