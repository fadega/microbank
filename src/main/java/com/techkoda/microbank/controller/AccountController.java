package com.techkoda.microbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techkoda.microbank.dao.AccountDao;
import com.techkoda.microbank.service.AccountService;

@RestController
public class AccountController {
    @Autowired
    private AccountDao accountDao;
    private AccountService accountService;

    @GetMapping("/accountId")
    public String getAccountId() {
        return accountService.getAccountId();
    }

    
    
}
