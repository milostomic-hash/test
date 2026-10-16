package tests.pilotPageClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.interactions.Actions;


public class ProtocolPageClass {
	
	WebDriver driver;
	WebDriverWait wait;
		
     @FindBy(css = ".ext-text-box")
	//@FindBy(css = ".form-control.ltr_override.input.ext-input.text-box.ext-text-box")
	WebElement signinputUserElement;
	
	@FindBy(id = "idSIButton9")
	WebElement buttonLoginFirst;
	
	@FindBy(id = "passwordInput")
	WebElement passwordFieldElement;
	
	@FindBy(css = "#submitButton")
	WebElement submittButtonLogin;
	
	@FindBy(css = "#idBtn_Back")
	WebElement finalSubmitToProtocol;
	
	@FindBy(css = "[data-step-number=\"2\"][class=\"circleElement notFilledInactive\"]")   
	WebElement hoverPersonelStep;
	
	@FindBy(css = "[data-step-number=\"3\"][class=\"circleElement notFilledInactive\"]")		
	WebElement hoverDepartmentStep;
	
	@FindBy(css = "[data-step-number=\"4\"][class=\"circleElement notFilledInactive\"]") 	
	WebElement hoverContactStep;
	
	@FindBy(css = "[data-step-number=\"5\"][class=\"circleElement notFilledInactive\"]") 	
	WebElement hoverDocumentStep;
	
	@FindBy(css = "[data-step-number=\"1\"][class = \"circleElement completed\"]")
	WebElement markedAsComplete1Step;
	
	@FindBy(xpath = "//li[4]/button/span/span[2]")			
	WebElement markAsComplete;
	
	@FindBy(xpath = "//button[@id='crit_submreview|NoRelationship|Form|new.crit_submreview.Command2.UnmarkAsComplete30-button']/span/span[2]")	
	WebElement unmarkAsComplete;
	
	@FindBy(xpath = "//ul[@id='id-8eb97eff-f252-ee11-be6f-6045bd033ad8-12-crit_subreviewcontactperson270bd3db-d9af-4782-9025-509e298dec0a-crit_subreviewcontactperson.fieldControl-LookupResultsDropdown_crit_subreviewcontactperson_2_SelectedRecordList']")
	WebElement hoverContactPersonField;			
	
	@FindBy(xpath = "//*[@id='id-8eb97eff-f252-ee11-be6f-6045bd033ad8-12-crit_subreviewcontactperson270bd3db-d9af-4782-9025-509e298dec0a-crit_subreviewcontactperson.fieldControl-LookupResultsDropdown_crit_subreviewcontactperson_37_selected_tag_delete_0']\r\n"
			+ "")
	WebElement deleteContactPersonField;				

	@FindBy(css = "[data-id=\"warningNotification\"]")		
	WebElement errorCoPiBanner;
	
	@FindBy(css = "[data-id=\"warningNotification\"]")    
	WebElement errorCRMBanner;
	
	@FindBy(css = "[data-id=\"warningNotification\"]")    
	WebElement errorDocumentanner;
	
	@FindBy(xpath = "//div[@id='id-8eb97eff-f252-ee11-be6f-6045bd033ad8-33-cc_pers-pcf-container-id']/div/div[2]/div/div[2]/div/div/button/span")	// Add personnel 
	WebElement addPersonnelButton;
	
	@FindBy(xpath = "//div[@id='tab-section0']")
	WebElement scrollDown;
	
	@FindBy(xpath = "//div[2]/div/input")
	WebElement textBoxPersonnel;
	
	@FindBy(xpath = "//button/span/div")
	WebElement overElementDropdown;
	
	@FindBy(xpath = "//button[contains(.,'Yes, Add')]")
	WebElement certificationsPopUp;
	
	@FindBy(xpath = "//div[3]/div/div/div[2]/div/input")	  
	WebElement coPiPersonnelTextBox;
	
	@FindBy(xpath = "//span[contains(.,'Co-PI')]")	
	WebElement dropdownCoPiPersonnel;
	
//	@FindBy(xpath = "xpath=//section[2]/div/div/div/div/div/div/div[2]/div/div/div/div") // Save Co-Pi
//	WebElement saveCoPiElement;
	
	@FindBy(xpath = "//button[2]/span/span/span")	   		
	WebElement saveMainPeronnelButton;
	
	@FindBy(xpath = "//div[3]/div/div/div/div[2]/div/div/div[2]/div/input")
	WebElement crmFieldTextBox;
	
	@FindBy(xpath = "//div[2]/div[2]/div/button/span")
	WebElement crmDropdownElement; 
	
	@FindBy(xpath = "//div[2]/div/div/button/span/span/span")
	WebElement crmSaveContactForm;
	
	// KONSTRUKTOR ------------------------------------------------------------------------------------------
	
    public ProtocolPageClass(WebDriver driver) {        
		
		this.driver = driver;					          
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
	} 
	
    public void typeUsernameSignIn(String usernameSignIn) {
    	
    	wait.until(ExpectedConditions.visibilityOf(signinputUserElement)).clear();
    	signinputUserElement.sendKeys(usernameSignIn);	
    }
       
    public void clickButtonSignIn1 () {
		
		wait.until(ExpectedConditions.elementToBeClickable(buttonLoginFirst)).click();	
	}
    
   public void typePasswordSignIn1(String passwordSignInPilot) {
		
		wait.until(ExpectedConditions.visibilityOf(passwordFieldElement)).clear();
		passwordFieldElement.sendKeys(passwordSignInPilot);	
	}
      
   public void clickButtonSignIn2 () {
		
		wait.until(ExpectedConditions.elementToBeClickable(submittButtonLogin)).click();	
	}
   
