import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class AppTest {

  @BeforeAll
  static void beforeAll() {

  }

  @BeforeAll
   static void setup(){
    System.out.println("@BeforeAll executed");
  }

  @BeforeEach
  void setupThis(){
    System.out.println("@BeforeEach executed");
  }

  @Test
  void testCalcOne()
  {
    System.out.println("======TEST ONE EXECUTED=======");
    assertEquals( 2 , Calculator.add(2, 2));
  }

  @Test
  public void testCalcTwo()
  {
    System.out.println("======TEST TWO EXECUTED=======");
    assertEquals( 2 , Calculator.add(2, 4));
  }

  @AfterEach
  void tearThis(){
    System.out.println("@AfterEach executed");
  }

  @AfterAll
  static void tear(){
    System.out.println("@AfterAll executed");
  }

  private static class Calculator {

    public static int add(int i, int i1) {
      return i;
    }
  }
}
