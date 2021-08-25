package com.inti.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.services.interfaces.AdresseService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionAdresses")
public class AdresseController {
	
	@Autowired
	AdresseService adresseService;

}
