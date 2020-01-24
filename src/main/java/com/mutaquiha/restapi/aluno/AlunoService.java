package com.mutaquiha.restapi.aluno;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private static List<Aluno> alunos = new ArrayList<>();

    static {
        alunos.add(new Aluno(1, 10, "Olivio de Freitas"));
        alunos.add(new Aluno(2, 13, "Bianca Ferreira"));
        alunos.add(new Aluno(3, 11, "João Carvalho"));
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno(int id) {

        for (Aluno aluno : alunos){

            if (aluno.getId() == id){
               return aluno;
            }
        }

        return new Aluno();
    }

    public DefaultResponse deleteAluno(int id) {

        for (Aluno aluno : alunos){

            if (aluno.getId() == id){
                alunos.remove(aluno);
                return new DefaultResponse(200, "sucesso", "Aluno deletado com sucesso.");
            }
        }
        return new DefaultResponse(404, "erro", "Aluno não encontrado.");
    }

    public DefaultResponse addAluno(Aluno aluno) {
        alunos.add(aluno);

        return new DefaultResponse(201, "sucesso", "Aluno adicionado com sucesso.");
    }
}
