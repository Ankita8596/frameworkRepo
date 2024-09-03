package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("execute the createContactTest");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","Chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD =System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void modifyContact() {
		System.out.println("execute modify Contact");
	}
	@Test
	public void deleteContact() {
		System.out.println("execute modify Contact");
	}

}
