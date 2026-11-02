public class Revista extends ItemBiblioteca {
    public Revista (String codigo, String titulo, boolean disponivel) {
        super(codigo, titulo, disponivel);
    }

    @Override
    public int getPrazoDias() {
        return 7;
    }

    @Override
    public double getMultaPorDia() {
        return 1.00;
    }
}