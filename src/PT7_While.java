public class PT7_While {
    public static void main(String[] args) {
        int i = 20;

        while(i <= 10) {
            System.out.println("Primeiro loop");
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("Segundo loop");
        } while (i <= 10);

    }
}
