package org.example.repositoryTest;

import org.example.data.models.User1;
import org.example.data.repositories.User1Repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
public class User1RepositoryTest {
    @Autowired
    private User1Repository user1Repository;

    @BeforeEach
    public void initializer(){
        user1Repository.deleteAll();
    }

    @Test
    public void saveUser(){
        User1 user1 = new User1();
        user1Repository.save(user1);
        assertEquals(1,user1Repository.count());

    }

    @Test
    public void saveTwoUser(){
        User1 user1 = new User1();
        user1Repository.save(user1);
        User1 user11 = new User1();
        user1Repository.save(user11);
        assertEquals(2,user1Repository.count());
    }

    @Test
    public void saveTwoUser_deleteOneUser(){
        User1 user1 = new User1();
        user1Repository.save(user1);
        User1 user11 = new User1();
        user1Repository.save(user11);
        assertEquals(2,user1Repository.count());
        user1Repository.delete(user11);
        assertEquals(1,user1Repository.count());
    }

    @Test
    public void saveTwoUser_deleteTwoUser(){
        User1 user1 = new User1();
        user1Repository.save(user1);
        User1 user11 = new User1();
        user1Repository.save(user11);
        assertEquals(2,user1Repository.count());
        user1Repository.delete(user11);
        user1Repository.delete(user1);
        assertEquals(0,user1Repository.count());
    }

    @Test
    public void saveTwoUser_deleteUserWithUsernameAndPassword(){
        User1 user1 = new User1();
        user1.setUsername("praise");
        user1.setPassword("buddy");
        user1Repository.save(user1);
        User1 user11 = new User1();
        user11.setUsername("joy");
        user11.setPassword("precious");
        user1Repository.save(user11);
        assertEquals(2,user1Repository.count());
    }




}
