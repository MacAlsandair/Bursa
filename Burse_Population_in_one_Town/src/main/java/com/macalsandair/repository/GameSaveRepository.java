package com.macalsandair.repository;

import org.springframework.data.repository.CrudRepository;

import com.macalsandair.model.GameSave;

public interface GameSaveRepository extends CrudRepository<GameSave, Long> {

}
