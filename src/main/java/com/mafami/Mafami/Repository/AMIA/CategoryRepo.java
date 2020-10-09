package com.mafami.Mafami.Repository.AMIA;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mafami.Mafami.Entity.AMIA.CategoryEntity;

@Repository
public interface CategoryRepo extends MongoRepository<CategoryEntity, String> {

	CategoryEntity findOneById(String id);

}