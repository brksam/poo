public class testeAluno{
    public static void main (String [] args){
        disciplina d1 = new disciplina("matematica", 60);
        Aluno a1 = new Aluno("carlos", 42344, 10, 5, 1, 9, 7, d1);
        Aluno a2 = new Aluno("samuel", 11111, 10, 10, 10, 10, 10, d1);

        System.out.println("A media do aluno: " + a1.nome + " = " + a1.situAluno() + " com média de: " + a1.calMedia());
        System.out.println("A media do aluno: " + a2.nome + " = " + a1.situAluno() + " com média de: " + a2.calMedia());
        System.out.println("noma da disciplina preferida: " + a1.disciplina_pref.nome);
    }
}