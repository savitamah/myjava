
public class getterSetter {
  private String color;
  
  // Getter
  public String getColor() {
    return color;
  }
  
  // Setter
  public void setColor(String c) {
    this.color = c;
  }
  public static void main(String[] args) {
	  getterSetter v1 = new getterSetter();
	  v1.setColor("Red");
	  System.out.println(v1.getColor());
	}

}