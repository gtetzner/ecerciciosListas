import java.util.Scanner;

public class decisao3 {
    public static void main (String[] args) {
        String letra;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a inicial do seu genero");
        letra = scan.next();

        if ("f".equalsIgnoreCase(letra) ){
            System.out.println("sexo feminino");
        }
        else if ("m".equalsIgnoreCase(letra)){
            System.out.println("sexo masculino");
        }
        else if ("t".equalsIgnoreCase(letra)){
            System.out.println("trassexual");
        }
        else {
            System.out.println("sexo invalido");
        }
    }
}
