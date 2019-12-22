package com.th.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.th.entity.Person;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
	public List<Person> findByFullNameLike(String name);
	public List<Person> findByDateOfBirthGreaterThan(Date date);
}
