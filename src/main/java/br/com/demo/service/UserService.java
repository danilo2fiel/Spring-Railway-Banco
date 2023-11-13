package br.com.demo.service;

import br.com.demo.domain.model.User;

public interface UserService {

	User findById (Long id);
	
	User create (User userToCreate);
}
