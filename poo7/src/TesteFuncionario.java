public class TesteFuncionario {
    public static void main(String[] args) {
        regulares f1 = new regulares("Samuel",10,10);
        terceirizados f2 = new terceirizados("Miguel",10,10, 200);

        System.out.println("Salario do funcionario "+ f1.getNome() + " esse mês seria de: " + f1.calcularSalarioMensal() + " R$");
        System.out.println("Salario do funcionario "+ f2.getNome() + " esse mês seria de: " + f2.calcularSalarioMensal() + " R$");
    }
}
