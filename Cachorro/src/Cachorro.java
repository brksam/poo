public class Cachorro {
    String Raca;
    int tamanho;
    String cor;
    boolean tem_rabo;
    void late(){
        if (tem_rabo){
            System.out.println("Eu sou o " + Raca + " de tamanho " + tamanho + " cm, minha cor é " + cor + " e eu tenho rabo");
        }
        else{
            System.out.println("Eu sou o " + Raca + " de tamanho " + tamanho + " cm, minha cor é " + cor + " e eu NÃO tenho rabo");
        }
    }
}
