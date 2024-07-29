package com.ohgiraffers.blog.repository;

import com.ohgiraffers.blog.model.entity.JaeheeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JaeheeRepository extends JpaRepository<JaeheeEntity, Long> {

}
