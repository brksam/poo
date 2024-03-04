public class Circulo {
    float raio;
    double area;
    double perimetro;
    void calArea(int raio){
        area += 3.14 * (raio * raio);
        System.out.print("\nÁrea do circulo: " + area);
    }
    void calPer(int raio){
        perimetro += 2 * 3.14 * raio;
        System.out.print("\nPerímetro do circulo: " + perimetro);
    }
}
