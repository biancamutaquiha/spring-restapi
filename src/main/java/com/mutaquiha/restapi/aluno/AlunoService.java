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
}
