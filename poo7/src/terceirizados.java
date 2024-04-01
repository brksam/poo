public class terceirizados extends funcionario{
    private double pagueAdicional;
    public double getpagueAdicional(){
        return pagueAdicional;
    }
    public void setpagueAdicional(double pagueAdicional){
        this.pagueAdicional = pagueAdicional;
    }
    public terceirizados(String nome, double salHora, int horasMes, double pagueAdicional){
        super(nome, salHora, horasMes);
        this.pagueAdicional = pagueAdicional;
    }
    public double calcularSalarioMensal(){
        return gethorasMes() * getsalHora() + getpagueAdicional();
    }

}
