package com.crud.app.My.Crud.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.app.My.Crud.App.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> {
    
}
