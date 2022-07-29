package com.board.test.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Data
@Table(name="tbl_member")
@RequiredArgsConstructor
@ToString(exclude = "portfolios")
public class Member {
   
   @Id
   private String mem_id;
   @NonNull
   private String mem_pw;
   @NonNull
   private String mem_name;
   @NonNull
   private String mem_email;
   @NonNull
   private String mem_address;
   @NonNull
   private String mem_phone;
   public String getMem_id() {
      return mem_id;
   }
   public void setMem_id(String mem_id) {
      this.mem_id = mem_id;
   }
   public String getMem_pw() {
      return mem_pw;
   }
   public void setMem_pw(String mem_pw) {
      this.mem_pw = mem_pw;
   }
   public String getMem_name() {
      return mem_name;
   }
   public void setMem_name(String mem_name) {
      this.mem_name = mem_name;
   }
   public String getMem_email() {
      return mem_email;
   }
   public void setMem_email(String mem_email) {
      this.mem_email = mem_email;
   }
   public String getMem_address() {
      return mem_address;
   }
   public void setMem_address(String mem_address) {
      this.mem_address = mem_address;
   }
   public String getMem_phone() {
      return mem_phone;
   }
   public void setMem_phone(String mem_phone) {
      this.mem_phone = mem_phone;
   }
   @Override
   public String toString() {
      return "Member [id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_name=" + mem_name + ", mem_email=" + mem_email + ","
            + " mem_address=" + mem_address + ", mem_phone=" + mem_phone + "]";
   }
   
   public String toLogin() {
      return "Member [id=" + mem_id + ", mem_pw=" + mem_pw + "]";
   }

}