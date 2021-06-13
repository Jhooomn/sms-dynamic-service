package com.baron.sms.smsdynamicservice.service.impl;

import com.baron.sms.smsdynamicservice.dto.SmsBuilderDTO;
import com.baron.sms.smsdynamicservice.service.SmsService;
import com.plivo.api.Plivo;
import com.plivo.api.exceptions.PlivoRestException;
import com.plivo.api.models.message.Message;
import com.plivo.api.models.message.MessageCreateResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;

@Slf4j
@Service
public class DefaultSmsService implements SmsService {
  @Override
  public MessageCreateResponse sendSMS(SmsBuilderDTO smsBuilderDTO)
      throws PlivoRestException, IOException {
    Plivo.init(smsBuilderDTO.getAuthId(), smsBuilderDTO.getAuthToken());
    return Message.creator(
            smsBuilderDTO.getFrom(),
            Collections.singletonList(smsBuilderDTO.getTo()),
            smsBuilderDTO.getMessage())
        .create();
  }
}
