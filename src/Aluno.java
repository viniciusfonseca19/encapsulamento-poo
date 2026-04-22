public class Aluno{

    //Atributos privados
    private String nome;
    private int matricula;
    private int idade;
    private double notaFinal;

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // MÉTODOS

    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade: " + idade);
        System.out.println("Nota Final: " + notaFinal);
    }

    public void estudar() {
        System.out.println(nome + " está estudando!");
    }

    public void fazerProva() {
        System.out.println("Aluno: " + nome + " fez a prova");
        notaFinal = 7.5;
    }

    public void consultarResultado() {
        if (notaFinal > 7) {
            System.out.println("Foi aprovado com sucesso, com a nota final: " + notaFinal);
        } else {
            System.out.println("Não conseguiu a média necessária, nota final: " + notaFinal);
        }
    }

    // VALOR WORKER
    public void worker() {
        System.out.println(nome + " está realizando atividades escolares.");
    }
}
