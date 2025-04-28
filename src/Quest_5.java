import java.util.Scanner;

public class Quest_5 {

    public void calcular(){
        Scanner scanner = new Scanner(System.in);
        double salario_min = 1293.20;

        System.out.println("Digite seu salário: ");
        double salario_user = scanner.nextDouble();

        double quantidade_de_salarios = salario_user / salario_min;

        System.out.println("você ganha: "+quantidade_de_salarios+" salario(os) minimo(os).");
    }


}
