package com.learning.liber.Controller;

import com.learning.liber.Model.Teste;
import com.learning.liber.Repository.TesteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Diz que essa classe vai ser um controle de endpoint
@RequestMapping("api/teste") // Essa anotação diz o endereço deste endpoint
@Slf4j
public class TesteController {

    @Autowired
    private TesteRepository testeRepository;

    @GetMapping("/{id}") // Esta anotação diz qual vai ser o verbo HTTP e a rota e parametros
    public ResponseEntity<?> getTeste(@PathVariable(name = "id") int id){
        log.info("[get teste] ---- id: []", id);
        Teste teste  = this.testeRepository.getById(id);
        return new ResponseEntity<>(teste, HttpStatus.OK);
    }

}
