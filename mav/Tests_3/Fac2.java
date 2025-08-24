package Tests_3;

import org.testng.annotations.Factory;

public class Fac2 {
	@Factory
	public Object[] createInstances() {
		return new Object[] {
		new factories("https://www.google.com"),
		new factories("https://o2.openmrs.org/openmrs/login.htm"),
        new factories("https://www.facebook.com")
	};
	}
}
 