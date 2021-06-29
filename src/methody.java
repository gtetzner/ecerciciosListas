import java.util.Scanner;

class main {
    static void myMethod(int n1, int n2) {
        System.out.println("a soma dos dois numeros é "+(n1+n2));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite dois numeros");
        myMethod(scan.nextInt(), scan.nextInt());
    }
}
