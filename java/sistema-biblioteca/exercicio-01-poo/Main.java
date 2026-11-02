public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("L001", "Crepúsculo", true);
        Livro l2 = new Livro("L002", "Lua Nova", true);
        Livro l3 = new Livro("L003", "Eclipse", true);
        Revista r1 = new Revista("R001", "Contigo", true);
        Revista r2 = new Revista("R002", "Capricho", true);
        Dvd d1 = new Dvd("D001", "Jota Quest", true );
        biblioteca.cadastrarItem(l1);
        biblioteca.cadastrarItem(l2);
        biblioteca.cadastrarItem(l3);
        biblioteca.cadastrarItem(r1);
        biblioteca.cadastrarItem(r2);
        biblioteca.cadastrarItem(d1);

        Aluno harry = new Aluno("Harry Potter");
        Professor tom = new Professor("Tom Riddle");
        biblioteca.cadastrarUsuario(harry);
        biblioteca.cadastrarUsuario(tom);

        biblioteca.listarAcervo();

        System.out.println("\n--- Empréstimos ---");
        biblioteca.emprestar(harry, l1);
        biblioteca.emprestar(harry, l2);
        biblioteca.emprestar(harry, l3);
        biblioteca.emprestar(harry, r1);
        biblioteca.emprestar(tom, d1);
        biblioteca.emprestar(tom, r1);

        System.out.println();
        biblioteca.listarAcervo();

        System.out.println("\n--- Devolução ---");
        biblioteca.devolver(tom, r1, 10);

        System.out.println();
        biblioteca.listarAcervo();
    }
}