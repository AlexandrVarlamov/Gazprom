import io.qameta.allure.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {
    private final static String mainPage = ConfProperties.getProperty("mainpage");
    private final static String loginPage = "https://secure.last.fm/login";
    private final static String joinPage = "https://www.last.fm/join";
    private final static String featuresPage = "https://www.last.fm/features";

    public static MainPage page;
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();
        page = new MainPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(mainPage);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Check button LogIn")
    @Step("Click on button LogIn")
    @Test
    public void clickLogIn() {
        if (page.isLogInBtnClickability()) {
            page.clickLogInBtn();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Assert.assertEquals(loginPage, driver.getCurrentUrl());
        } else {
            System.out.println("Button LogIn isn't clickable!");
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Check button Join")
    @Step("Click on button Join")
    @Test
    public void clickJoin() {
        if (page.isJoinBtnClickability()) {
            page.clickJoinBtn();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Assert.assertEquals(joinPage, driver.getCurrentUrl());
        } else {
            System.out.println("Button Join isn't clickable!");
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Check button Features")
    @Step("Click on button Features")
    @Test
    public void clickFeatures() {
        if (page.isFeaturesBtnClickability()) {
            page.clickFeaturesBtn();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Assert.assertEquals(featuresPage, driver.getCurrentUrl());
        } else {
            System.out.println("Button Features isn't clickable!");
        }
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
