package br.com.lucas.boot.service;

import java.util.List;

import br.com.lucas.boot.domain.User;

public interface IUserService {

	List<User> findAll();
}
