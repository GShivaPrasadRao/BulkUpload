package com.buildtechknowledge.spring.files.excel.repository;

import com.buildtechknowledge.spring.files.excel.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
