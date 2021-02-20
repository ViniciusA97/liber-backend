package com.learning.liber.Repository;

import com.learning.liber.Model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository  extends JpaRepository<Teste, Long> {

    Teste getById(long id);

}
