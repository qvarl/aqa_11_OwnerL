package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTest extends TestBase{

    @Test
    void openPageTest() {
        open("/");
    }
}
