import java.util.Scanner;
public class test {
    int g=6;
    int r=8;
    int a=7;


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = 5;
        int s = in.nextInt();
        int b = 6;
        int c = a + b;
        int d = in.nextInt() + 5 ;
        System.out.print( d * c);
        System.out.print( d + c);
        System.out.print( b + a);
        System.out.print( a + c);
    }
}
