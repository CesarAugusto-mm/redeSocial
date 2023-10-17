package com.postagem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postagem.Model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {

}
