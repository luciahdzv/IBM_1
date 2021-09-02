package com.ibm.ejercicio1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ejercicio1.DTO.Consulta;
import com.ibm.ejercicio1.Models.CreditModel;
import com.ibm.ejercicio1.Service.ApiService;


@RestController
@RequestMapping(path="/api")
public class ApiController {

	@Autowired
	private ApiService apiService;
	
	@PostMapping("/ej1")
	public List<CreditModel> getCreditType(@RequestBody Consulta consulta) {
		return apiService.getCreditTypeByParameters(consulta);
	}
	
	@GetMapping("/HolaMundo")
	public String holaquehace(){
		return "hola mundo";
	}
	
}
