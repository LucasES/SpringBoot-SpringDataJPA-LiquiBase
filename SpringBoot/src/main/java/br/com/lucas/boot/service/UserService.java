package br.com.lucas.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucas.boot.domain.User;
import br.com.lucas.boot.repository.IUserRepository;

@Service
@Transactional
public class UserService implements IUserService{

	@Autowired
	private IUserRepository repository;
	
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