   public void clickButtonSignInFinal3 () {
		
		wait.until(ExpectedConditions.elementToBeClickable(finalSubmitToProtocol)).click();	
	}
     
   public void hoverStepperAll () {
	   
	   Actions action = new Actions(driver);
	   wait.until(ExpectedConditions.visibilityOf(hoverPersonelStep));
	   action.moveToElement(hoverPersonelStep).perform();      

	   Actions action2 = new Actions(driver);
	   wait.until(ExpectedConditions.visibilityOf(hoverDepartmentStep));
	   action2.moveToElement(hoverDepartmentStep).perform();
   
	   Actions action3 = new Actions(driver);
	   wait.until(ExpectedConditions.visibilityOf(hoverContactStep));
	   action3.moveToElement(hoverContactStep).perform();
	   
	   Actions action4 = new Actions(driver);
	   wait.until(ExpectedConditions.visibilityOf(hoverDocumentStep));
	   action4.moveToElement(hoverDocumentStep).perform();
	   
   }
   
   public void MarkUnmarkAsComplete() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[4]/button/span/span[2]"))).click();
	   
   }
   
   public void deleteRequiredFieldsFromPersonnel() {	   	      
	   
	/*   Actions action = new Actions(driver);
	   wait.until(ExpectedConditions.visibilityOf(hoverContactPersonField)); 
	   action.moveToElement(hoverContactPersonField).perform();  	   
   		   	   
	   Actions actions = new Actions(driver);
	   actions.moveToElement(deleteContactPersonField).click().build().perform(); 
		deleteContactPersonField.click();   */
	   		   
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("\"id-8eb97eff-f252-ee11-be6f-6045bd033ad8-12-crit_subreviewcontactperson270bd3db-d9af-4782-9025-509e298dec0a-crit_subreviewcontactperson.fieldControl-LookupResultsDropdown_crit_subreviewcontactperson_2_selected_tag_delete_0\""))).click();
	      
   }
   
   //------------------------------------------------- PERSONNEL STEP --------------------------------------------------------------
    
   public void clickPersonnelStep() {
	   
	 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-step-number='2'].notFilledInactive"))).click();
	 
   }	
   
   public String getTextFromCoPiBanner () {
	   
	   wait.until(ExpectedConditions.visibilityOf(errorCoPiBanner));
	   return errorCoPiBanner.getText();
   } 
   
   public void Add1Personnel () {
	      
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tab-section0']")));  
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tab-section0']"))); 
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tab-section0']"))); 	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='id-8eb97eff-f252-ee11-be6f-6045bd033ad8-33-cc_pers-pcf-container-id']/div/div[2]/div/div[2]/div/div/button/span"))).click();   // Add button click   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[25]"))); 
	   
	   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/input")));        
	   element.click();
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
       WebElement elementAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span/div")));
	   elementAdd.click(); 					// adding a person into textbox

	   wait.until(ExpectedConditions.elementToBeClickable(certificationsPopUp)).click();
	   	   
	   wait.until(ExpectedConditions.visibilityOf(coPiPersonnelTextBox)).click();
	   wait.until(ExpectedConditions.elementToBeClickable(dropdownCoPiPersonnel)).click();
//	   wait.until(ExpectedConditions.elementToBeClickable(saveCoPiElement)).click();
	   wait.until(ExpectedConditions.elementToBeClickable(saveMainPeronnelButton)).click();
	   
	   
//	   wait.until(ExpectedConditions.elementToBeClickable(hoverDepartmentStep)).click();  // Click on Department step
	   
   }
   
   public void Add2Personnel () {   	
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tab-section0']")));  
	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/button/span/span/span"))).click();   
	   
	   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/input")));        
	   element.click();
	   
	   WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sug-2 .ms-TagItem-TextOverflow")));     
	   element2.click();
	   
	   WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath=//div[3]/button/span")));     
	   element3.click();
	   
	   WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath=//div[3]/div/div/div[2]/div/input")));     
	   element4.click();
	   
   }
   
   public void DepartmentsStep() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(hoverDepartmentStep)).click();  
	   
   }
   
   public void ContactStep() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(hoverContactStep)).click();           
   }
   
   public String getTextFromCRMBanner () {														
	   
	   wait.until(ExpectedConditions.visibilityOf(errorCRMBanner));
	   return errorCRMBanner.getText();
   }
   
   public void CRMContact() {
	   
	  wait.until(ExpectedConditions.elementToBeClickable(crmFieldTextBox)).click();
	  wait.until(ExpectedConditions.elementToBeClickable(crmDropdownElement)).click();
	  wait.until(ExpectedConditions.elementToBeClickable(crmSaveContactForm)).click();
   }
   
   public void deleteCRMContactField() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ms-Button-label.label-426"))).clear();   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/button/span/span/span"))).click();   
   }
   
   //---------------------------------------------------- DOCUMENT STEP ---------------------------------------------------------------
   
   public void DocumentsStep() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(hoverDocumentStep)).click();   	   
   }
   
   public String getTextFromDocumentBanner () {														
	   
	   wait.until(ExpectedConditions.visibilityOf(errorDocumentanner));
	   return errorDocumentanner.getText();
   }
   
   public void answerQuestion1() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select"))).click();
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("id-8eb97eff-f252-ee11-be6f-6045bd033ad8-40-crit_sponsoredbymsk3ef39988-22bb-4f0b-bbbe-64b5a3748aee-crit_sponsoredbymsk.fieldControl-option-set-select"))).click();

   }
   
   
   
   
   
   
   
   
   
	
	

}
