package tests;

import config.ProjectConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase
{

    @BeforeAll
    static void setEnvironment()
    {
        ProjectConfiguration projectConfiguration = new ProjectConfiguration();
       // SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments () {
       /* Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();*/
    }
}
