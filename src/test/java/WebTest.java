import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class WebTest {

    @Test
    public void successfulSearchTest() {
        open("https://duckduckgo.com/");
        $("#searchbox_input").setValue("selenide").pressEnter();

        $$x("//*[@data-testid='result']")
                .shouldBe(size(10));
//                .shouldBe(texts("selenide"));
    }
}
