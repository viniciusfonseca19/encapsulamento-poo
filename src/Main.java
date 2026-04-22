public class Main {

    public static void main(String[] args) {

        // Objeto escola
        EscolaApp escola = new EscolaApp();

        escola.setNomeEscola("EEEP Luiza de Teodoro Vieira");
        escola.setCidade("Pacatuba - CE");
        escola.setQuantidadeSalas(9);

        // Objeto estudante
        Aluno estudante = new Aluno();

        estudante.setNome("Vinícius");
        estudante.setMatricula(4941725);
        estudante.setIdade(16);

        // Execução
        escola.abrirEscola();
        escola.mostrarDadosEscola();
        escola.worker();

        estudante.exibirAluno();
        estudante.estudar();
        estudante.worker();
        estudante.fazerProva();
        estudante.consultarResultado();

        escola.fecharEscola();
    }
}