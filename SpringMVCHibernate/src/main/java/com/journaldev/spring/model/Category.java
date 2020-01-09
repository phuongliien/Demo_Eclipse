package com.journaldev.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name= "course")
public class Category {
	  @Id
	  @Column(name = "idcategory")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	  @NotNull
	  private String name;
	  @NotEmpty
	  @Email
	  private String email;
	  @NotNull
	  private Integer countryId;

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public Boolean getGender() {
	    return gender;
	  }

	  public void setGender(Boolean gender) {
	    this.gender = gender;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public Integer getCountryId() {
	    return countryId;
	  }

	  public void setCountryId(Integer countryId) {
	    this.countryId = countryId;
	  }

	  public Person() {
	    super();
	  }

	  public Person(Integer id, Boolean gender, String name, String email, Integer countryId) {
	    super();
	    this.id = id;
	    this.gender = gender;
	    this.name = name;
	    this.email = email;
	    this.countryId = countryId;
	  }
}
