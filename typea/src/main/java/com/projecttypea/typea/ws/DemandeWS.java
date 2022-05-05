package com.projecttypea.typea.ws;

import com.projecttypea.typea.bean.Demande;
import com.projecttypea.typea.service.DemandeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin/demandesapi")
@RestController
public class DemandeWS {

    @Autowired
    DemandeService demandeService;

    @GetMapping("/{toEmail}/{body}/{subject}")
    public void sendSimpleMail(@PathVariable String toEmail, @PathVariable String body, @PathVariable String subject) {
        demandeService.sendSimpleMail(toEmail, body, subject);
    }

    @GetMapping("/demandeslist")
    public Demande findAll() {
        return demandeService.findAll();
    }
}
