package com.learning.liber.Model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Teste implements Serializable {

    @Id @GeneratedValue
    private Long id;

    @Column()
    private String teste;

    public Teste(String teste){
        this.teste = teste;
    }

}
