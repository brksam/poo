import java.util.Scanner;
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    public Aluno(String nome, int idade, String matricula){
        this.idade = idade;
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o novo nome: ");
        String nom = s.nextLine();
        this.nome = nom;
    }
    public void setIdade(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma nova idade: ");
        int idad = s.nextInt();
        this.idade = idad;
    }
    public void setMatricula(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma nova matricula: ");
        String mat = s.nextLine();
        this.matricula = mat;
    }
}
