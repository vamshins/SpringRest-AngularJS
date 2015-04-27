package edu.unm.registration.service.impl;

import java.util.List;

import edu.unm.registration.model.User;
import edu.unm.registration.service.exception.ServiceException;

public interface UserService {

	boolean save(User users);

	List<User> queryForAll();

	boolean update(User users);

	boolean checkEmail(String email) throws ServiceException;

}
