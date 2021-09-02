package com.ibm.ejercicio1.Service;


import java.util.List;

import com.ibm.ejercicio1.DTO.Consulta;
import com.ibm.ejercicio1.Models.CreditModel;


public interface ApiService {

	public List<CreditModel> getCreditTypeByParameters(Consulta consulta);
	//declaracion de metodos
}
