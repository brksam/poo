public class B extends a{
    private int k;
    public B(int a, int b, int c, int d){
        super(a,b,c);
        this.k = d;
    }

    public void printvalor(){ // DAR PRINTLC NOS VALORES
        System.out.println("----------------- ESTOU NA CLASSE B -------------------");
        System.out.println("Valor de X: " + this.x);
        System.out.println("Valor de Y: " + this.y);
        System.out.println("Valor de K: " + this.k);
        System.out.println("Z não é visivel nessa classe");
        System.out.println("Valor de Z: " + obz());
        System.out.println("----------------- ESTOU NA CLASSE B -------------------");
    }
}