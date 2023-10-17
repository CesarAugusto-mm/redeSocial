package com.postagem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postagem.Model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer>{

}
