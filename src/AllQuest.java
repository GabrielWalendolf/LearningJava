import java.util.Scanner;

//Objeto que agrupa todas as questões
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
    public static class Quest_4 {
        public void antecessor_sucessor(){
            //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            Integer numero_inteiro = scanner.nextInt();
            Integer antecessor = numero_inteiro - 1;
            Integer sucessor = numero_inteiro + 1;
            System.out.println("o Antecessor desse número é:"+antecessor+" e seu sucessor é: "+sucessor);
        }
    }
    public static class Quest_3 {
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
    public static class Quest_2 {
        Scanner scanner = new Scanner(System.in);
        public void verificar(){
            System.out.println("Digite o número para ser verificado: ");
            Integer numero_verificar = scanner.nextInt();

            Integer verificando_Par_Impar = numero_verificar % 2;
            Boolean verificando_Pos_Neg = numero_verificar < 0;

            if (verificando_Par_Impar!= 0){
                System.out.println("O número foi classificado como: impar");
            } else {
                System.out.println("O número foi classificado como: par");
            }

            if (verificando_Pos_Neg){
                System.out.println("O número foi classificado como: negativo");
            } else {
                System.out.println("O número foi classificado como: positivo");
            }
        }
    }
    public static class Quest_1 {
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
}
