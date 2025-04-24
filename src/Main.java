public class Main {
    public static void main(String[] args)
    {
        var r1 = new Retangulo();
        var r2 = new Retangulo();
        System.out.println(r1);
        System.out.println(r2);
        //r1 -> guarda endereço de memória 0x010101
        System.out.println(r1==r2);
        System.out.println(r1.equals(r2));
        // hashCode->transforma o objeto em um único número
        System.out.println(r1.hashCode());

    }
}