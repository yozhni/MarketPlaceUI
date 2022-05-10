package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.YamlPropertiesReader;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class MainTest {
        Logger log = Logger.getLogger(tests.MainTest.class);
        YamlPropertiesReader yamlPropertiesReader = new YamlPropertiesReader();


        @BeforeSuite
        public void setUP()
        {

            Selenide.clearBrowserCookies();
            Configuration.browser = yamlPropertiesReader.getSettingsFromYaml().getBrowser();
            Configuration.timeout = 20000;
            Configuration.pageLoadTimeout = 90000;
            Configuration.browserSize = "1600x700";
            Configuration.baseUrl="https://www.wildberries.ru";


          try {
                Selenide.open("/");
            }
            catch (Exception e)
            {
                log.error("Something went wrong while browser opening"+e);
            }


        }
        @AfterSuite
        public void closeWebDriver()
        { Selenide.closeWebDriver();
        }
    }




