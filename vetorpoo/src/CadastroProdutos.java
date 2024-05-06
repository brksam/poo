import java.util.Scanner;
public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int NUM_PRODUTOS = 10;
        String[] nomesProdutos = new String[NUM_PRODUTOS];
        double[] precoProdutos = new double[NUM_PRODUTOS];
        int[] produtos = new int[NUM_PRODUTOS];

        System.out.println("--- COLOCANDO OS NOMES / PRODUTOS / PREÇOS ---");
        for (int i = 0;i < NUM_PRODUTOS; i++ ){
            System.out.println("Digite o nome produto " + (i + 1) + ":");
            nomesProdutos[i] = s.nextLine();
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            precoProdutos[i] = s.nextDouble();
            System.out.println("Digite a quantidade do produto " + (i+1) + "(até 10 produtos):");
            produtos[i] = s.nextInt();
            s.nextLine();
        }
        for (int i = 0;i < NUM_PRODUTOS; i++ ){
            System.out.println("( " + nomesProdutos[i] + "," +  precoProdutos[i] + "," +  produtos[i] + " )");
        }
        s.close();
    }
}
