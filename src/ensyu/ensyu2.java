package ensyu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class ensyu2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",	"./exe/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();//ChromeDriver�̍쐬
		driver.get("https://rakuplus.jp/");//get()�Ńu���E�U�N��
		Thread.sleep(3000);//�������~(����m�F�̈�)
		//�u���E�U�̗v�f���w��@���\�b�h�����킩��₷���ł���ˁB
		WebElement	loginName	=	driver.findElement(By.name("log"));
		loginName.sendKeys("");
		WebElement	loginPass	=	driver.findElement(By.name("pwd"));
		loginPass.sendKeys("");
		WebElement	loginbtn	=	driver.findElement(By.name("wp-submit"));
		loginbtn.submit();
		Thread.sleep(2000);
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(),new File("C:\\Users\\�C�l\\SkyDrive\\�f�X�N�g�b�v\\screen\\" + file.getName()).toPath());
		driver.quit();	//�u���E�U�����B
	}
}
