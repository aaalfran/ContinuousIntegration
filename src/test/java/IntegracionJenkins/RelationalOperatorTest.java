package IntegracionJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelationalOperatorTest {

	@Test
	public void isGreaterTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 3));
	}
	
	@Test
	public void isGreaterTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isGreater(2, 1));
	}

	@Test
	public void isLessTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isLess(1, 4));
	}
	
	@Test
	public void isLessTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 1));
	}
	
	@Test
	public void goodWidthTest1() {
		
		RelationalOperator tester = new RelationalOperator();
		tester.goodWidth(3, 1, 4);
		
	}
	
	@Test
	public void goodWidthTest2() {
		RelationalOperator tester = new RelationalOperator();
		tester.goodWidth(1, 2, 4);
	}
	
	@Test
	public void goodWidthTest3() {
		RelationalOperator tester = new RelationalOperator();
		tester.goodWidth(5, 2, 4);
		
	}
	
	@Test
	public void goodHeightTest1() {
		RelationalOperator tester = new RelationalOperator();
		tester.goodHeight(3, 1, 4);
	}
	
	@Test
	public void goodHeightTest2() {
		RelationalOperator tester = new RelationalOperator();
		tester.goodHeight(1, 2, 4);
	}
	
	@Test
	public void goodHeightTest3() {
		RelationalOperator tester = new RelationalOperator();
		tester.goodHeight(5, 2, 4);
	}
}
