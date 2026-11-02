public class Livro extends ItemBiblioteca {
    public Livro (String codigo, String titulo, boolean disponivel) {
        super(codigo, titulo, disponivel);
    }

    @Override
    public int getPrazoDias() {
        return 14;
    }

    @Override
    public double getMultaPorDia() {
        return 0.50;
    }
}