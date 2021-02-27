package com.learning.liber.Model;

import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Livro implements Serializable {

    @Id @GeneratedValue
    private Long id;

    @Column()
    private String titulo;

    @Column()
    private String autor;

    @Column(columnDefinition = "text")
    private String sinopse;

    @Column(columnDefinition = "text")
    private String resenha;

    @Column()
    private Integer edicao;

    @Column()
    private String genero;

    @Column()
    private Long total_avaliacao;

    @Column()
    private Float avaliacao;

    @Column()
    private String path_foto;

    @Column()
    private String ISBN;

    @Column()
    private String ano;

    @Column()
    private Integer paginas;

    @Column()
    private String editora;
}
