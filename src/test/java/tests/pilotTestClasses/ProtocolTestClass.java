package tests.pilotTestClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProtocolTestClass extends BaseClassPilot {

	@BeforeMethod
	public void navigatioPilot () {
		
		driver.navigate().to("https://mijaila1env001.crm.dynamics.com/main.aspx?appid=2309b862-85b4-4d6e-a7b6-251e48b7e44e&forceUCI=1&pagetype=entityrecord&etn=crit_submreview&id=a03db18d-c903-ef11-9f89-000d3a347676");
	    SignInToPilot();
	}	
	
	/*
		@AfterMethod
		public void deleteCookiesPilot() {
			
			driver.manage().deleteAllCookies();
		}	
  */
				
		@Test									
		public void SignInToPilot() {
			
			protocolStep.typeUsernameSignIn("RES_TDV_PIMS_TEST_02@mskcc.org");
			protocolStep.clickButtonSignIn1();
			protocolStep.typePasswordSignIn1("S9Nso&7XhD4m");
			protocolStep.clickButtonSignIn2();
			protocolStep.clickButtonSignInFinal3();			
        }
		
		@Test									
		public void hoverStepperPilot() {

			hoverStep.hoverStepperAll();		
		}
		
		@Test									
		public void clickMarkAsComplete() {

			markAsComplete.MarkUnmarkAsComplete();
	//		unmarkAsComplete.MarkUnmarkAsComplete();
		}
	
		@Test
		public void deleteRequiredDataProtocol () {
			
			deleteRequiredDataProtocolBase.deleteRequiredFieldsFromPersonnel();
		}
			
		@Test													
		public void clickOnPersonnelStep() {

			personnelStep.clickPersonnelStep();
			String expectedText = "At least 1 CO-PI is required for this step to be completed and for submission to PRC/PAC.";
			String actualText = personnelStep.getTextFromCoPiBanner();
			assertEquals(expectedText, actualText);								
		}
		
		@Test													
		public void addingCoPi() {
			
			personnelStep.clickPersonnelStep();
		 	personnelStep.Add1Personnel();
		 
		// 	clickMarkAsComplete();
		}
		
		@Test
		public void addingInvestigator() {
			
			personnelStep.clickPersonnelStep();
			personnelStep.Add2Personnel();	
		}
		
		@Test													
		public void clickDepartmentsStep() {
			
			personnelStep.clickPersonnelStep();
			personnelStep.Add1Personnel();
			personnelStep.DepartmentsStep();
		}
		
		@Test												    
		public void clickContactStep() {
						
			contactStepBase.ContactStep();
			
			String expectedText = "CRM MSK Contact Type is required for this step to be completed and for submission to PRC/PAC.";
			String actualText = contactStepBase.getTextFromCRMBanner();
			assertEquals(expectedText, actualText);			
		}
		
		@Test												  
		public void ContactStepEmptyCRM() {
						
			contactStepBase.ContactStep();
			markAsComplete.MarkUnmarkAsComplete();
			
			String expectedText = "CRM MSK Contact Type is required for this step to be completed and for submission to PRC/PAC.";
			String actualText = contactStepBase.getTextFromCRMBanner();
			assertEquals(expectedText, actualText);	
		}
		
		@Test														
		public void ContactStepRequiredFields() {
			
			contactStepBase.ContactStep();
			contactStepBase.CRMContact();
			markAsComplete.MarkUnmarkAsComplete();
		}
		
		@Test														
		public void deleteCRMContact() {
			
			contactStepBase.ContactStep();
			contactStepBase.CRMContact();
			markAsComplete.MarkUnmarkAsComplete();
			contactStepBase.deleteCRMContactField();
		}
	
		@Test
		public void clickDocumentStep() {
			
			documentStepBase.DocumentsStep();
			
            markAsComplete.MarkUnmarkAsComplete();
			
			String expectedText = "At least one generated document is required for this step to be completed and for submission to PRC/PAC.";
			String actualText = documentStepBase.getTextFromDocumentBanner();
			assertEquals(expectedText, actualText);				
		}
			
		@Test
		public void clickQuestion1() {
			
			documentStepBase.DocumentsStep();
			documentStepBase.answerQuestion1();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}