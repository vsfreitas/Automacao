import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vinicius Freitas\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();



        driver.get("http://10.238.58.26:7001/arsys/shared/login.jsp?/arsys/home");

        WebElement login = driver.findElement(By.id("username-id"));
        login.sendKeys("80525359");
        WebElement password = driver.findElement(By.id("pwd-id"));
        password.sendKeys("Operacao@zup");
        WebElement btnLogin = driver.findElement(By.name("login"));
        btnLogin.click();

        try { Thread.sleep (10000); } catch (InterruptedException ex) {}

        WebElement app = driver.findElement(By.id("reg_img_304316340"));
        app.click();

        WebElement gerInc = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[5]/div/div[10]/div/div[1]/a/span"));
        gerInc.click();



//        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
//
//
//
//        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
//
//        WebElement log = driver.findElement(By.className("log-data-header"));
//        log.click();
//        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
//        String respPayload = driver.findElement(By.id("code-box-1524315421952")).getText();
//        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
//        WebElement selecionaRequisicao = driver.findElement(By.xpath("//*[@id=\"api-manager\"]//nav/ul/li[2]"));
//        selecionaRequisicao.click();

        //driver.close();


    }
}
