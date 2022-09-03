package com.macalsandair.repo;

import org.springframework.data.repository.CrudRepository;

import com.macalsandair.models.PopCard;
import com.macalsandair.models.Town;

public interface TownRepository extends CrudRepository<Town, Long> {

}
