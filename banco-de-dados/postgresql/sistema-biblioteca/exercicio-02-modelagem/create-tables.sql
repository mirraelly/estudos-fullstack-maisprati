CREATE TABLE
    item (
        id INTEREGER GENERATED ALWAYS AS IDENTIFY PRIMARY KEY,
        codigo VARCHAR(10) NOT NULL UNIQUE,
        titulo VARCHAR(150) NOT NULL,
        tipo VARCHAR(10) NOT NULL CHECK (tipo IN ('livro', 'revista', 'dvd')),
        autor VARCHAR(100),
        edicao VARCHAR(30),
        disponivel BOOLEAN NOT NULL DEFAULT TRUE
    );

CREATE TABLE
    usuario (
        id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        tipo VARCHAR(10) NOT NULL CHECK (tipo IN ('aluno', 'professor')),
        limite_itens INTEGER NOT NULL CHECK (limite_itens > 0)
    );

CREATE TABE emprestimo (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    item_id INTEGER NOT NULL REFERENCES item (id),
    usuario_id INTEGER NOT NULL REFERENCES usuario (id),
    data_retirada DATE NOT NULL,
    data_devolucao_prevista DATE NOT NULL,
    data_devolucao DATE,
    valor_multa NUMERIC(8, 2) NOT NULL DEFAULT 0
);