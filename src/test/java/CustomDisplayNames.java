import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomDisplayNames {

  @DisplayName("Display name of container")
  @ParameterizedTest(name = "{index} => ''{0}'' is ranked {1} ({arguments})")
  @CsvSource({"apple, 1", "banana, 2", "'lemon, lime', 3"})
  void testWithCustomDisplayNames(String fruit, int rank) {
  }

}
