public class Biblioteca {
    private static final int CAPACIDADE = 20;
    private final ItemBiblioteca[] acervo = new ItemBiblioteca[CAPACIDADE];
    private final Usuario[] usuarios = new Usuario[CAPACIDADE];
    private int totalItens = 0;
    private int totalUsuarios = 0;

    public boolean cadastrarItem(ItemBiblioteca item) {
        if (totalItens == CAPACIDADE) {
            System.out.println("Acervo cheio. Não foi possível cadastrar: " + item.getTitulo());
            return false;
        }
        acervo[totalItens++] = item;
        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (totalUsuarios == CAPACIDADE) {
            System.out.println("Cadastro de usuários cheio. Não foi possível cadastrar: " + usuario.getNome());
            return false;
        }
        usuarios[totalUsuarios++] = usuario;
        return true;
    }

    public boolean emprestar(Usuario usuario, ItemBiblioteca item) {
        if (!item.isDisponivel()) {
            System.out.println("RECUSADO: \"" + item.getTitulo() + "\" já está emprestado.");
            return false;
        }
        if (usuario.atingiuLimite()) {
            System.out.println("RECUSADO: " + usuario.getNome()
                    + " atingiu o limite de " + usuario.getLimiteItens() + " itens.");
            return false;
        }
        item.marcarEmprestado();
        usuario.registrarEmprestimo();
        System.out.println("OK: " + usuario.getNome() + " pegou \"" + item.getTitulo()
                + "\". Prazo: " + item.getPrazoDias() + " dias.");
        return true;
    }

    public double devolver(Usuario usuario, ItemBiblioteca item, int diasComItem) {
        if (item.isDisponivel()) {
            System.out.println("RECUSADO: \"" + item.getTitulo() + "\" não está emprestado.");
            return 0;
        }
        item.marcarDevolvido();
        usuario.registrarDevolucao();

        int diasAtraso = Math.max(0, diasComItem - item.getPrazoDias());
        double multa = diasAtraso * item.getMultaPorDia();
        System.out.println("OK: " + usuario.getNome() + " devolveu \"" + item.getTitulo()
                + "\". Atraso: " + diasAtraso + " dia(s). Multa: R$ " + String.format("%.2f", multa));
        return multa;
    }

    public void listarAcervo() {
        System.out.println("=== ACERVO ===");
        for (int i = 0; i < totalItens; i++) {
            System.out.println(acervo[i]);
        }
    }
}
