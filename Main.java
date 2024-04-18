import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public final class Main {
    private WebDriver driver;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("web driver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); // Set path to your chromedriver
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        Map<String, Object> vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
    }
    @Test
    public void dashboard() throws InterruptedException {
        driver.get("https://response24-sa-uat-87856.web.app/provider/pgs/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,
                TimeUnit.SECONDS);
        //driver.manage().window().setSize(new Dimension(1050, 880));
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("gehlotchirag777@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("ciuynT");
        driver.findElement(By.cssSelector(".btn")).click();
        //   driver.findElement(By.cssSelector(".swal2-confirm")).click();
        //for dashboard
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[1]/a/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[3]/a/p")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[4]/a/p")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[5]/a/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"reports\"]/ul/li/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/div[1]/div[2]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"collapseExample\"]/ul/li[1]/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"collapseExample\"]/ul/li[2]/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-profile-cmp/div/div/div/div/div/div[3]/div/div/div/div/div[1]/ul/li[1]/a/i")).click();
        Thread.sleep(1000);
        //dashboard
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[1]/a/p")).click();
        Thread.sleep(1000);
        //elements inside dashboard
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[3]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[4]/a/i")).click();
        Thread.sleep(2000);
        /* 1 element in primary */
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a/i")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"responseServicesDataTablePrimary\"]/tbody/tr/td[9]/button/span")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a/p")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a/p")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id="mat-input-11"]")).sendKeys("958019");
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[3]/a/p")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id='mat-input-11']")).sendKeys("958019");
//        Thread.sleep(2000);
        //for responder
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a/p")).click();
        Thread.sleep(3000);
//        //customer response action
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[3]/a/p")).click();
//        Thread.sleep(1000);
//        //tower
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-custom-response-service-action/div/div/div/div/div/div[2]/div/div/div/ul/li[1]/a")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys("56789");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"tower\"]/div/div[2]/button")).click();
//        Thread.sleep(1000);
//        //from back to response action
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[3]/a/p")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-custom-response-service-action/div/div/div/div/div/div[2]/div/div/div/ul/li[2]/a")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"user\"]/div/span[1]/div/input")).sendKeys("Mathew");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"user\"]/div/span[2]/div/input")).sendKeys("8393248899");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"mat-input-16\"]")).sendKeys("United States");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"user\"]/div/span[4]/div/input")).sendKeys("37.09024");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"user\"]/div/span[5]/div/input")).sendKeys("-95.712891");
//        Thread.sleep(1000);
//        //send request
//        driver.findElement(By.xpath("//*[@id=\"user\"]/div/button")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[11]/div/div[3]/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
//        Thread.sleep(3000);
//        //driver request
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-custom-response-service-action/div/div/div/div/div/div[2]/div/div/div/ul/li[3]/a")).click();
//        Thread.sleep(3000);
//     //input
//          driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[1]/div/input")).click();
//        Thread.sleep(1000);
//          driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[2]/div/input")).click();
//          Thread.sleep(1000);
//
//          driver.findElement(By.linkText("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-custom-response-service-action/div/div/div/div/div/div[2]/div/div/div/ul/li[3]/a")).click();
////        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-custom-response-service-action/div/div/div/div/div/div[2]/div/div/div/ul/li[3]/a")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[1]/div/input")).sendKeys("Mathews");
//        driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[2]/div/input")).sendKeys("8393248899");
////        //location
//        driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("Carrington");
//        driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[4]/div/input")).sendKeys("47.45408107630202");
//        driver.findElement((By.xpath("//*[@id=\"driver\"]/div/span[5]/div/input"))).sendKeys("-99.12963605886245");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys("Jamestown");
//        driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[7]/div/input")).sendKeys("47.949513173616054");
//        driver.findElement(By.xpath("//*[@id=\"driver\"]/div/span[8]/div/input")).sendKeys("-98.90685376332662");
//       //driver send request
//        driver.findElement(By.xpath("//*[@id=\"driver\"]/div/button")).click();
//        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
//        Thread.sleep(1000);

        //historical response actions left space under before report
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[4]/a/p")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-historical-response-service-actions/div/div/div/div/div/div[2]/div[3]/div/mat-table/mat-row[1]/mat-cell[8]/button")).click();
//        Object[] elementToScrollTo = new Object[0];
//        js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        Thread.sleep(2500);
//        elementToScrollTo.wait();
//
//        driver.findElement(By.xpath("//*[@id=\"mat-chip-list-172\"]/div/mat-chip")).click();
//        Thread.sleep(2500);
        //activity report
        driver.findElement(By.xpath("//*[@id=\"reports\"]/ul/li/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/provider-activity-report-component/div/div/div/div/div[1]/div[2]/div/div[4]/button")).click();
        Thread.sleep(1000);

        //internal testing chirag
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/div[1]/div[2]/a")).click();
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-profile-cmp/div/div/div/div/div/div[3]/div/div/div/div/div[1]/ul/li[2]/a")).click();
//        Thread.sleep(1000);
        //update profile
//        driver.findElement(By.xpath("//*[@id=\"link10\"]/form/button")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[12]/div/div[3]/button[1]")).click();

//        //logout
//
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/div[1]/div[2]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"collapseExample\"]/ul/li[3]/a")).click();
//
//        //login after logout
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-login-layout/nav/div/div[2]/ul/li[2]/a")).click();
//        Thread.sleep(1000);
//
//        //forgot password
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-login-layout/nav/div/div[2]/ul/li[1]/a")).click();
//        Thread.sleep(1500);
//
//        //reset my password
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-login-layout/app-provider-forgot-password-cmp/div/div/div/div/div/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("gehlotchirag777@gmail.com");
//        Thread.sleep(500);
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-login-layout/app-provider-forgot-password-cmp/div/div/div/div/div/div/div/div/div[2]/form/div[3]/a")).click();
//
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-login-layout/nav/div/div[2]/ul/li[2]/a")).click();
//        Thread.sleep(1000);

        driver.quit();
    }
}
