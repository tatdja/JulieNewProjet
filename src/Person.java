public class Person {

	private String name;

	private String vorname;
	private boolean geschlecht; 
	
	
	public Person() {
		super();

	}

	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Meine name ist " + name + vorname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}

}
