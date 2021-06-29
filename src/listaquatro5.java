import java.util.Scanner;

public class listaquatro5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    //Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
        // Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
        int []vetorPar = new int[5];
        int []vetorImpar = new int[5];
        int []vetor = new int[5];
        System.out.println("digite 20 numeros");

        for (int i =0; i<vetorImpar.length;i++){
            if(vetorPar[i] % 2 == 0)
            vetorImpar[i] =scan.nextInt();
        }
        for (int i =0; i<vetorImpar.length;i++) {
            System.out.println(vetorImpar[i]);
        }
} }