public class PT3_Operadores {

    public static void main(String[] args) {

        // Operadores Aritméticos
        // soma (+)
        // subtração (-)
        // divisão (/)
        // multiplicação (*)

        int a = 10;
        int b = 2;

//        System.out.println("Resultado soma = " + (a + b));
//
//        System.out.println("Resultado subtração = " + (a - b));
//
//        System.out.println("Resultado divisão = " + (a / b));
//
//        System.out.println("Resultado multiplicação = " + (a * b));


        // Operadores Lógicos
        // Negação (!)
        // E (&&)
        // OU (||)

        boolean estaChovendo = true;

//        System.out.println("Esta chovendo: " + estaChovendo);
//        System.out.println("Esta chovendo: " + !estaChovendo);

//        System.out.println(true && true); // True = 1 | False = 0
//        System.out.println(true && false); // False
//        System.out.println(false && false); // False

        // Ter dinheiro OU Ter carona
//        System.out.println(true || true); // True
//        System.out.println(true || false); // True
//        System.out.println(false || false); // False
//
//        System.out.println(false && false || true);

        // Operadores Relacionais
        // <, >, ==, >=, <=, !=

        int x = 10;
        int y = 200;

        int nota1 = 10;
        int nota2 = 9;
        double media = (nota1+nota2)/2;

        final int QUANTIDADE_TOTAL_DE_PROVAS = 10;

        double somaTotalDasNotas = 100.0;
        double media2 = somaTotalDasNotas/10; // Magic Number


//        System.out.println();

//        System.out.println(idade >= 18);

//        System.out.println(10 > 200);
//        System.out.println(10 >= 200);
//        System.out.println(10 < 200);
//        System.out.println(10 <= 200);
//        System.out.println(10 == 200);
//        System.out.println(10 != 200);

        // Aritmético Especial
        // Resto (%)

        int a1 = 10;
        int b1 = 3;

        int resultadoResto = a1%b1;

//        System.out.println(resultadoResto);

        // 4 / 2  resto = 0
        // 3 / 2  resto = 1

        int numeroTeste = 11;

//        System.out.println(
//                "O numero " + numeroTeste + " é par: " + (numeroTeste%2 == 0));
//
//
        // Inc - Dec
        // ++ ou --

        int numero = 1;

        //int numeroX = numero++ + 1;
        //System.out.println(numeroX);

        int numeroY = --numero - 1;
        System.out.println(numeroY);



    }

}
