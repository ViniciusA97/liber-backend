package com.learning.liber.DTO;

import com.learning.liber.Model.Livro;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class LivroDTO {

    private Long id;
    private String titulo;
    private String autor;
    private String sinopse;
    private String resenha;
    private Integer edicao;
    private String genero;
    private Long total_avaliacao;
    private Float avaliacao;
    private String path_foto;
    private String ISBN;
    private String ano;
    private Integer paginas;
    private String editora;

    public Livro toModel() {
        return Livro.builder().titulo(this.getTitulo())
                .id(this.getId())
                .autor(this.getAutor())
                .ano(this.getAno())
                .edicao(this.getEdicao())
                .path_foto(this.getPath_foto())
                .ISBN(this.getISBN())
                .paginas(this.getPaginas())
                .sinopse(this.getSinopse())
                .editora(this.getEditora())
                .genero(this.getGenero()).build();
    }
}
