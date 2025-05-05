import java.util.Scanner;

public class Lampada {
    Scanner scanner = new Scanner(System.in);
    //atribyto
    boolean ligada_ou_deligada;
    // metodo
    public void ligar_desligar(){
        System.out.println("Ligar: True \n Desligar: False \n Opcao: ");
        boolean ligada_ou_deligada = scanner.nextBoolean();
        System.out.println(ligada_ou_deligada);
    }
}
