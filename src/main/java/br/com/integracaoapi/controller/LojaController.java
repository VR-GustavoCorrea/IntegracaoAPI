package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.LojaDTO;
import br.com.integracaoapi.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/loja")
public class LojaController {

    @Autowired
    LojaService lojaService;

    @GetMapping("/v1")
    public List<LojaDTO> findAll() {
        return lojaService.getAllStores();
    }
}