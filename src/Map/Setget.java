package Map;

 class Setget1 {
    String EmployeeName;
    int id;
	public String getName() {
		return EmployeeName;
	}
	public  void setName(String name) {
	   this.EmployeeName=name;
	  
	}
	public int getId() {
		return id;
	}
	public  void setId(int id) {
	   this.id=id;
	  
	}
}
public class Setget{
	public static void main(String args[]) {
		Setget1 ob=new Setget1();
	   ob.setName("Harry");
	   System.out.println(ob.getName());
		ob.setId(23);
		System.out.println(ob.getId());
	}
	
}

