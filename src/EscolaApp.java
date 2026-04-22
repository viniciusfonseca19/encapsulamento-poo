public class EscolaApp {

    // Atributos privados

    private String nomeEscola;
    private String cidade;
    private int quantidadeSalas;

    // GETTERS E SETTERS

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantidadeSalas() {
        return quantidadeSalas;
    }

    public void setQuantidadeSalas(int quantidadeSalas) {
        this.quantidadeSalas = quantidadeSalas;
    }

    // MÉTODOS

    public void abrirEscola() {
        System.out.println("A escola está aberta!\n");
    }

    public void mostrarDadosEscola() {
        System.out.println("Escola: " + nomeEscola);
        System.out.println("Cidade: " + cidade);
        System.out.println("Numero de salas: " + quantidadeSalas + "\n");
    }

    public void fecharEscola() {
        System.out.println("\nA escola está fechada!");
    }

}
