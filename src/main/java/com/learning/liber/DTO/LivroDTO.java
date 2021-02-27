package com.learning.liber.DTO;

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
}
