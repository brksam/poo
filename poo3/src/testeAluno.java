public class testeAluno{
    public static void main(String[] args) {
        Aluno a1 = new Aluno("samuel", 18, "12313");
        System.out.println(a1.getNome() + " - " + a1.getMatricula() + " - " +  a1.getIdade());
        a1.setIdade();
        a1.setNome();
        a1.setMatricula();
        System.out.println(a1.getNome() + " - " +  a1.getMatricula() + " - " +  a1.getIdade());
    }
}