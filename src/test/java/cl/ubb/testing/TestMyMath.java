package cl.ubb.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMyMath {

	@Test 
	public void AddTwoAndTwoIsFour(){
		//Arrange
		MyMath myMath = new MyMath();
		//Act
		int resultado = myMath.add(2, 2);
		//Assert 
		assertEquals(resultado,4);
	}
	
	public void AddMinusOneAndFourIsThree(){
		//Arrange
		MyMath myMath = new MyMath();
		//Act
		int resultado = myMath.add(-1, 4);
		//Assert 
		assertEquals(resultado,3);
	}
	
}
