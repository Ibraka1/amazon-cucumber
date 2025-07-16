package utilities;

import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReusableMethods {

    public static void wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickIfVisible(String locate) {
        List<WebElement> elements = Driver.getDriver().findElements(By.id(locate));
        if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
            elements.get(0).click();
        } else {
            System.out.println("No such element.");
        }
    }

    public static void takeScreenshot(String file){

        new File("screenshots").mkdirs();

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()); // Setting date format

        String fileName = "screenshots/"+"_"+ timestamp +".png"; // Creating a name rule

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(fileName);

        try {
            Files.copy(srcFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
