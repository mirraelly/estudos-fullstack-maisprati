INSERT INTO item (codigo, titulo, tipo, autor, edicao, disponivel) VALUES
	('L001', 'Crepúsculo', 'livro', 'Stephenie Meyer', NULL, TRUE),
	('L002', 'Lua Nova', 'livro', 'Stephenie Meyer', NULL, TRUE),
	('L003', 'Eclipse', 'livro', 'Stephenie Meyer', NULL, TRUE),
	('R001', 'Contigo', 'revista', NULL, 'Edição 450', FALSE),
	('R002', 'Capricho', 'revista', NULL, 'Edição 2900', TRUE),
	('D001', 'Jota Quest', 'dvd', NULL, NULL, TRUE);

INSERT INTO usuario (nome, tipo, limite_itens) VALUES
	('Harry Potter', 'aluno', 3),
	('Tom Riddle', 'professor', 5);

INSERT INTO emprestimo (item_id, usuario_id, data_retirada, data_devolucao_prevista, data_devolucao, valor_multa) 
	   VALUES (1, 1, '2026-09-01', '2026-09-15', '2026-09-20', 2.50);

INSERT INTO emprestimo (item_id, usuario_id, data_retirada, data_devolucao_prevista, data_devolucao, valor_multa)
        VALUES (4, 2, '2026-10-20', '2026-10-27', NULL, 0);