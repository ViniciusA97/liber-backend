package com.learning.liber;

import com.learning.liber.Model.Teste;
import com.learning.liber.Repository.TesteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LiberApplicationTests {

    @Autowired
    private TesteRepository testeRepository;

    @Test
    void createTeste() {
        Teste teste = new Teste("Teste 1");
        this.testeRepository.save(teste);
    }

    @Test
    void getTeste() {
        Teste teste = this.testeRepository.getById(1);
    }

}
