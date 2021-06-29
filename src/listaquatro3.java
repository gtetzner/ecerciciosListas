import java.util.Scanner;

public class listaquatro3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []numero = new int[4];

        System.out.println("digite as notas");
        for (int i =0; i<numero.length;i++){
            numero[i] = scan.nextInt();
            int soma = numero[0] ;
        }

        for (int i = 0; i<numero.length; i++){
            int soma = numero[0] + numero[1] + numero[2] + numero[3];
            int media = soma/4;
            System.out.println("a soma foi " +soma  +" a media foi " + media);
        }

    }
}
