package Swaggypageobjects;

import Readwrite.Data;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Swaggyapplicationobject extends Data {

    public  static WebDriver driver;

    public Swaggyapplicationobject()
    {
        PageFactory.initElements(driver,this);

    }



    public  void swaglaunch() throws  InterruptedException {
        driver.get(p.getProperty("baseurl"));
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.id("login-button"));
        Thread.sleep(3000);
        submit.click();
        Thread.sleep(3000);

    }

        public void Additemstocart () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
            Thread.sleep(3000);
        }

        public void Validatecart () throws InterruptedException{
            driver.findElement(By.className("shopping_cart_link")).click();
            Thread.sleep(3000);
            WebElement basketball = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
            String basketballText = basketball.getText();
            int i = Integer.parseInt(basketballText);
            if (i >= 0) {
                System.out.println("total added item is=" + i);
            } else {
                System.out.println("items are not there");
            }
        }

        public void Multipleitemsaddtocart () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
            Thread.sleep(4000);
        }

        public void Pricefilter () throws InterruptedException {
            Select select = new Select(driver.findElement(By.className("product_sort_container")));
            select.selectByVisibleText("Price (low to high)");
            Thread.sleep(9000);
        }

        public void Alphabeticalfilter () throws InterruptedException {
            Select select = new Select(driver.findElement(By.className("product_sort_container")));
            select.selectByVisibleText("Name (Z to A)");
            Thread.sleep(3000);
        }

        public void Verifyitemsincart ()
        {
            WebElement Cartverify = driver.findElement(By.id("cart_contents_container"));
            Cartverify.getText();
        }

        public void checkoutbtn()
        {
            WebElement checkoutbtn = driver.findElement(By.id("checkout"));
            checkoutbtn.click();
        }

        public void userdetails() throws InterruptedException {
            WebElement Firstname = driver.findElement(By.id("first-name"));
            Firstname.sendKeys("Akash");
            Thread.sleep(3000);
            WebElement lastname = driver.findElement(By.id("last-name"));
            lastname.sendKeys("kumar");
            Thread.sleep(3000);
            WebElement zipcode = driver.findElement(By.id("postal-code"));
            zipcode.sendKeys("423101");
            Thread.sleep(4000);
            WebElement continuebtn = driver.findElement(By.id("continue"));
            continuebtn.click();
            Thread.sleep(3000);
        }

        public void Placeorder () throws InterruptedException {
            WebElement finishbtn = driver.findElement(By.id("finish"));
            finishbtn.click();
            Thread.sleep(3000);
        }
    }

