public class gerente extends funcionario {
    private String departamento;
    public gerente(String nome, int idade, double salario, String departamento){
        super(nome,idade,salario, departamento);
        this.departamento = departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return this.departamento = departamento;
    }
}
