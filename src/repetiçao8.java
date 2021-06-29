import java.util.Scanner;

public class repetiçao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double []numero = new double[5];
        System.out.println("digite 5 numeros");
        for (int i =0; i<numero.length; i++){
            numero[i]= scan.nextDouble();
        }
        double soma = (numero[0] + numero[1] + numero[2] + numero[3] + numero[4]);
        double media = soma/5;

        System.out.println("a soma foi de: " + soma);
        System.out.println("a media foi de: " + media);
        }
    }

