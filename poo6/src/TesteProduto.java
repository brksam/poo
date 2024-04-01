public class TesteProduto {
    public static void main(String[] args){
        Produto p1 = new Produto("arroz", 23,450);
        Produto p2 = new Produto("feijao", 30, 500);
        p1.adicionarEstoque(500);
        p2.removerEstoque(211);
        System.out.println("O produto:" + p1.getNome() + " está atualmente " + p1.getPrecoUnitario()+" e tem apenas " + p1.getQntEmEstoque()+" disponíveis no estoque");
        System.out.println("O produto" + p2.getNome() + " está atualmente " + p2.getPrecoUnitario()+" e tem apenas " + p2.getQntEmEstoque()+" disponíveis no estoque");
    }

}
