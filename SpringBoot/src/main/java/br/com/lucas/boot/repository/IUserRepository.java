package br.com.lucas.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucas.boot.domain.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

}
