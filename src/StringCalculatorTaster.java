
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class StringCalculatorTaster {
  
  @Test
  public void add_Empty_String_Gives_Zero() throws Exception {
	  
    assertEquals(0, new StringCalculator().add(""));
  
  
  
  }
  
  @Test 
  public void OneNumberReturnsOne() {
	  
	    assertEquals(1, new StringCalculator().add("1"));
	  
	  
	  
	  }
  
  @Test 
  public void TwoNumberReturnsSum() {
	  
	    assertEquals(3, new StringCalculator().add("1,2"));
  
	  
  }
  
  
  @Test 
  public void MULTYFULNumberReturnsSum() {
	  
	    assertEquals(6, new StringCalculator().add("1,2,3"));
  
  
  
  
  
  }
  
  
  
  
  
  
  
  
  
  }