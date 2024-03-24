public class curto extends emprestimos{
    public curto(materiais materiais){
        super(materiais);
    }
    public static double multa(int dias) {
        return dias * 0.10;
    }
}
