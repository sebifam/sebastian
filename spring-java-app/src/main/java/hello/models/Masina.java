package hello;

import java.util.List;
import java.util.ArrayList;

public class Masina {
  private String name;
  private int id;

  public Masina() {}

  public Masina(int id, String name) {
      this.name = name;
      this.id = id;
  }

  public String getName() {
      return this.name;
  }

  public int getId() {
    return this.id;
  }
  public void setName(String name){
	  this.name=name;
  }
}
Chat Conversation End
