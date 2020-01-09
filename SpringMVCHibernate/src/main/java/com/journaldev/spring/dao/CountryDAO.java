package com.journaldev.spring.dao;

import java.util.List;
import com.journaldev.spring.model.Country;

public interface CountryDAO {
  public List<Country> listCountries();
}
