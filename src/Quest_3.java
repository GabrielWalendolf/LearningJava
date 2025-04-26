import java.util.Scanner;

public class Quest_3 {
    //3 - Faça um algoritmo que leia dois valores inteiros A e B,
    // se os valores de A e B forem iguais, deverá somar os dois valores,
    //caso contrário devera multiplicar A por B.
    // Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    //imprimir seu valor na tela.
    public void calcular(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        Integer A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        Integer B = scanner.nextInt();

        if (A.equals(B)){
            Integer C = A + B;
            System.out.println(C);
        } else {
            Integer C = A * B;
            System.out.println(C);
        }

    }


}
