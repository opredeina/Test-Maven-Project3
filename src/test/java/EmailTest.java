import org.junit.jupiter.api.*;

@Nested
@DisplayName("Тесты на email рассылку")
class EmailTest {

    @Test
    @DisplayName("Email должен быть отправлен новому пользователю")
    void emailShouldBeSentForNewUser() {
        System.out.println("New");

    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Email должен быть отправлен забаненому пользователю")
    void emailShouldBeSentForBannedUser() {
        System.out.println("Ban");

    }

    @Disabled("P73PE-197")
    @Test
    @DisplayName("Email должен быть отправлен в случае изменения PaymentMethod")
    void emailShouldBeSentAfterChangePaymentMethod() {
        System.out.println("Changes");
    }
}