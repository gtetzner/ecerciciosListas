import java.util.Scanner;

public class exeerc6 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o raio do círculo:");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2 );

        System.out.println("A area do círculo é: " + area);

    }
}
