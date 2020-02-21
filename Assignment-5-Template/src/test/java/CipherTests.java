import static org.junit.Assert.assertEquals;

import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Test;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {

  @Test
  public void caesarCiphergetTextTest1(){
  CaesarCipher cipher = new CaesarCipher("hello");
  assertEquals(cipher.getText(), "czggj");
  }

  @Test
  public void caesarCiphergetTextTest2(){
    CaesarCipher cipher = new CaesarCipher("hello child");
    assertEquals(cipher.getText(), "czggj xcdgy");
  }

  @Test
  public void caesarCiphergetTextTest3(){
    CaesarCipher cipher = new CaesarCipher("HELLO child");
    assertEquals(cipher.getText(), "CZGGI xcdgy");
  }

  @Test
  public void caesarCiphergetTextTest4(){
    CaesarCipher cipher = new CaesarCipher("h5llo chi7d");  //testing for numbers in string
    assertEquals(cipher.getText(), "c5ggj xcd7y");        //idk what result should be
  }

  /**@Test
  public void elbonianCiphergetTextTest1(){
    ElbonianCipher cipher = new ElbonianCipher();
    assertEquals(cipher.getText("This is a message"), "20080919S0919S01S13051919010705");
  }*/


}
