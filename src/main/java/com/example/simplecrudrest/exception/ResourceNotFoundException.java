package com.example.simplecrudrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID;

    static {
        serialVersionUID = 1L;
    }

    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public void ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        //super(String.format("%s not found with %s:`%s`", resourceName, fieldName, fieldValue));

    }
    public String getResourceName(){
        return resourceName;
    }
    public String getFieldName(){
        return fieldName;
    }
    public Object getFieldValue(){
        return fieldValue;
    }

}
