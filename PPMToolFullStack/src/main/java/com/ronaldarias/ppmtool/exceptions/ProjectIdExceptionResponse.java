package com.ronaldarias.ppmtool.exceptions;

// this class contains just the String message of the exception, for example: ex.getMessage()
// this response projectIdentifier: ex.getMessage()
// example: {"projectIdentifier": "Project ID IDE03 already exists"}

public class ProjectIdExceptionResponse {

    private String projectIdentifier;

    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
