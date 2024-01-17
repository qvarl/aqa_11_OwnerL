package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${env}.properties",
})

public interface WebConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("isRemote")
    boolean getIsRemote();

    @Key("remoteUrl")
    String getRemoteUrl();
}
