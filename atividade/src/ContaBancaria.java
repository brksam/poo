public class ContaBancaria {
    int numero;
    String titular;
    float saldo;

    void apresentar(){
        System.out.println("Olá Sr." + titular + " o número da sua conta é: " + numero + " e seu saldo é: " + saldo);
    }
    void depositar(int valor){
        if (valor > 0){
            saldo += valor;
            System.out.print("\nPrezado Sr." + titular + " da conta: " + numero + " seu saldo é: " + saldo);
            System.out.println("\nDeposito efetuado com sucesso!");
        }
        else{
            System.out.print("Valor inválido");
        }
    }
    void sacar(int valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.print("\nPrezado Sr." + titular + " da conta: " + numero + " seu saldo é: " + saldo);
            System.out.println("\nSaque efetuado com secusso!");
        }
        else{
            System.out.print("Valor inválido");
        }
    }
}
