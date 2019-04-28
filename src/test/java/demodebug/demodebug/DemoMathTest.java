package demodebug.demodebug;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoMathTest {
	
	
	@BeforeClass
	public void setup()
	{
		
		System.out.println("Enter into setup");
	}
	@Test
	public void testAdd()
	{
		int n1 = 10;
		int n2 = 5;
		int expected = 15;
		DemoMath demoMath = new DemoMath();
		int actual = demoMath.add(n1, n2);
		Assert.assertEquals(actual, expected);
	}
   @Test
        public void testSub()
        {
                int n1 = 10;
                int n2 = 5;
                int expected = 5;
                DemoMath demoMath = new DemoMath();
                int actual = demoMath.sub(n1, n2);
                Assert.assertEquals(actual, expected);
        }

	
}
