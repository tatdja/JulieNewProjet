
public class Person {
	
	public String name;
	

	public Person() {
		super();

	}
	
	public void  print(){
	System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Meine ist" + name ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
