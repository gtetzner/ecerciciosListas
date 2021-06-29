import java.util.Scanner;

public class casetest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String dia;
        switch (x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";

            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }
        System.out.println("" + dia);


    }
}


