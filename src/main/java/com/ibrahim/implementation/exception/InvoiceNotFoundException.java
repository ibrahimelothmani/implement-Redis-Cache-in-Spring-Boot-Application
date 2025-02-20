package com.ibrahim.implementation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvoiceNotFoundException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 7428051251365675318L;

  public InvoiceNotFoundException(String message) {
    super(message);
  }
}