import java.util.Scanner;

public class listaquatro4 {
    public static void main(String[] args) throws Exception {

        char letras[] = new char[10];
        int contador = 1, contVogais = 0, contConsoantes = 0;
        char vogais[] = new char[10];
        char consoantes[] = new char[10];

        for (int n = 0; n < 10; n++) {
            System.out.println("Digite sua " + contador + "°  letra: ");
            Scanner scanner = new Scanner(System.in);
            letras[n] = scanner.next().charAt(0);
            Character.toLowerCase(letras[n]);
            contador++;
        }

        for (int n = 0; n < 10; n++) {

            if (letras[n] == 'a' || letras[n] == 'e'||letras[n] == 'i'||letras[n] == 'o'||letras[n] == 'u'){
                vogais[contVogais] = letras[n];
                contVogais++;
            }
            else{
                consoantes[contConsoantes] = letras[n];
                contConsoantes++;
            }
        }

        System.out.println("Você digitou " + contConsoantes + " consoantes e " + contVogais + " vogais!!" );
        System.out.println("Suas consoantes foram: ");

        for (int n = 0; n < contConsoantes; n++) {
            System.out.println(consoantes[n]);
        }
        System.out.println("Suas vogais foram: ");

        for (int n = 0; n < contVogais; n++) {
            System.out.println(vogais[n]);
        }
    }
}

