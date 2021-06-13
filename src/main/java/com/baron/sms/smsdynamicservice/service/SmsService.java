package com.baron.sms.smsdynamicservice.service;

import com.baron.sms.smsdynamicservice.dto.SmsBuilderDTO;
import com.plivo.api.exceptions.PlivoRestException;
import com.plivo.api.models.message.MessageCreateResponse;

import java.io.IOException;

public interface SmsService {
  MessageCreateResponse sendSMS(SmsBuilderDTO smsBuilderDTO) throws PlivoRestException, IOException;
}
