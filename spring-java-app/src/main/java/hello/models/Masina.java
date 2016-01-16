package Telefon;

import java.util.List;
import java.util.ArrayList;

public class Telefon {
  private String model;
  private String marca;
  private String an_fabricatie;
  private int serie;
  private String culoare;
  
  

  public Masina() {}

  public Masina(String model, String marca, String an_fabricatie, int serie, String culoare) {
      this.model = model;
      this.marca = marca;
	  this.an_fabricatie = an_fabricatie;
	  this.serie = serie;
	  this.culoare = culoare;
	  
  }

  public String getModel() {
      return this.model;
  }

  public int getMarca() {
    return this.marca;
  }
  
  public int getAnFabricatie() {
    return this.an_fabricatie;
  }
  
  public int getSERIE() {
    return this.serie;
  }
  
  public int getCuloare() {
    return this.culoare;
  }
}
