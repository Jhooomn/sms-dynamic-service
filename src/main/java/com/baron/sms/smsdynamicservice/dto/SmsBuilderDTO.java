package com.baron.sms.smsdynamicservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class SmsBuilderDTO implements Serializable {
  private String authId;
  private String authToken;
  private String from;
  private String to;
  private String message;
}
