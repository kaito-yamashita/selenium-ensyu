package ensyu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ensyu1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",	"./exe/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();//ChromeDriver�̍쐬
		driver.get("http:www.google.com");//get()�Ńu���E�U�N��
		Thread.sleep(3000);//�������~(����m�F�̈�)
		//�u���E�U�̗v�f���w��@���\�b�h�����킩��₷���ł���ˁB

		WebElement	searchBox	=	driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		searchBox.submit();
		Thread.sleep(3000);	
		
		WebElement	title	=	driver.findElement(By.cssSelector("div.yuRUbf > a > h3"));
		System.out.println(title.getText());
		
		driver.quit();	//�u���E�U�����B
	}
}
