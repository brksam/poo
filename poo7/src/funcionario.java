public class funcionario{
    private String nome;
    private double salHora;
    private int horasMes;
    public funcionario(String nome, double salHora, int horasMes){
        this.nome = nome;
        this.salHora = salHora;
        this.horasMes = horasMes;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Double getsalHora(){
        return salHora;
    }
    public void setsalHora(double salHora){
        this.salHora = salHora;
    }
    public int gethorasMes(){
        return horasMes;
    }
    public void sethorasMes(int horasMes){
        this.horasMes = horasMes;
    }
}
