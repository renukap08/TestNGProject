package pckg2;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class CheckoutTest {
	
	@Test
    public void test4() {
        
        System.out.println("Inside Test-4");

    }
	
	@BeforeGroups("sanity")
	public void beforeG() {
		
		System.out.println("Inside Before Group");
	}
}
