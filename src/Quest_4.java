import java.util.Scanner;

public class Quest_4 {
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
