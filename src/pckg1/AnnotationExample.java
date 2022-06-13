package pckg1;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class AnnotationExample {
	    
	    
	    @BeforeTest
	    public void beforeT() {
	        
	        System.out.println("Inside Before Test");
	    }
	    
	    
	    @BeforeMethod(alwaysRun=true)
	    public void beforeM() {
	        
	        System.out.println("Inside Before Method");
	    }
	    
	    @Test(groups= {"sanity","regression"})
	    public void test1() {
	        
	        System.out.println("Inside Test case 1");
	    }
	    
	    @Test (priority=2, groups= {"regression"}, enabled = true, description="to test all the login scenarios")
	    public void test2() {
	        
	        System.out.println("Inside Test case 2");
	    }
	    
	    @Test(priority=0,timeOut=10000)
	    public void test5() {
	        
	        System.out.println("Inside Test case 5");
	    }
	    
	    
	    @AfterMethod
	    public void afterM() {
	        
	        System.out.println("Inside After Method");
	    }
	    
	   
	    
	    @AfterTest
	    public void afterT() {
	        
	        System.out.println("Inside After Test");
	    }

	}
