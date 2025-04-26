public class Main {
    public static void main(String[] args)
    {
        /*
        var r1 = new Retangulo();
        var r2 = new Retangulo();
        System.out.println(r1);
        System.out.println(r2);
        //r1 -> guarda endereço de memória 0x010101
        System.out.println(r1==r2);
        System.out.println(r1.equals(r2));
        // hashCode->transforma o objeto em um único número
        System.out.println(r1.hashCode());



        // Questão 1
        Soma_ABC soma_1 = new Soma_ABC(); //Cria um objeto da classe
        soma_1.opcoes(); //Acessa o mét0do da classe opcoes()


        // Questão 2
        Par_Impar_Pos_Neg verification_1 = new Par_Impar_Pos_Neg();
        verification_1.verificar();


        // Questão 3
        Quest_3 quest3 = new Quest_3();
        quest3.calcular();

        // Questão 4
        Quest_4 quest4 = new Quest_4();
        quest4.antecessor_sucessor();
        */

        // Questão 5
        // Teste
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(200);
        conta1.getSaldo();
        conta1.printar_saldo();


    }
}