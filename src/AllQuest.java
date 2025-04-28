import java.util.Scanner;
public class AllQuest {
    public static class Questao7{
        public void torf(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("escolha uma opção:");
            System.out.println("1 - VERDADEIRO");
            System.out.println("2 - FALSO");
            System.out.println("digite 1 ou 2: ");
            Integer vf1 = scanner.nextInt();
            System.out.println("digite 1 ou 2: ");
            Integer vf2 = scanner.nextInt();
            Boolean valor_1 = (vf1.equals(1));
            Boolean valor_2 = (vf2.equals(1));

            if (valor_1.equals(valor_2)) {
                if (valor_1){
                    System.out.println("Ambos são verdadeiros");
                } else {
                    System.out.println("Ambos são falsos");
                }
            } else {
                System.out.println("Os valores são diferentes");
            }
        }
    }
    public static class Questao6{
        public void reajustar(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite o valor para ser reajustado: ");
            Float valor = scanner.nextFloat();
            Float reajuste = valor + ((float) (valor *0.05));
            System.out.println("O valor reajustado ficou: "+ reajuste);
        }
    }
    public static class Quest_5 {
        public void calcular(){
            Scanner scanner = new Scanner(System.in);
            double salario_min = 1293.20;
            System.out.println("Digite seu salário: ");
            double salario_user = scanner.nextDouble();
            double quantidade_de_salarios = salario_user / salario_min;
            System.out.println("você ganha: "+quantidade_de_salarios+" salario(os) minimo(os).");
        }
    }
}
