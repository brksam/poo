public class funcionario {
    private String nome;
    private int idade;
    private double salario;

    funcionario(String nome, int idade, double salario) {
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
    }
    funcionario(String nome, int idade, double salario, String departamento) {
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

}