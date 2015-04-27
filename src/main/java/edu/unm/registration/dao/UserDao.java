package edu.unm.registration.dao;

import java.util.List;

import edu.unm.registration.model.User;

public interface UserDao {

	int save(User users);

	List<User> queryForAll();

	int update(User users);

	boolean checkEmail(String email);

	User getUserDetail(String email);

}
