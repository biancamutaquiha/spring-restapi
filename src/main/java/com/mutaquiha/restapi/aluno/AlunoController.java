package com.mutaquiha.restapi.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.PUT, value = "/aluno/{id}")
    public DefaultResponse editAluno(@PathVariable int id, @RequestBody Aluno aluno){
        return alunoService.editAluno(id, aluno);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/alunos")
    public DefaultResponse addAluno(@RequestBody Aluno aluno){
        return alunoService.addAluno(aluno);
    }
}
