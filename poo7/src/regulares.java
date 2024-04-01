public class regulares extends funcionario {
    public regulares (String nome, double salHora, int horasMes){
        super(nome, salHora, horasMes);
    }
    public double calcularSalarioMensal(){
        return getsalHora() * gethorasMes();
    }
}
