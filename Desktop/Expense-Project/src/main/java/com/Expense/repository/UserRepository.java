package com.Expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Expense.model.User;
import com.sun.mail.imap.protocol.ID;

public interface UserRepository extends JpaRepository<User, ID> {

	public User findByUserId(int userId);

}
