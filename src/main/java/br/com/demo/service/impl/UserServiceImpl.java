package br.com.demo.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import br.com.demo.domain.model.User;
import br.com.demo.domain.repository.UserRepository;
import br.com.demo.service.UserService;

	@Service
	public class UserServiceImpl implements UserService {
	
		private final UserRepository repository;

	    public UserServiceImpl(UserRepository userRepository) {
	        this.repository = userRepository;
	    }

		@Override
		public User findById(Long id) {
			
			return repository.findById(id).orElseThrow(NoSuchElementException::new);
		}

		@Override
		public User create(User userToCreate) {
			if(repository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
				throw new IllegalArgumentException("This acoount number aready exist");
			}
			return repository.save(userToCreate);
		}

}
