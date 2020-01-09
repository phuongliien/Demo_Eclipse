package com.journaldev.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer countryId;
  private String countryName;

  public Integer getCountryId() {
    return countryId;
  }

  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public Country(Integer countryId, String countryName) {
    super();
    this.countryId = countryId;
    this.countryName = countryName;
  }

  public Country() {
    super();
  }

}
