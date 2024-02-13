package com.crud.app.My.Crud.App.request_response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BaseResponse {
    
    private boolean status;
    private String message;
    private Object data;

}
