package com.mafami.Mafami.Convert;

import org.springframework.stereotype.Component;

import com.mafami.Mafami.Entity.UserEntity;

@Component
public class UserConvert {

	public UserEntity Entity_To_Entity(UserEntity oldEntity) {
		UserEntity newEntity = new UserEntity();

		newEntity.setId(oldEntity.getId());
		newEntity.setUsername(oldEntity.getUsername());
		newEntity.setPassword(oldEntity.getPassword());
		newEntity.setFullname(oldEntity.getFullname());
		newEntity.setAddress(oldEntity.getAddress());
		newEntity.setPhone(oldEntity.getPhone());
		newEntity.setDateOfBirth(oldEntity.getDateOfBirth());
		newEntity.setRole(oldEntity.getRole());
		newEntity.setEmail(oldEntity.getEmail());

		return newEntity;
	}

}
