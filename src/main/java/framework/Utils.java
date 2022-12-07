package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.attributeContains;

public class Utils {

    private static WebDriver driver = BasePage.driver;
    private static WebDriverWait wait = new WebDriverWait(driver, 15);
    private static Actions actions = new Actions(driver);
    private static String hex;




    public static void waitForElementPresent(WebElement webElement) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementIsClickable(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    public String checkPositionRevertElement(WebElement element){
        System.out.println(element.getCssValue("left"));
        return element.getAttribute("style");
    }

    public static void waitForElementHasAttribute(WebElement webElement) {
        wait.until(ExpectedConditions.domAttributeToBe(webElement,"left", "0"));
    }

    public static void switchToAlertAndAccept(){
        driver.switchTo().alert().accept();
    }


    public static void moveElement(WebElement element){
        actions.moveToElement(element).dragAndDropBy(element, 75, 0).build().perform();
    }
    public static void dragAndDropElement(WebElement element, int x , int y){
        actions.moveToElement(element).dragAndDropBy(element, x, y).build().perform();
    }

    public static void hoverElement(WebElement element){
        actions.moveToElement(element).build().perform();
    }


    public static void moveElementToOtherElement(WebElement element, WebElement otherElement){
        waitForElementPresent(element);
        actions.clickAndHold(element)
                .moveToElement(otherElement)
                .release(otherElement)
                .build().perform();
    }

    public static String convertToHexUtil(String element){
        hex = Color.fromString(driver.findElement(By.xpath(element)).getCssValue("background-color")).asHex();
        System.out.println(hex);
        return hex;
    }

    public static void moveByOfSet(WebElement element){
      actions.clickAndHold(element).moveByOffset(500, 300).release().build().perform();

    }

    public static boolean isElementPresent(String xpath) {
        return driver.findElements(By.xpath(xpath)).size() > 0;
    }

    public static boolean isElementEmpty(String xpath) {
        return driver.findElements(By.xpath(xpath)).size() < 1;
    }


    public static boolean isElementPresent(By by) {
        return driver.findElements(by).size() > 0;
    }

    public static String getText(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static JavascriptExecutor JSexecuter(String str) {
        return (JavascriptExecutor) ((JavascriptExecutor) driver).executeScript(str);
    }

    public static void selectDropDown(By name, String text) {
        Select selectCategory = new Select(driver.findElement(name));
        selectCategory.selectByVisibleText(text);
    }

    public static String extractDigits(String src) {
        Integer id;
        String str = src.replaceAll("\\D+", "");
        id = Integer.parseInt(str) + 1;
        str = String.valueOf(id);
        return str;
    }

    public static void navigateTo() {
        driver.navigate().back();
    }

    public static JavascriptExecutor JSexecuterToElement(String str, WebElement element) {
        return (JavascriptExecutor) ((JavascriptExecutor) driver).executeScript(str, element);
    }

    public static JavascriptExecutor scrollDown(){
        return  (JavascriptExecutor) ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
    }

    public static JavascriptExecutor scrollUp(){
        return  (JavascriptExecutor) ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)", "");
    }

    public static void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForElementVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitAlertIsPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void waitPresenceOfElementLocated(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated( locator));
    }

    public static void waitTextToBePresentInElementValue(WebElement element, String str){
        wait.until(ExpectedConditions.textToBePresentInElementValue(element,str));
    }

    public static void selectOptionFromMenu(WebElement element, String text){
        Select se = new Select(element);
        se.selectByVisibleText(text);
    }

    public static void frameToBeAvailableAndSwitchToIt(WebElement element){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }
}


