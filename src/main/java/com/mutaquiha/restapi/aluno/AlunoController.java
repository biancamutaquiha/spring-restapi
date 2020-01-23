package com.mutaquiha.restapi.aluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {

    private static List<Aluno> alunos = new ArrayList<>();
    static{
        alunos.add(new Aluno(1, 10, "Olivio de Freitas"));
        alunos.add(new Aluno(2, 13, "Bianca Ferreira"));
        alunos.add(new Aluno(3, 11, "João Carvalho"));
    }

    @RequestMapping("/alunos")
    public List<Aluno> getAll() {
        return alunos;
    }
}
