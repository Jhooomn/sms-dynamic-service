package com.baron.sms.smsdynamicservice.controller;

import com.baron.sms.smsdynamicservice.dto.SmsBuilderDTO;
import com.baron.sms.smsdynamicservice.service.SmsService;
import com.plivo.api.exceptions.PlivoRestException;
import com.plivo.api.models.message.MessageCreateResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "**")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SmsController {

  private final SmsService smsService;

  @PostMapping(
      value = "/outbound",
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public MessageCreateResponse sendSMS(@RequestBody SmsBuilderDTO smsBuilderDTO)
      throws IOException, PlivoRestException {
    return smsService.sendSMS(smsBuilderDTO);
  }
}
