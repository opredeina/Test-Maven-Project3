import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTests {

  @ParameterizedTest
  @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
  void palindromes(String candidate) {
    AtomicReference<Object> StringUtils = new AtomicReference<>();
    assertTrue(StringUtils.equals(1));
  }

  @ParameterizedTest
  @NullAndEmptySource
  @ValueSource(strings = {" ", "   ", "\t", "\n"})
  void palindromesWithNullEmptyAndBlanks(String candidate) {
    AtomicReference<Object> StringUtils = new AtomicReference<>();
    assertTrue(StringUtils.equals(2));
  }
}
