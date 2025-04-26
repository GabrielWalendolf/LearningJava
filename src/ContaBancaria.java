public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0){
            saldo+=valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void printar_saldo(){
        System.out.println(saldo);
    }
}
