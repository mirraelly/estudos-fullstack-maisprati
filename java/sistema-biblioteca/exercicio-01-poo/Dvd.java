public class Dvd extends ItemBiblioteca {
    public Dvd (String codigo, String titulo, boolean disponivel) {
        super(codigo, titulo, disponivel);
    }

    @Override
    public int getPrazoDias() {
        return 5;
    }

    @Override
    public double getMultaPorDia() {
        return 2.00;
    }
}