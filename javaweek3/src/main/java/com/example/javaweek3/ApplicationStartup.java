package com.example.javaweek3;

import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.javaweek3.model.Curso;
import com.example.javaweek3.service.CursoService;

import jakarta.annotation.PostConstruct;

@Component
public class ApplicationStartup {
    
    private static final Logger LOG = Logger.getLogger(ApplicationStartup.class.getName());

    @Autowired
    private Environment environment;

    @Autowired
    private CursoService cursoService;

    @PostConstruct
    public void init() {
        LOG.info(Arrays.asList(environment.getDefaultProfiles()).toString());

        Curso curso = new Curso();
        curso.setNome("CHANGEALLVALUES");
        curso.setPreco(1200.0);
        curso.setPessoaInstrutora("CHANGEALLVALUES");
        
        cursoService.criarCurso(curso);

    }
}
