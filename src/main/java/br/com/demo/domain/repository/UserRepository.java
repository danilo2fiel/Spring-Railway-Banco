package br.com.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByAccountNumber(String accountNumber);

}
