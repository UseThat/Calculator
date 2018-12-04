package bin;
import org.junit.Assert;
import org.junit.Test;





public class MathFunctionsTest {
	
	@Test
	public void testCreateMathFunction() {
		//is
		MathFunctions math = new MathFunctions(5.6,3.4);
		//then
		final double getA = math.getA();
		final double getB = math.getB();
		math.setA(11.5);
		final double setA = math.getA();
		math.setB(14.33);
		final double setB = math.getB();
		//expected
		Assert.assertEquals(5.6, getA,0);
		Assert.assertEquals(3.4, getB,0);
		Assert.assertEquals(11.5,setA,0);
		Assert.assertEquals(14.33, setB,0);
	}
	@Test
	public void testAdd() {
		//is
		double temp = 0;
		MathFunctions [] math = new  MathFunctions[5];
		for(int i = 0; i<math.length;i++) {
			
			math[i] = new MathFunctions(i,temp);
		}
		//then
		final double one = math[0].Add();
		final double two = math[1].Add();
		final double three = math[2].Add();
		final double four = math[3].Add();
		final double five = math[4].Add();
		//expected
		Assert.assertEquals(0, one,0);
		Assert.assertEquals(1, two,0);
		Assert.assertEquals(2, three, 0 );
		Assert.assertEquals(3, four,0);
		Assert.assertEquals(4, five,0);
		
	}
	
}
