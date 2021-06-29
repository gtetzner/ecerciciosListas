import java.util.Scanner;

public class exerc9 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("diigite a temperatura em fahrenheit");


        double f = scan.nextDouble();
        double c =  5 * ((f-32) / 9);



        System.out.println("a temperatura é"+c);
    }
}
