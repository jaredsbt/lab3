import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReverseInPlaceBigArray() {
	  int[] input1 = { 3, 2, 1 };
	  ArrayExamples.reverseInPlace(input1);
	  assertArrayEquals(new int[]{ 1, 2, 3 }, input1);
  }
  
  @Test
  public void testAverageWithoutLowest() {
	  double[] input1 = { 5.0 , 2.0, 6.0 , 7.0, 0.0};
	  assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
