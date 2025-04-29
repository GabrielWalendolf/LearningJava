public class Main {
    public static void main(String[] args) {
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

        // Simulação de Conta bancária
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(200);
        conta1.getSaldo();
        conta1.printar_saldo();

        // Questão 5
        Quest_5 quest5 = new Quest_5();
        quest5.calcular();

        // Questão 6
        Quest_6 quest6 = new Quest_6();
        quest6.reajustar();

        // Questão 7
        Quest_7 quest7 = new Quest_7();
        quest7.torf();
        */
        //Objeto quest1 criado e utilizado.
//        AllQuest.Quest_1 quest1 = new AllQuest.Quest_1();
//        quest1.A = 1.0;
//        quest1.B = 1.1;
//        quest1.C = 2.0;
//        quest1.verificar();
        // todo: criar uma nova classe para selecionar a questão desejada
        // todo: otimizar parte dos códigos
        // Construtor
//        AllQuest.Quest_2 quest2 = new AllQuest.Quest_2(1);
//        quest2.calcular();
        AllQuest.ContaBancaria conta1= new AllQuest.ContaBancaria();
        conta1.setSaldo(200);
        conta1.getSaldo();



    }
}