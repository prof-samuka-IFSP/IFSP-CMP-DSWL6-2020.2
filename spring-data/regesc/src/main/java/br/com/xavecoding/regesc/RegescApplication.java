package br.com.xavecoding.regesc;

import br.com.xavecoding.regesc.orm.Professor;
import br.com.xavecoding.regesc.repository.ProfessorRepository;
import br.com.xavecoding.regesc.service.CrudAlunoService;
import br.com.xavecoding.regesc.service.CrudDisciplinaService;
import br.com.xavecoding.regesc.service.CrudProfessorService;
import br.com.xavecoding.regesc.service.RelatorioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RegescApplication implements CommandLineRunner {
	private CrudProfessorService  professorService;
	private CrudDisciplinaService disciplinaService;
	private CrudAlunoService      alunoService;
	private RelatorioService 	  relatorioService;

	// os objetos passado por parâmetro são injetados automaticamente pelo Spring
	// pq suas classes possuem a anotação @Service
	public RegescApplication(CrudProfessorService professorService, CrudDisciplinaService disciplinaService,
							 CrudAlunoService alunoService, RelatorioService relatorioService) {
		this.professorService = professorService;
		this.disciplinaService = disciplinaService;
		this.alunoService = alunoService;
		this.relatorioService = relatorioService;
	}


	public static void main(String[] args) {
		SpringApplication.run(RegescApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Boolean isTrue = true;
		Scanner scanner = new Scanner(System.in);

		while (isTrue) {
			System.out.println("O que deseja fazer/interagir?");
			System.out.println("0 - Sair");
			System.out.println("1 - Professor");
			System.out.println("2 - Disciplina");
			System.out.println("3 - Aluno");
			System.out.println("4 - Relatório");

			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					this.professorService.menu(scanner);
					break;
				case 2:
					this.disciplinaService.menu(scanner);
					break;
				case 3:
					this.alunoService.menu(scanner);
					break;
				case 4:
					this.relatorioService.menu(scanner);
					break;
				default:
					isTrue = false;
					break;
			}
		}
	}
}
