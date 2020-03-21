package com.Byteschupser.Erntehelfer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping(value = "/anzeige/erstellen")
    public void neueAnzeigeErstellen() {

    }

    @GetMapping(value = "/anzeige/holen")
    public void anzeigeAusDatenbankHolen(){

    }
}
