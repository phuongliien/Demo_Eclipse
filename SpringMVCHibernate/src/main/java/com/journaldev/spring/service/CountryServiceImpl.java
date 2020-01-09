package com.journaldev.spring.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.journaldev.spring.dao.CountryDAO;
import com.journaldev.spring.model.Country;

@Service
public class CountryServiceImpl implements CountryService {

  private CountryDAO countryDAO;

  public void setCountryDAO(CountryDAO countryDAO) {
    this.countryDAO = countryDAO;
  }

  @Override
  @Transactional
  public List<Country> listCountries() {
    return countryDAO.listCountries();
  }

}
