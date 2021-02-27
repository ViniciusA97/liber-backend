package com.learning.liber.Service;

import com.learning.liber.Model.Livro;
import com.learning.liber.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl implements LivroService {

    private LivroRepository repository;

    @Autowired
    public LivroServiceImpl(LivroRepository repository) {
        this.repository = repository;
    }

    @Override
    public Livro adicionarLivro(Livro livro){
       return this.repository.save(livro);
    }

}
