package com.mutaquiha.restapi.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping(method = RequestMethod.GET, value = "/alunos")
    public List<Aluno> getAll() {
        return alunoService.getAlunos();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/aluno/{id}")
    public Aluno getAluno(@PathVariable int id){
        return alunoService.getAluno(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/aluno/{id}")
    public DefaultResponse deleteAluno(@PathVariable int id) {
        return alunoService.deleteAluno(id);
    }
}
