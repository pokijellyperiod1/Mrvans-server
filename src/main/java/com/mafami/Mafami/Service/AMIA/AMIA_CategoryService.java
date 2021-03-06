package com.mafami.Mafami.Service.AMIA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mafami.Mafami.Entity.AMIA.AMIA_CategoryEntity;
import com.mafami.Mafami.Repository.AMIA.AMIA_CategoryRepo;

@Service
public class AMIA_CategoryService {

	@Autowired
	private AMIA_CategoryRepo aMIA_CategoryRepo;

	public AMIA_CategoryEntity getOneById(String id) {
		return aMIA_CategoryRepo.findOneById(id);
	}
	
	public AMIA_CategoryEntity getOneBySlug(String slug) {
		return aMIA_CategoryRepo.findOneBySlug(slug);
	}

	public List<AMIA_CategoryEntity> getAll() {
		return aMIA_CategoryRepo.findAll();
	}
	

	public AMIA_CategoryEntity save(AMIA_CategoryEntity entity) {
		return aMIA_CategoryRepo.save(entity);
	}
	
	public void delete(String id) {
		aMIA_CategoryRepo.deleteById(id);
	}
	
	public void deleteAll() {
		aMIA_CategoryRepo.deleteAll();
	}

}
