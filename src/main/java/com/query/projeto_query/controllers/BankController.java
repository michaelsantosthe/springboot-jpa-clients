package com.query.projeto_query.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.query.projeto_query.services.BankService;

@RestController
@RequestMapping("/api/banks")
public class BankController {
    private final BankService bankService;

    public BankController(BankService bankService)
    {
        this.bankService = bankService;
    }

    @RequestMapping("/buscar")
    public String buscar()
    {
        try {
            return bankService.buscarBancos();
        }catch (Exception e) {
            return "Erro ao buscar todos os dados dos bancos";
        }
    }
}
