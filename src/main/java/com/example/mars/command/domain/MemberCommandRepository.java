package com.example.mars.command.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberCommandRepository extends MongoRepository<Member, String> {

}
