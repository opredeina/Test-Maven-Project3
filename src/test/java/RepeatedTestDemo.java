import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

public class RepeatedTestDemo {

  @BeforeEach
  void setUp(TestInfo testInfo, RepetitionInfo repetitionInfo, TestReporter reporter) {
    reporter.publishEntry(testInfo.getTestMethod().get().getName(),
        String.format("about to execute repetition %d of %d",
            repetitionInfo.getCurrentRepetition(),
            repetitionInfo.getTotalRepetitions()));
  }

  @DisplayName("Repeat!")
  @RepeatedTest(value = 3, name = "{displayName} {currentRepetition}/{totalRepetitions}")
  void customDisplayName() {
  }

}

