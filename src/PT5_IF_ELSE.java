public class PT5_IF_ELSE {
    public static void main(String[] args) {

        double nota = 4.9;

        boolean estaAprovado = nota >= 7;

        // Para ser aprovado a nota tem q ser maior ou igual a 7
        if(nota >= 7) {
            System.out.println("Parabéns, voce foi aprovado!");
        } else {
            if(nota >= 5) {
                System.out.println("Voce vai para recuperacao!");
            } else {
                System.out.println("Voce esta reprovado!");
            }
        }

        if(nota >= 7) {
            System.out.println("Parabéns, voce foi aprovado!");
        } else if(nota >=5) {
            System.out.println("Voce vai para recuperacao!");
        } else {
            System.out.println("Voce esta reprovado!");
        }
    }
}
