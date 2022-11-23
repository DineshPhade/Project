package Readwrite;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data {
    public static WebDriver driver;
    String ApplicationURL;
    public static Properties p;

    public void Readdata() throws IOException {
        FileInputStream Fp = new FileInputStream("src/test/java/Properties/config.properties");
        p = new Properties();
        p.load(Fp);
        System.out.println("read the data= " + p.getProperty("baseurl"));
        ApplicationURL = p.getProperty("baseurl");
    }}
