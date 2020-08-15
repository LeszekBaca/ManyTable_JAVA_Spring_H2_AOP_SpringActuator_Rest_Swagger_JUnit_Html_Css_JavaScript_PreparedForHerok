package com.project.exception;

public class NotFoundItemException extends RuntimeException {

    public NotFoundItemException(Long id) {
        super("Id not found : " + id);
    }

}