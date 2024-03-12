public class testaFuncionario{
    public static void main(String[]args){
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.salario = 1000;
        f2.salario = 2000;
        f3.salario = 3000;

        f1.nome = "jorge";
        f2.nome = "carol";
        f3.nome = "ana";

        f1.setIdade(10);
        f2.setIdade(18);
        f3.setIdade(20);

        System.out.printf("Salario do funcionario %s: %.2f com idade de %d", f1.nome,f1.salario, f1.getIdade());
        System.out.printf("\nSalario do funcionario %s: %.2f com idade de %d", f2.nome,f2.salario, f2.getIdade());
        System.out.printf("\nSalario do funcionario %s: %.2f com idade de %d", f3.nome,f3.salario, f3.getIdade());

        f1.aumSalario(100);
        System.out.printf("\nSalario do funcionario %s (com reajuste): %.2f de idade de %d", f1.nome,f1.salario, f1.getIdade());


    }
}