import java.util.Scanner;

public class Par_Impar_Pos_Neg {
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
