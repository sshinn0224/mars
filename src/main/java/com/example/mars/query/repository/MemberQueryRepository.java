package com.example.mars.query.repository;

import com.example.mars.command.domain.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberQueryRepository extends MongoRepository<Member, String> {
}
