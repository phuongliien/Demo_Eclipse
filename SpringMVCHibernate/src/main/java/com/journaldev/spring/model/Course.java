package com.journaldev.spring.model;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "course")
public class Course {

	  @Id
	  @Column(name = "idcourse")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	  @NotNull
	  private String name;
	  @NotEmpty
	  private String description;
	  @NotNull
	  private Integer id_category;

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	 public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	 public Integer getCategoryId() {
	    return id_category;
	  }

	  public void setCategoryId(Integer id_category) {
	    this.id_category = id_category;
	  }
	  
	  public String getDescription()
	  {
		  return description;
	  }
	  
	  public void setDescription(String description)
	  {
		  this.description = description;
	  }

	  public Course() {
	    super();
	  }

	  public Course(Integer id, String name, String description , Integer id_course) {
	    super();
	    this.id = id;
	    this.name = name;
	    this.description = description;
	    this.id_category = id_category;
	  }
}
