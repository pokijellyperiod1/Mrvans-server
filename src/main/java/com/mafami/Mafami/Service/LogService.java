package com.mafami.Mafami.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mafami.Mafami.Entity.LogEntity;
import com.mafami.Mafami.Repository.LogRepo;

/**
* @author root {1:25:08 PM}:
 * @version Creation time: Nov 8, 2020 1:25:08 PM
 * Class Description
*/
/**
 * @author tankyhuynh
 *
 */

@Service
public class LogService {

	@Autowired
	private LogRepo logRepo;
	
	public LogEntity findOneById(String id) {
		return logRepo.findOneById(id);
	}

	public List<LogEntity> getAll() {
		return logRepo.findAll();
	}

	public LogEntity save(LogEntity entity) {
		return logRepo.save(entity);
	}

	public void delete(String id) {
		logRepo.delete(logRepo.findOneById(id));
	}
	
	public void deleteAll() {
		logRepo.deleteAll();
	}
	
	
}
