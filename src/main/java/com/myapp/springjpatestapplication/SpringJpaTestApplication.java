package com.myapp.springjpatestapplication;

import com.myapp.springjpatestapplication.model.User;
import com.myapp.springjpatestapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaTestApplication {
    static UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaTestApplication.class, args);
        repository.save(new User(1l, "RAM"));
        repository.save(new User(2l, "SHAAM"));
        System.out.printf(repository.getReferenceById(1L).toString());
        System.out.printf(repository.getReferenceById(2L).toString());
    }

    @Autowired
    public void setRepository(UserRepository repos){
        repository = repos;
    }


}
