package com.extjspoc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.extjspoc.domain.Login;

@Repository
public class LoginDAO {
	@Autowired
	private MongoTemplate mongoTemplate;

	public boolean validateCredentials() {

		Query query = new Query(Criteria.where("userName").is("kranthi").and("pwd").is("0413"));
		List<Login> login = mongoTemplate.find(query, Login.class,"Login");
		return !login.isEmpty();
	}

}
