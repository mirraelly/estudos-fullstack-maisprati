public abstract class Usuario {
    private final String nome;
    private int quantidadeEmprestada;

    public Usuario(String nome) {
        this.nome = nome;
        this.quantidadeEmprestada = 0;
    }

    public abstract int getLimiteItens();

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    public boolean atingiuLimite() {
        return quantidadeEmprestada >= getLimiteItens();
    }

    void registrarEmprestimo() {
        quantidadeEmprestada++;
    }

    void registrarDevolucao() {
        quantidadeEmprestada--;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %d/%d itens",
                nome, getClass().getSimpleName(), quantidadeEmprestada, getLimiteItens());
    }
}