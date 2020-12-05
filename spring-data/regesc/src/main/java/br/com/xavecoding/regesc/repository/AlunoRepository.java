package br.com.xavecoding.regesc.repository;

import br.com.xavecoding.regesc.orm.Aluno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    List<Aluno> findByNomeStartingWith(String nome);
    List<Aluno> findByNomeStartingWithAndIdadeLessThanEqual(String nome, Integer idade);
}
