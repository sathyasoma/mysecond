import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicTest {
	
	Basic basic= new Basic();
	
	@Test
	public void addtest() {
		int result=basic.addition(3,4);
		assertEquals(7,result);
	}
	@Test
	public void subtest() {
		int result=basic.subtraction(40,30);
		assertEquals(10,result);
	}
	@Test
	public void multest() {
		int result=basic.multiplication(7,12);
		assertEquals(84,result);
	}
	@Test
	public void divtest() {
		int result=basic.division(80,8);
		assertEquals(10,result);
	}
}

