package br.com.xavecoding.regesc.repository;

import br.com.xavecoding.regesc.orm.Aluno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    List<Aluno> findByNomeStartingWith(String nome);
    List<Aluno> findByNomeStartingWithAndIdadeLessThanEqual(String nome, Integer idade);

    // JPQL
    @Query("SELECT a FROM Aluno a WHERE a.nome like :nome% AND a.idade >= :idade")
    List<Aluno> findNomeIdadeIgualOuMaior(String nome, Integer idade);

    // JPQL
    @Query("SELECT a FROM Aluno a INNER JOIN a.disciplinas d WHERE a.nome like :nomeAluno% AND a.idade >= :idadeAluno AND d.nome like :nomeDisciplina%")
    List<Aluno> findNomeIdadeIgualOuMaiorMatriculado(String nomeAluno, Integer idadeAluno, String nomeDisciplina);
}
