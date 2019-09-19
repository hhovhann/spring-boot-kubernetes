package com.hhovhann.springbootkubernetes.repository;

import com.hhovhann.springbootkubernetes.Kayak;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KayakRepository extends ReactiveMongoRepository<Kayak, Long> {
}
