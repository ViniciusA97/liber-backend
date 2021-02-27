package com.learning.liber.Impl;

import com.learning.liber.Model.Livro;
import com.learning.liber.Repository.LivroRepository;
import com.learning.liber.Service.LivroService;

public class LivroServiceImpl implements LivroService {

    private LivroRepository repository;

    public LivroServiceImpl(LivroRepository repository) {
        this.repository = repository;
    }

    @Override
    public Livro adicionarLivro(String titulo, String autor, String sinopse, String genero, String isbn, Integer ano, Integer pagina) {
        return null;
    }
}
