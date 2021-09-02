package com.ibm.ejercicio1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ejercicio1.DTO.Consulta;
import com.ibm.ejercicio1.Models.CreditModel;
import com.ibm.ejercicio1.Repository.CreditRepository;

@Service
public class ApiServiceImpl implements ApiService {

	// inyeccion de dependencias
	@Autowired
	private CreditRepository creditRepository;

	@Override // implementacion
	public List<CreditModel> getCreditTypeByParameters(Consulta consulta) {
		//List<CreditModel> list = creditRepository
		//		.findByPassionAndMinSalaryGreaterThanEqualAndMaxSalaryLessThanEqualAndMinAgeGreaterThanEqualAndMaxAgeLessThanEqual(
		//				consulta.getPasion(), consulta.getSalario(), consulta.getSalario(), consulta.getEdad(),
		//				consulta.getEdad());
		List<CreditModel> list= creditRepository.findAll();
		return list;

	}

}
