package com.fabio.hexagonal.application.core.exceptions;

public class ObjectNotFoundException extends RuntimeException {
  public ObjectNotFoundException(final String id) {
    super("Object with id " + id + " not found");
  }

  public ObjectNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
