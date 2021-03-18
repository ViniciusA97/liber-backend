package com.learning.liber.Service;

import com.learning.liber.Model.Livro;

public interface LivroService {

    Livro adicionarLivro(Livro livro);

    Livro atualizarLivro(Livro livro);

    Livro pegarLivroPorID(long id);
}
