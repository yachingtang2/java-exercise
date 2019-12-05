package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;


public class SingletonTest {
  @Test
  public void singletonInstanceFirstTime() {
    Singleton singleton = Singleton.getInstance();
    assertNotNull(singleton);
  }

  @Test
  public void singletonInstanceSecondTime() {
    Singleton singleton = Singleton.getInstance();
    assertNotNull(singleton);
    Singleton singleton2 = Singleton.getInstance();
    assertSame(singleton, singleton2);
    Assertions.assertEquals(singleton, singleton2);
  }
}
