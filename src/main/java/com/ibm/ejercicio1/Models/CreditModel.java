package com.ibm.ejercicio1.Models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Categories")
public class CreditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "categoryID")
	private Integer categoryId;
	
	@JsonIgnore
	@Column(name = "passion")
	private String passion;
	
	@JsonIgnore
	@Column(name = "minSalary")
	private Double minSalary;
	
	@JsonIgnore
	@Column(name = "maxSalary")
	private Double maxSalary;
	
	@JsonIgnore
	@Column(name = "minAge")
	private Integer minAge;
	
	@JsonIgnore
	@Column(name = "maxAge")
	private Integer maxAge;
	
	
	@Column(name = "creditType")
	private String creditType;

	public CreditModel() {
		super();
	}

	public CreditModel(String passion, Double minSalary, Double maxSalary, Integer minAge, Integer maxAge,
			String creditType) {
		super();
		this.passion = passion;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.creditType = creditType;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getPassion() {
		return passion;
	}

	public void setPassion(String passion) {
		this.passion = passion;
	}

	public Double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(Double minSalary) {
		this.minSalary = minSalary;
	}

	public Double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(Double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	public String getCreditType() {
		return creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditModel other = (CreditModel) obj;
		return Objects.equals(categoryId, other.categoryId);
	}

}
