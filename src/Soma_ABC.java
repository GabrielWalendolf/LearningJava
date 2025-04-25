import java.util.Scanner;

public class Soma_ABC {
    Scanner scanner = new Scanner(System.in);
    public void opcoes () {
        System.out.println("Digite o valor de A: ");
        Float A =scanner.nextFloat();

        System.out.println("Digite o valor de B: ");
        Float B = scanner.nextFloat();

        System.out.println("Digite o valor de C: ");
        Float C = scanner.nextFloat();

        Float soma = A+B;
        System.out.println("A soma de A + B é: "+soma);
        if (soma < C){
            System.out.println("A soma é menor que C.");
        } else {
            System.out.println("A soma não é menor que C.");
        }

    }

}
