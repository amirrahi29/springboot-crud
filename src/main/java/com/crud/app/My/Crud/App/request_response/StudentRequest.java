package com.crud.app.My.Crud.App.request_response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPassword;

}
