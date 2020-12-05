package br.com.xavecoding.regesc.service;

import br.com.xavecoding.regesc.orm.Aluno;
import br.com.xavecoding.regesc.orm.Disciplina;
import br.com.xavecoding.regesc.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudAlunoService {
    private AlunoRepository alunoRepository;

    public CrudAlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Transactional
    public void menu(Scanner scanner) {
        Boolean isTrue = true;

        while (isTrue) {
            System.out.println("\nQual ação você quer executar?");
            System.out.println("0 - Voltar ao menu anterior");
            System.out.println("1 - Cadastrar novo Aluno");
            System.out.println("2 - Atualizar um Aluno");
            System.out.println("3 - Visualizar todos os Alunos");
            System.out.println("4 - Deletar um Aluno");
            System.out.println("5 - Visualizar um Aluno");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.cadastrar(scanner);
                    break;
                case 2:
                    this.atualizar(scanner);
                    break;
                case 3:
                    this.visualizar();
                    break;
                case 4:
                    this.deletar(scanner);
                    break;
                case 5:
                    this.visualizarAluno(scanner);
                    break;
                default:
                    isTrue = false;
                    break;
            }
        }
        System.out.println();
    }


    private void cadastrar(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(idade);
        this.alunoRepository.save(aluno);
        System.out.println("Salvo!\n");
    }


    private void atualizar(Scanner scanner) {
        System.out.print("Digite o Id do Aluno a ser atualizado: ");
        Long id = scanner.nextLong();

        Optional<Aluno> optional = this.alunoRepository.findById(id);

        if (optional.isPresent()) {
            Aluno aluno = optional.get();

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Idade: ");
            Integer idade = scanner.nextInt();

            aluno.setNome(nome);
            aluno.setIdade(idade);
            this.alunoRepository.save(aluno);
            System.out.println("Atualizado!\n");
        }
        else {
            System.out.println("O id do aluno informado: " + id + " é inválido\n");
        }
    }

    private void visualizar() {
        Iterable<Aluno> alunos = this.alunoRepository.findAll();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println();
    }


    private void deletar(Scanner scanner) {
        System.out.print("Id: ");
        Long id = scanner.nextLong();
        this.alunoRepository.deleteById(id);  // lançará uma exception se não achar o ID passado na tabela
        System.out.println("Aluno Deletado!\n");
    }

    @Transactional
    private void visualizarAluno(Scanner scanner) {
        System.out.print("Digite o Id do Aluno a ser visualizado: ");
        Long id = scanner.nextLong();

        Optional<Aluno> optional = this.alunoRepository.findById(id);

        if (optional.isPresent()) {
            Aluno aluno = optional.get();

            System.out.println("- ID: " + aluno.getId());
            System.out.println("- Nome: " + aluno.getNome());
            System.out.println("- Idade: " + aluno.getIdade());
            System.out.println("- Disciplinas: [:");

            if (aluno.getDisciplinas() != null) {
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    System.out.println("\t- Disciplina: " + disciplina.getNome());
                    System.out.println("\t- Semestre: " + disciplina.getSemestre());
                    System.out.println("");
                }
            }
            System.out.println("]");
        }
        else {
            System.out.println("O id do aluno informado: " + id + " é inválido\n");
        }
    }
}
