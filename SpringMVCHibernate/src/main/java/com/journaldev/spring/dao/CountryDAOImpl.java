package com.journaldev.spring.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.journaldev.spring.model.Country;

@Repository
public class CountryDAOImpl implements CountryDAO {

  private static final Logger logger = LoggerFactory.getLogger(CountryDAOImpl.class);

  private SessionFactory sessionFactory;

  public void setSessionFactory(SessionFactory sf) {
    this.sessionFactory = sf;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Country> listCountries() {
    Session session = this.sessionFactory.getCurrentSession();
    List<Country> countryList = session.createQuery("from Country").list();
    for (Country p : countryList) {
      logger.info("Person List::" + p);
    }
    return countryList;
  }

}
