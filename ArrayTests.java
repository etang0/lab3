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

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {};
    double[] input2 = {5};
    double[] input3 = {5, 10};
    double[] input4 = {10, 5};
    double[] input5 = {5, 10, 30};
    double[] input6 = {30, 10, 5};
    double[] input7 = {-5, -10, 5};
    double[] input8 = {5, 5, 5, 15, 15};

    double result1 = 0;
    double result2 = 0;
    double result3 = 10;
    double result4 = 10;
    double result5 = 20;
    double result6 = 20;
    double result7 = 0;
    double result8 = 10;
    double delta = .1;
    assertEquals(result1, ArrayExamples.averageWithoutLowest(input1), delta);
    assertEquals(result2, ArrayExamples.averageWithoutLowest(input2), delta);
    assertEquals(result3, ArrayExamples.averageWithoutLowest(input3), delta);
    assertEquals(result4, ArrayExamples.averageWithoutLowest(input4), delta);
    assertEquals(result5, ArrayExamples.averageWithoutLowest(input5), delta);
    assertEquals(result6, ArrayExamples.averageWithoutLowest(input6), delta);
    assertEquals(result7, ArrayExamples.averageWithoutLowest(input7), delta);
    assertEquals(result8, ArrayExamples.averageWithoutLowest(input8), delta);
  }

}
