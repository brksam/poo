public class materiais {
    private String titulo;
    private int anoPubli;

    public materiais(String titulo, int anoPubli){
        this.titulo = titulo;
        this.anoPubli = anoPubli;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAnoPubli(){
        return anoPubli;
    }
    public static void main(String[] args) {
        materiais l = new materiais("livro", 2000);
        emprestimos empc1 = new curto(l);
        emprestimos empl1 = new longo(l);
        int dias  = 5;
        double multa = emprestimos.Multa(2);
        System.out.println("multa sem curto e longo: " +  multa);
        System.out.println("Sua multa de curto prazo por atrasar" + dias + " seria de: " + curto.multa(2) + "R$");
        System.out.println("Sua multa de longo prazo por atrasar" + dias + " seria de: " + longo.multa(3) + "R$");
    }
}
