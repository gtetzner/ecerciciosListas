import java.util.Scanner;

public class repetiçao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario;
        String senha;
        System.out.println("digite o seu usuario");
        usuario = scan.next();

        System.out.println("digite a sua senha");
        senha = scan.next();

        while (usuario.equalsIgnoreCase(senha)){
            System.out.println("usuario e senha, nao podem ser iguais");
            scan.next();


        }
        System.out.println("usuario e senha registrado com sucesso");
    }
}
