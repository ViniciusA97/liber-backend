package com.learning.liber.Service;

import com.learning.liber.Model.Livro;
import com.learning.liber.Repository.LivroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
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

    @Override
    public Livro atualizarLivro(Livro livro) {
        try {
            return this.repository.save(livro);
        } catch (Exception e) {
            log.info("Exception ao atualizar livro " +e.getMessage());
            return null;
        }
    }

    @Override
    public Livro pegarLivroPorID(long id) {
        return repository.findById(id).orElse(null);
    }

}
