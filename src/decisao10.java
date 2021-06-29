import java.util.Scanner;

public class decisao10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letra;

        System.out.println("digite a incial do turno em que estuda");
        letra = scan.nextLine();

        if ("m".equalsIgnoreCase(letra)){
            System.out.println("Bom dia!!");
        }
        else if ("v".equalsIgnoreCase(letra)){
            System.out.println("Boa tarde!!");
        }
        else if ("n".equalsIgnoreCase(letra)){
            System.out.println("Boa noite");
        }
    }
}
