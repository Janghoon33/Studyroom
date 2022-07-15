package com.smhrd.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Message {
   private BigDecimal num;
   private String sendEmail;
   private String receiveEmail;
   private String message;
   private Timestamp date;
   
   public Message(BigDecimal num, String sendEmail, String receiveEmail, String message, Timestamp date) {
	super();
	this.num = num;
	this.sendEmail = sendEmail;
	this.receiveEmail = receiveEmail;
	this.message = message;
	this.date = date;
}

public Message(String sendEmail, String receiveEmail, String message) {
      super();
      this.sendEmail = sendEmail;
      this.receiveEmail = receiveEmail;
      this.message = message;
   }

   public BigDecimal getNum() {
      return num;
   }

   public String getSendEmail() {
      return sendEmail;
   }

   public String getReceiveEmail() {
      return receiveEmail;
   }

   public String getMessage() {
      return message;
   }

   public Timestamp getDate() {
      return date;
   }
   
   
}