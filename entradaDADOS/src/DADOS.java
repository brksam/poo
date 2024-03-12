import java.util.Scanner;
import java.io.*;

public class DADOS {
    public static void main(String[] args) {
         //Scanner
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite um nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        System.out.printf("nome informado foi %s com idade de %d", nome, idade);
    }
}
