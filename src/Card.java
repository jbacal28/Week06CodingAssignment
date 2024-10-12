
public class Card {

  //fields
  int value;
  String name;
  
  
  //Getters and Setter
public int getValue() {
  return value;
  
}
public void setValue (int value) {
  this.value = value;
}

public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

//Methods- that prints out the information about the card.
public void describe() {
  System.out.println(this.name + " = " + this.value);
}


  }

