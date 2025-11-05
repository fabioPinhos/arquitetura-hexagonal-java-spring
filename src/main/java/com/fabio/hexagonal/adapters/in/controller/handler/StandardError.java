package com.fabio.hexagonal.adapters.in.controller.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError {

  private Long timestamp;
  private Integer status;
  private String error;
  private String message;
  private String path;

}
