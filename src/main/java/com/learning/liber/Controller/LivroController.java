package com.learning.liber.Controller;

import com.learning.liber.DTO.LivroDTO;
import com.learning.liber.Model.Livro;
import com.learning.liber.Repository.LivroRepository;
import com.learning.liber.Service.LivroService;
import com.learning.liber.Service.LivroServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/livro")
@Slf4j
@AllArgsConstructor
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;
    private LivroServiceImpl livroService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getLivro(@PathVariable(name = "id") int id){
        log.info("[get teste] ---- id: []", id);
        Livro livro  = this.livroRepository.getById(id);
        return new ResponseEntity<>(livro, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getLivroAll(){
        List<Livro> livro = this.livroRepository.findAll();
        return new ResponseEntity<>(livro, HttpStatus.OK);
    }

    @PostMapping("/")
    public  ResponseEntity salvar(@RequestBody LivroDTO dto) {
        Livro livro = Livro.builder()
                .titulo(dto.getTitulo())
                .autor(dto.getAutor())
                .ano(dto.getAno())
                .edicao(dto.getEdicao())
                .path_foto(dto.getPath_foto())
                .ISBN(dto.getISBN())
                .paginas(dto.getPaginas())
                .sinopse(dto.getSinopse())
                .editora(dto.getEditora())
                .genero(dto.getGenero())
                .build();

        try {
            Livro new_livro = livroService.adicionarLivro(livro);
            return new ResponseEntity(new_livro, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<?> updateLivro(@PathVariable(name = "id") long id, @RequestBody LivroDTO dto) {
        Livro livro = dto.toModel();
        livro.setId(id);

        Livro response = this.livroService.atualizarLivro(livro);

        if (livro == null) {
            return new ResponseEntity<>("ID nao encontrado", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(livro, HttpStatus.OK);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity <?> delete(@PathVariable long id) {
        return livroRepository.findById(id)
                .map(record -> {
                    livroRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
