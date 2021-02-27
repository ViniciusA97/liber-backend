package com.learning.liber;

import com.learning.liber.Model.Livro;
import com.learning.liber.Model.Teste;
import com.learning.liber.Repository.LivroRepository;
import com.learning.liber.Repository.TesteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LiberApplicationTests {

    @Autowired
    private TesteRepository testeRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Test
    void createTeste() {
        Teste teste = new Teste("Teste 1");
        this.testeRepository.save(teste);
    }

    @Test
    void criaLivro(){
        Livro livro = Livro.builder().ano("2000")
                .avaliacao(Float.parseFloat("3.4"))
                .path_foto("imagem1")
                .paginas(2)
                .ISBN("1")
                .genero("sss")
                .build();
        this.livroRepository.save(livro);
    }

    @Test
    void getTeste() {
        Teste teste = this.testeRepository.getById(1);
    }

}
