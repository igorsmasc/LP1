import java.util.Scanner;

public class PTEXTRA_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a = scan.next().charAt(0);

        System.out.println("Valor: " + a);

        scan.close();

        // Consumir 1 char
        // char c = scan.findInLine(".").charAt(0);
        // char c = scan.next(".").charAt(0);

        // System.exit(0)
    }
}
