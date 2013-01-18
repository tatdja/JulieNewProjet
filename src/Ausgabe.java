
public class Ausgabe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Julie");
		person.getNachnahme();
		person.print(); 
		System.out.println(person.getDate()); 
	}

}
