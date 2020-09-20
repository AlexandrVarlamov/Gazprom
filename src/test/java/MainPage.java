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

    public boolean logInBtnClickability() {
        try {
            if (logIn.isDisplayed() && logIn.isEnabled()) {
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed as well");
        }
        return false;
    }

    public boolean joinBtnClickability() {
        try {
            if (join.isDisplayed() && join.isEnabled()) {
                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present, hence not displayed as well");
        }
        return false;
    }

    public boolean featuresBtnClickability() {
        try {
            if (features.isDisplayed() && features.isEnabled()) {
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
}