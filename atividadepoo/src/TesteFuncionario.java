public class TesteFuncionario {
    public static void main(String[] args) {
        gerente g1 = new gerente("Samuel", 19, 800, "Be");
        funcionario f1 = new funcionario("Miguel", 20, 800);
        info(g1, f1);

    }
    public static void info(gerente g1, funcionario f1){
        System.out.println("Nome do funcionario: " + f1.getNome());
        System.out.println("Sua idade: " + f1.getIdade());
        System.out.println("Seu salario: " + f1.getSalario());

        System.out.println("------------------------------");
        System.out.println("Nome do gerente: " + g1.getNome());
        System.out.println("Sua idade: " + g1.getIdade());
        System.out.println("Seu salario: " + g1.getSalario());
        System.out.println("Seu departamento: " + g1.getDepartamento());
    }

}