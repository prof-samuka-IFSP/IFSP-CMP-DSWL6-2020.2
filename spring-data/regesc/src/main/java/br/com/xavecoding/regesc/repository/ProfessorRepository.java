package br.com.xavecoding.regesc.repository;

import br.com.xavecoding.regesc.orm.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long> {
    // SQL nativa
    @Query(nativeQuery = true,
           value = "SELECT * FROM professores p INNER JOIN disciplinas d ON p.id = d.professor_id WHERE p.nome like :nomeProfessor% AND d.nome like :nomeDisciplina%")
    List<Professor> findProfessorAtribuido(String nomeProfessor, String nomeDisciplina);
}
