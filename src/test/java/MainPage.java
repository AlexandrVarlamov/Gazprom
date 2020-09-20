import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".masthead-inner-wrap .site-auth a.site-auth-control[href*='login']")
    private WebElement logIn;

    @FindBy(css = ".masthead-inner-wrap .site-auth a.site-auth-control[href*='join']")
    private WebElement join;

    @FindBy(css = ".masthead-inner-wrap .navlist .js-navlist-items .masthead-nav-control[href*=features]")
    private WebElement features;

    public boolean isLogInBtnClickability() {
        try {
            if (isAvailable(logIn)) {
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed as well");
        }
        return false;
    }

    public boolean isJoinBtnClickability() {
        try {
            if (isAvailable(join)) {
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed as well");
        }
        return false;
    }

    public boolean isFeaturesBtnClickability() {
        try {
            if (isAvailable(features)) {
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed as well");
        }
        return false;
    }

    public void clickLogInBtn() {
        try {
            logIn.click();
        } catch (InvalidSelectorException exception) {
            System.out.println("Invalid selector for button LogIn!");
        }
        catch (NoSuchElementException exception) {
            System.out.println("Element isn't loaded!");
        }
        catch (ElementNotVisibleException exception) {
            System.out.println("Button LogIn isn't visible");
        }
    }

    public void clickJoinBtn() {
        try {
            join.click();
        } catch (InvalidSelectorException exception) {
            System.out.println("Invalid selector for button Join!");
        }
        catch (NoSuchElementException exception) {
            System.out.println("Element isn't loaded!");
        }
        catch (ElementNotVisibleException exception) {
            System.out.println("Button Join isn't visible");
        }
    }

    public void clickFeaturesBtn() {
        try {
            features.click();
        } catch (InvalidSelectorException exception) {
            System.out.println("Invalid selector for button Features!");
        }
        catch (NoSuchElementException exception) {
            System.out.println("Element isn't loaded!");
        }
        catch (ElementNotVisibleException exception) {
            System.out.println("Button Features isn't visible");
        }
    }

    public boolean isAvailable(WebElement element) {
        try {
            if (element.isDisplayed() && element.isEnabled()) {
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed as well");
        }
        return false;
    }
}