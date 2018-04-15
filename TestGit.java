package lab2;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestGit {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String id = null;
  private String pwd = null;
  private String gitUrl = null;

  @Before
  public void setUp() throws Exception {
    
    driver = new FirefoxDriver();
    baseUrl = "http://121.193.130.195:8080";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGit() throws Exception {
      FileInputStream excelFileInputStream = new FileInputStream("input.xlsx");

XSSFWorkbook workbook = new XSSFWorkbook(excelFileInputStream);

excelFileInputStream.close();

XSSFSheet sheet = workbook.getSheetAt(0);

for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {

XSSFRow row = sheet.getRow(rowIndex);

if (row == null) {

continue;

}

XSSFCell nameCell = row.getCell(0); 

XSSFCell genderCell = row.getCell(1); 

StringBuilder InputInfoBuilder = new StringBuilder();

InputInfoBuilder.append("student ")

.append("id").append(nameCell.getStringCellValue())

.append("gitUrl").append(genderCell.getStringCellValue())

}
String gitUrls = driver.findElement(By.xpath("//tbody[@id = 'table-main']/tr[3]/td[2]")).getText();
        if (!gitUrl.equals(gitUrls)){
            System.out.println(id);
            System.out.println(gitUrl);
            System.out.println(gitUrls);
            continue;

workbook.close();
        assertEquals(gitUrl,gitUrls);
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
