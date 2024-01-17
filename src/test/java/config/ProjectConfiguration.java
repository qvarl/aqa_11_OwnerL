package config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Configuration.*;

import java.util.Map;

import static com.codeborne.selenide.Configuration.browserCapabilities;

public class ProjectConfiguration {

    private final WebConfig config;

    public ProjectConfiguration(){
        this.config = ConfigFactory.create(WebConfig.class, System.getProperties());
        setConfig();
    }

    public void setConfig()
    {
        browser = config.getBrowser();
        browserVersion =config.getBrowserVersion();
        browserSize = System.getProperty("browserSize", "1920x1080");
        baseUrl = config.getBaseUrl();
        pageLoadTimeout = 50000;
        holdBrowserOpen = true;

        if (config.getIsRemote())
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));

            browserCapabilities = capabilities;
            remote = config.getRemoteUrl();
        }
    }
}
