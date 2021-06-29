import java.util.Scanner;

public class listaquatro2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numero = new double[10];
        System.out.println("digite 5 numeros");

        for (int i =0; i<numero.length; i++){
            numero[i] =scan.nextDouble();

        }
        for (int i =9; i>=0; i--){
            System.out.println(numero[i]);

        }
    }
}

