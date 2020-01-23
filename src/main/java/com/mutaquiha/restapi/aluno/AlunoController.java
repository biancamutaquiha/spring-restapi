package com.mutaquiha.restapi.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping("/alunos")
    public List<Aluno> getAll() {
        return alunoService.getAlunos();
    }

    @RequestMapping("/alunos/{id}")
    public Aluno getAluno(@PathVariable int id){
        return alunoService.getAluno(id);
    }
}
