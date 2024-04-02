package org.example.data.repositories;

import org.example.data.models.AdsItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdsItemRepository extends MongoRepository<AdsItem,String> {
}
