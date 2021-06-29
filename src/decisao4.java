import java.util.Scanner;

public class decisao4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma letra");
        String letra = scan.next();

        if ("a".equalsIgnoreCase(letra)){
            System.out.println("vogal");
        }
        else if ("e".equalsIgnoreCase(letra)){
            System.out.println("vogal");
        }
        else if ("i".equalsIgnoreCase(letra)){
            System.out.println("vogal");
        }
        else if ("o".equalsIgnoreCase(letra)){
            System.out.println("vogal");
        }
        else if ("u".equalsIgnoreCase(letra)){
            System.out.println("vogal");
        }
        else System.out.println("consoante");


    }
}