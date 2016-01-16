package Telefon;

import java.util.List;
import java.util.ArrayList;

public class Telefon {
  private int id;
  private String marca_telefon;
  private String caracteristici_telefon;
  private String model;
  private int IMEI;
  
  

  public Telefon() {}

  public Telefon(int id,String marca_telefon, String caracteristici_telefon, String model, int IMEI) {
	  this.id = id;
      this.marca_telefon = marca_telefon;
      this.caracteristici_telefon = caracteristici_telefon;
	  this.model = model;
	  this.IMEI = IMEI;
	  
  }
  
  public int getID() {
    return this.id;
  }

  public String getMarcaTelefon() {
      return this.marca_telefon;
  }

  public int getCaracteristici() {
    return this.caracteristici_telefon;
  }
  
  public int getModel() {
    return this.model;
  }
  
  public int getIMEI() {
    return this.IMEI;
  }
}
