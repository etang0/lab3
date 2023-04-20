import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1, 2};
    int[] input3 = {1, 2, 3};
    int[] input4 = {};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    ArrayExamples.reverseInPlace(input3);
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{2, 1}, input2);
    assertArrayEquals(new int[]{3, 2, 1}, input3);
    assertArrayEquals(new int[]{}, input4);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1};
    int[] input3 = {1, 2};
    int[] input4 = {1, 2, 3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input4));
  }

}
