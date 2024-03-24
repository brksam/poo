public class emprestimos {
    protected materiais material;
    public emprestimos(materiais material){
        this.material = material;
    }
    public static double Multa(int dias){
        return dias * 0.20;
    }

}
