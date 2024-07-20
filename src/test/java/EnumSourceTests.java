import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

public class EnumSourceTests<Rank> {

  @ParameterizedTest
  @EnumSource(value = ChronoUnit.class)
  void enumSourceWithValue(TemporalUnit unit) {
    final TemporalUnit temporalUnit;
    temporalUnit = assertNotNull(unit);
  }

  private TemporalUnit assertNotNull(TemporalUnit unit) {
    return unit;
  }

  private static class PRIVATE {

    public static <Rank> int compareTo() {
      final AtomicInteger compareTo = new AtomicInteger(compareTo(null));
      return compareTo.get();
    }

    public static <Rank> int compareTo(Rank rank) {
      return 0;
    }
  }
}
