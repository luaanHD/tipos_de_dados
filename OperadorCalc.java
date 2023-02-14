import java.util.Scanner;

public class OperadorCalc {
    //colete dois números do teclado
    //faça as 5 operações matemáticas
    //declare também as variáveis soma, mult, divisão, resto, subtração

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        double divisao;
        double soma;
        double subtracao;
        double multiplicacao;
        double resto;

        System.out.println("Digite o primeiro número");
        n1=entrada.nextInt();

        System.out.println("Digite o segundo número");
        n2= entrada.nextInt();

        soma=n1 + n2;
        System.out.println("A soma dos dois números digitados: " + soma);
        
        subtracao=n1 - n2;
        System.out.println("A subtração dos dois números digitados: " + subtracao);

        multiplicacao=n1 * n2;
        System.out.println("A multiplicação dos dois números digitados: " + multiplicacao);

        divisao=n1 / n2;
        System.out.println("A divisão dos dois números digitados: " + divisao);

        resto=n1 % n2;
        System.out.println("O resto da divisão desses dois números: " + resto);
        entrada.close();
    }
    
    
}
