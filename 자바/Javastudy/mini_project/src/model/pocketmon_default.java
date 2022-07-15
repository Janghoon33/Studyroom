package model;

public class pocketmon_default {

   
   int HP;
   int EXP;
   int MaxHP;
   public String name;
   int lv;
   public String skill1;
   public String skill2;
   public String skill3;
   private String id;

   

   public pocketmon_default(String name, int lv, int HP, int MaxHP, int EXP, String skill1, String skill2,
         String skill3, String id) {
      
      this.name = name;
      this.HP = HP;
      this.EXP = EXP;
      this.MaxHP = MaxHP;
      this.lv = lv;
      this.skill1 = skill1;
      this.skill2 = skill2;
      this.skill3 = skill3;
      this.id = id;
   }

   public pocketmon_default() {
   }
   
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public int getHP() {
      return HP;
   }

   public void setHP(int hP) {
      HP = hP;
   }

   public int getEXP() {
      return EXP;
   }

   public void setEXP(int EXP) {
      EXP = EXP;
   }

   public int getMaxHP() {
      return MaxHP;
   }

   public void setMaxHP(int maxHP) {
      MaxHP = maxHP;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getLv() {
      return lv;
   }

   public void setLv(int lv) {
      this.lv = lv;
   }

   public String getSkill1() {
      return skill1;
   }

   public void setSkill1(String skill1) {
      this.skill1 = skill1;
   }

   public String getSkill2() {
      return skill2;
   }

   public void setSkill2(String skill2) {
      this.skill2 = skill2;
   }

   public String getSkill3() {
      return skill3;
   }

   public void setSkill3(String skill3) {
      this.skill3 = skill3;
   }
}