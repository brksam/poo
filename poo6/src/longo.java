public class longo extends emprestimos {
    public longo(materiais materiais){
        super(materiais);
    }
    public static double multa(int dias) {
        return dias * 0.25;
    }
}
