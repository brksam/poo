public class testeCachorro{
    public static void main (String[]arg){
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        Cachorro c3 = new Cachorro();
        c1.tamanho =17;
        c2.tamanho =28;
        c3.tamanho =39;
        c1.Raca = "Pug";
        c2.Raca = "Shih Tzu";
        c3.Raca = "Buldogue";
        c1.cor = "laranja";
        c2.cor = "branco";
        c3.cor = "azul";
        c1.tem_rabo = true;
        c2.tem_rabo = false;
        c3.tem_rabo = false;
        c1.late();
        c2.late();
        c3.late();
    }
}