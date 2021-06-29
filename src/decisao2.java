import java.util.Scanner;

public class decisao2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor;

        System.out.println("digite um valor");
        valor = scan.nextDouble();
        if (valor >0){
            System.out.println("valor positivo");
        }
        else {
            System.out.println("valor negativo");
        }
    }
}
