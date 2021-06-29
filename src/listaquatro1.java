import java.util.Scanner;

public class listaquatro1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double[] numero = new double[5];
            System.out.println("digite 5 numeros");

            for (int i =0; i<numero.length; i++){
                numero[i] =scan.nextDouble();

            }
            for (int i =0; i<numero.length; i++){
                System.out.print(numero[i]);

            }
        }
}
