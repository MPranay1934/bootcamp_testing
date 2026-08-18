	package Utility;
	
	import java.io.File;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	
	public class Helper {
		public static void capturesScreenShot(WebDriver driver) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./ScreenShots/PracticeTestAuto_" + getCurrentDateTime() + ".png"));
				System.out.println("Captured Screenshot - On Failure");
			} catch (Exception e) {
				System.out.println("Exception While Taking Screenshot" + e.getMessage());
			}
		}
	
		public static String getCurrentDateTime() {
			DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			Date currentdate = new Date();
			return customFormat.format(currentdate);
		}
	
	}
