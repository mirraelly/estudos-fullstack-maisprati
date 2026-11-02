public abstract class ItemBiblioteca {
    private final String codigo;
    private final String titulo;
    private boolean disponivel;

    public ItemBiblioteca(String codigo, String titulo, boolean disponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public abstract int getPrazoDias();

    public abstract double getMultaPorDia();

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    void marcarEmprestado() {
        this.disponivel = false;
    }

    void marcarDevolvido() {
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] %s - %s | prazo: %d dias | multa: R$ %.2f/dia | %s",
                codigo,
                titulo,
                getClass().getSimpleName(),
                getPrazoDias(),
                getMultaPorDia(),
                disponivel ? "disponível" : "emprestado");
    }
}
