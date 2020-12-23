package com.mafami.Mafami.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mafami.Mafami.Entity.RecruitmentEntity;
import com.mafami.Mafami.Service.RecruitmentService;

@RestController
@RequestMapping("/api/recruitment")
public class RecruitmentAPI {

	@Autowired
	private RecruitmentService recruitmentService;

	@GetMapping
	public List<RecruitmentEntity> getAll() {
		return recruitmentService.getAll();
	}

	@GetMapping("/{site}")
	public List<RecruitmentEntity> getAllBySite(@PathVariable String site) {
		return recruitmentService.getAllBySite(site);
	}

	@GetMapping("/{site}/{id}")
	public ResponseEntity<RecruitmentEntity> getOneById( @PathVariable("id") String id) {
		RecruitmentEntity logEntity = recruitmentService.findOneById(id);
		if (logEntity != null) {
			return ResponseEntity.ok(recruitmentService.findOneById(id));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@PostMapping("/{site}")
	public RecruitmentEntity saveOneBySite(@PathVariable String site, @RequestBody RecruitmentEntity contactEntity) {
		contactEntity.setSite(site);
		return recruitmentService.save(contactEntity);
	}

	@PutMapping("/{site}/{id}")
	public ResponseEntity<RecruitmentEntity> saveOneById( @PathVariable("site") String site ,@PathVariable("id") String id, @RequestBody RecruitmentEntity newEntity) {
		RecruitmentEntity oldEntity = recruitmentService.findOneById(id);
		newEntity.setId(id);
		newEntity.setSite(site);
		if (oldEntity != null)
			return ResponseEntity.ok(recruitmentService.save(newEntity));

		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/{id}")
	public void deleteOneById(@PathVariable String id) {
		recruitmentService.delete(id);
	}

	@DeleteMapping("/{site}/all")
	public void deleteAllBySite(@PathVariable String site) {
		recruitmentService.deleteAllBySite(site);
	}
	
	@DeleteMapping("/all")
	public void deleteAll() {
		recruitmentService.deleteAll();
	}

}