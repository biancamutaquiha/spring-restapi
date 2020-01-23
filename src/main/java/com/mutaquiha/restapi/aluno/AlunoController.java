package com.mutaquiha.restapi.aluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}
