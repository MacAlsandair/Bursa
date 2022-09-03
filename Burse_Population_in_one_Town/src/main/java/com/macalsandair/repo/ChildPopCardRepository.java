package com.macalsandair.repo;

import org.springframework.data.repository.CrudRepository;

import com.macalsandair.models.ChildPopCard;
import com.macalsandair.models.PopCard;

public interface ChildPopCardRepository extends CrudRepository<ChildPopCard, Long> {

}
