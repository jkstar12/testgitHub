package AA;

import java.awt.AWTException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AB {
	public static void main(String [] args) throws AWTException, InterruptedException, IOException
	{
		
		FileWriter wr = new FileWriter("C:\\Users\\user1\\Desktop\\Rahul.txt");
				BufferedWriter br = new BufferedWriter(wr);
				br.write("java program");
				System.out.println();
				br.write("easy to understand");
				
				br.close();
		
	}
}
		
//		FileReader fr = new FileReader("C:\\Users\\user1\\Desktop\\Rahul.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String str;
//		while((str = br.readLine())!=null)
//		{
//			System.out.println(str);
//		}
//		
//		br.close();
//	}
		
//}	
		
//		System.setProperty("webdriver.chrome.driver","D:\\velocity sw testing\\ChromeDriver\\chromedriver.exe" );
//		WebDriver driver = new ChromeDriver();
//		 driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
//	        //maximize the window
//	      driver.manage().window().maximize();
//	      WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//	      
//	    String row3 = ele1.getText();
//	      System.out.println("no of col are:"+row3);
//	      WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
//	     String col2 = ele2.getText();
//	      System.out.println("no of col are:"+col2);
	      
	      	
	      
	      
	      
	      //int col = ele1.size();
	      //System.out.println("no of col are:"+ele1.size());
	     // List <WebElement> ele2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	     // int row = ele2.size();
	      //System.out.println("no of col are:"+ele2.size());
	      
	      
	      
	      
	      
//	      WebElement email = driver.findElement(By.cssSelector("input#email"));
//	      
//	      Actions act = new Actions (driver);
//	      
//	      act.moveToElement(email)
//	      .click()
//	      .keyDown(email,Keys.SHIFT)
//	      .sendKeys(email, "hello")
//	      .keyUp(email, Keys.SHIFT)
//	      .doubleClick(email)
//	      .contextClick()
//	      .build()
//	      .perform();
	      
	      
//	      Robot robot = new Robot();
//	      robot.keyPress(KeyEvent.VK_Q);
//	      robot.keyRelease(KeyEvent.VK_Q);;
	      
	      
	      
//	      driver.get("http://www.facebook.com");
//	      WebElement username = driver.findElement(By.id("username"));
//	      JavascriptExecutor runJS= ((JavascriptExecutor) driver);
//	      runJS.executeScript("arguments[0].value='admin';", username);
//	      driver.quit();
	     
//	     WebElement ele = driver.findElement(By.xpath("(//label[starts-with(@id,'message')])[2]"));
	      
//	  String text = ele.getText();
//	  System.out.println(text);
//	      JavascriptExecutor jse  = ((JavascriptExecutor)driver);
//	      jse.executeScript("arguments[0].values ='1234';",ele );
//	      
//	          
//	      Thread.sleep(3000);
	      
//	      driver.close();
		
	
	




/*public static void isArmstrong(int num)
{
	int r;
	int cube = 0;
	int temp;
	temp = num;
	while(num>0)
	{
		r = num%10;
		num = num/10;
		cube = cube+(r*r*r);
	}	
	if(cube==temp)
		{
			System.out.println("armstrong no.");
		}
		else
		{
			System.out.println("not a armstrong no.");
		}
	
	
}
/*
String s = "java in prgramming in java is very good and java is well";
s= s.toLowerCase();
int count;
String str[] = s.split(" ");
for(int i=0;i<str.length;i++)

{
	count = 1;
	for(int j=i+1;j<str.length;j++)
	{
		if(str[i].equals(str[j]))
		{
			count++;
		}
	}
	if(count>1&&str[i]!="0")
	{
		System.out.println(count);
		System.out.println(str[i]);
	}
}

*/
//
//}
