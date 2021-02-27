package com.learning.liber.Repository;

import com.learning.liber.Model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro getById(long id);

}
