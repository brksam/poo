public class a {
    protected int x, y;
    private int z;

    public a(int a, int b, int c){
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public int obx(){ // OBTER X
        return this.x;
    }
    public int oby(){ // OBTER Y
        return this.y;
    }
    public int obz(){ // OBTER Z
        return this.z;
    }
    public void clcx(int a){ // ALTERAR O VALOR DE X
        this.x = a;
    }
    public void clcy(int a){ // ALTERAR O VALOR DE Y
        this.y = a;
    }
    public void clcz(int a){ // ALTERAR O VALOR DE Z
        this.z = a;
    }
    public void printvalor(){ // DAR PRINTLC NOS VALORES
        System.out.println("----------------- ESTOU NA CLASSE A -------------------");
        System.out.println("Valor de X: " + this.x);
        System.out.println("Valor de Y: " + this.y);
        System.out.println("Valor de Z: " + this.z);
        System.out.println("----------------- ESTOU NA CLASSE A -------------------");
    }


}
