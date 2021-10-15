package com.ibm.ejercicio1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ibm.ejercicio1.Models.CreditModel;

@Repository
public interface CreditRepository extends JpaRepository<CreditModel, Integer> {

	public List<CreditModel> findByPassionAndMinSalaryLessThanEqualAndMaxSalaryGreaterThanEqualAndMinAgeLessThanEqualAndMaxAgeGreaterThanEqual(
			String passion, Double minsalary, Double maxsalary, Integer minage, Integer maxage);

	public List<CreditModel> findByPassion(String passion);

	

}
