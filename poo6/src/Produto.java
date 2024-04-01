public class Produto {
    private String nome;
    private double precoUnitario;
    private int qntEmEstoque;

    public Produto(String nome, double precoUnitario, int qntEmEstoque){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qntEmEstoque = qntEmEstoque;
    }
    public void adicionarEstoque(int quant){
        this.qntEmEstoque += quant;
    }
    public void removerEstoque(int quant){
        this.qntEmEstoque -= quant;
    }
    public void setNomeProduto(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPrecoUnitario(int precoUnitario){
        this.precoUnitario = precoUnitario;
    }
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public void setQntEmEstoque(int qntEmEstoque){
        this.qntEmEstoque = qntEmEstoque;
    }
    public int getQntEmEstoque(){
        return qntEmEstoque;
    }

}