import java.util.Scanner;

public class repetiçao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        System.out.println("digite um nome");
        nome = scan.next();

        while (nome.length() < 3){
            System.out.println("seu nome tem quer mais de 3 caracteres");
            scan.next();

        }
        System.out.println("nome registrado com sucesso");
    }
}
