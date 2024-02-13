package com.crud.app.My.Crud.App.service;

import com.crud.app.My.Crud.App.request_response.BaseResponse;
import com.crud.app.My.Crud.App.request_response.StudentRequest;

public interface StudentService {

    BaseResponse addStudent(StudentRequest studentRequest);

    BaseResponse getAllStudents();

    BaseResponse getStudentById(int id);

    BaseResponse updateStudent(StudentRequest studentRequest);

    BaseResponse deleteStudent(int id);
    
}
