package org.example.data.repositories;
import org.example.data.models.User1;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface User1Repository extends MongoRepository<User1,String> {
}
