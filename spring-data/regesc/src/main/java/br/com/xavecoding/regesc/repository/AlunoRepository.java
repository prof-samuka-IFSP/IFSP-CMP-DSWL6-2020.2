package br.com.xavecoding.regesc.repository;

import br.com.xavecoding.regesc.orm.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
