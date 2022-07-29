package com.board.test.domain;

import java.io.File;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@RequiredArgsConstructor
@Table(name="tbl_senior")
public class Senior {
   @Id
   private int S_num;
   @NonNull
   private String S_name;
   @NonNull
   private String S_birth;
   @NonNull
   private String S_gender;

   @NonNull
   private String S_phone;
   @NonNull
   private String S_address;
   @NonNull
   private String S_care;
   @NonNull
   private String mem_id;
   
   
   
   public String toString() {
	      return "Senior [id=" + mem_id + ", id받아오기=" + mem_id + "]";
	   }
   

   
}