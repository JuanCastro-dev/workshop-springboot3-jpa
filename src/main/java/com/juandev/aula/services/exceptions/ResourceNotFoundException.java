package com.juandev.aula.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
      super("Resource not found. ID: " + id);
    }
}
