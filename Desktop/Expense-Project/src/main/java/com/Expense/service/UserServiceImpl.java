package com.Expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.IUserDao;
import com.Expense.exception.UserNotFoundException;
import com.Expense.model.User;
import com.Expense.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	// @SuppressWarnings("unused")
	@Autowired
	private UserRepository userRepository;

	@Override
	public String resgisterUser(User user) {

		return userDao.registerUser(user);
	}

	@Override
	public User loginUser(String emailId, String password) {
		User userData = userDao.loginUser(emailId, password);
		if (userData == null) {
			throw new UserNotFoundException("please register before login");
		}
		return userData;

	}

	@Override
	public List<User> usersList() {

		return userDao.getusersList();

	}

	@Override
	public User getUserById(int userId) {

		return userRepository.findByUserId(userId);
	}

}
