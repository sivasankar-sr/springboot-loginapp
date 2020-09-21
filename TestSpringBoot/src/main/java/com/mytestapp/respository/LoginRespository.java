package com.mytestapp.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mytestapp.entity.Login;

public interface LoginRespository extends CrudRepository<Login,Long> {
	
	//public List<LoginEntity> findByItem(String details);
    
    @Query("SELECT e FROM Login e WHERE e.username >= :username and e.password >= :password" )
    public List<Login> validateUSer(@Param("username") String username,@Param("password") String password);

}
