public class testeatividade{
    public static void main (String[]arg){
        ContaBancaria u1 = new ContaBancaria();
        ContaBancaria u2 = new ContaBancaria();
        u1.titular = "Welison bachhin";
        u2.titular = "Julio cesar";
        u1.numero = 123331;
        u2.numero = 344344;
        u2.saldo = 0;
        u1.saldo = 0;

        u1.apresentar();
        u2.apresentar();
        u1.depositar(127);
        u1.sacar(22);
        u2.depositar(57);
        u2.sacar(7);
    }
}