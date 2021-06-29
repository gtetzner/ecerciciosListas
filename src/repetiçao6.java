import java.util.Scanner;

public class repetiçao6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("digite 1 ");
            int numero = scan.nextInt();

            while (numero < 21){
                System.out.print(numero+",");
                numero++;

            }
        }
}
