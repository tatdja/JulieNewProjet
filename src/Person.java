public class Person {

	private String name;
	private String vorname;	
	private String nachnahme; 
	private String stadt;

	private String laendern;
	


	
	
	
	public Person() {
		

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

	public String getNachnahme() {
		return nachnahme;
	}

	public void setNachnahme(String nachnahme) {
		this.nachnahme = nachnahme;
	}


	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}



	public String getLaendern() {
		return laendern;
	}

	public void setLaendern(String laendern) {
		this.laendern = laendern;
	}



	public String getLaendern() {
		return laendern;
	}

	public void setLaendern(String laendern) {
		this.laendern = laendern;
	}
}
