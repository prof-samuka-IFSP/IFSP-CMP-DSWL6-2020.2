package br.com.xavecoding.regesc.service;

import br.com.xavecoding.regesc.orm.Aluno;
import br.com.xavecoding.regesc.orm.Professor;
import br.com.xavecoding.regesc.repository.AlunoRepository;
import br.com.xavecoding.regesc.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class RelatorioService {
    private AlunoRepository alunoRepository;
    private ProfessorRepository professorRepository;

    public RelatorioService(AlunoRepository alunoRepository, ProfessorRepository professorRepository) {
        this.alunoRepository = alunoRepository;
        this.professorRepository = professorRepository;
    }

    public void menu(Scanner scanner) {
        Boolean isTrue = true;

        while (isTrue) {
            System.out.println("\nQual relatório você deseja?");
            System.out.println("0 - Voltar ao menu anterior");
            System.out.println("1 - Alunos por um dado Nome");
            System.out.println("2 - Alunos por um dado Nome e Idade menor ou igual");
            System.out.println("3 - Alunos por um dado Nome e Idade maior ou igual");
            System.out.println("4 - Alunos Matriculados com um dado Nome e Idade maior ou igual");
            System.out.println("5 - Professores Atribuídos");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.alunosPorNome(scanner);
                    break;
                case 2:
                    this.alunosPorNomeIdadeMenorOuIgual(scanner);
                    break;
                case 3:
                    this.alunosPorNomeIdadeMaiorOuIgual(scanner);
                    break;
                case 4:
                    this.alunosMatriculadosComNomeIdadeMaiorOuIgual(scanner);
                    break;
                case 5:
                    this.professoresAtribuidos(scanner);
                    break;
                default:
                    isTrue = false;
                    break;
            }
        }
        System.out.println();
    }


    private void alunosPorNome(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();

        List<Aluno> alunos = this.alunoRepository.findByNomeStartingWith(nome);
        alunos.forEach(System.out::println);
//        for (Aluno aluno : alunos) {
//            System.out.println(aluno);
//        }
    }

    private void alunosPorNomeIdadeMenorOuIgual(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        List<Aluno> alunos = this.alunoRepository.findByNomeStartingWithAndIdadeLessThanEqual(nome, idade);
        alunos.forEach(System.out::println);
    }

    private void alunosPorNomeIdadeMaiorOuIgual(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        List<Aluno> alunos = this.alunoRepository.findNomeIdadeIgualOuMaior(nome, idade);
        alunos.forEach(System.out::println);
    }


    private void alunosMatriculadosComNomeIdadeMaiorOuIgual(Scanner scanner) {
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.next();

        System.out.print("Idade do Aluno: ");
        Integer idadeAluno = scanner.nextInt();

        System.out.print("Nome da Disciplina: ");
        String nomeDisciplina = scanner.next();

        List<Aluno> alunos = this.alunoRepository.findNomeIdadeIgualOuMaiorMatriculado(nomeAluno, idadeAluno, nomeDisciplina);
        alunos.forEach(System.out::println);
    }


     private void professoresAtribuidos(Scanner scanner) {
        System.out.print("Nome do Professor: ");
        String nomeProfessor = scanner.next();

        System.out.print("Nome da Disciplina: ");
        String nomeDisciplina = scanner.next();

        List<Professor> professores = this.professorRepository.findProfessorAtribuido(nomeProfessor, nomeDisciplina);
        professores.forEach(System.out::println);
    }

}
