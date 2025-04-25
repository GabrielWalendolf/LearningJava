import java.util.Scanner;
public class Ajuda_Calc_ARC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Conversor de Bases ===");
            System.out.println("1. Decimal para Binário, Hexadecimal e Octal");
            System.out.println("2. Binário para Decimal");
            System.out.println("3. Hexadecimal para Decimal");
            System.out.println("4. Octal para Decimal");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número decimal: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Binário: " + Integer.toBinaryString(decimal));
                    System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                    System.out.println("Octal: " + Integer.toOctalString(decimal));
                    break;
                case 2:
                    System.out.print("Digite um número binário: ");
                    String binario = scanner.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(binario, 2));
                    break;
                case 3:
                    System.out.print("Digite um número hexadecimal: ");
                    String hexa = scanner.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(hexa, 16));
                    break;
                case 4:
                    System.out.print("Digite um número octal: ");
                    String octal = scanner.nextLine();
                    System.out.println("Decimal: " + Integer.parseInt(octal, 8));
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}

