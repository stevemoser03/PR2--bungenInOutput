package inputoutput.ue.inout;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bsp3PersonManager pm = new bsp3PersonManager();
		
		try {
			pm.load("/pr2exercise/person.txt");
		} catch (PersonManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pm.savePerson("/pr2exercise/sortedPersonList.txt");
		
		
	}

}
