package org.example.data.repositories;

import org.example.data.models.Ads;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdsRepository extends MongoRepository<Ads,String> {
}
