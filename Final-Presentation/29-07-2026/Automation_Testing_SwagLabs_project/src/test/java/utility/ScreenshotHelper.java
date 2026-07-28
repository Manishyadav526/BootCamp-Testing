package utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {

    // Automatically increments screenshot number
    private static int screenshotCount = 1;

    public static void captureScreenshot(WebDriver driver, String step) {

        // Create screenshots folder if it doesn't exist
        File folder = new File("screenshots");
        if (!folder.exists()) {
            folder.mkdir();
        }

        //Timestamp
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Screenshot file
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Destination
        File dest = new File(folder,
        		screenshotCount++ + "_" + step + "_" + timestamp + ".png");

        try {
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot Saved : " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}