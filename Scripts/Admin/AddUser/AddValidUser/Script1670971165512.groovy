import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Admin/Add User/RoleDropdown'))

WebUI.click(findTestObject('Admin/Admin'))

WebUI.setText(findTestObject('Admin/Add User/NameInput'), 'David  Morris')

WebUI.delay(2)

// WebUI.click(findTestObject('Admin/Add User/EmployeeDropdown'))
WebUI.click(findTestObject('Admin/Add User/Name'))

WebUI.click(findTestObject('Admin/Add User/StatusDropdown'))

WebUI.click(findTestObject('Admin/Enabled'))

WebUI.click(findTestObject('Admin/Add User/UsernameField'))

WebUI.setText(findTestObject('Admin/Add User/UsernameField'), 'Tester3')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus o_671073'), 
    'jxNgkuoMOL++NHzV2uL42Q==')

WebUI.setEncryptedText(findTestObject('Admin/Add User/ConfirmPassField'), 'jxNgkuoMOL++NHzV2uL42Q==')

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 0)

WebUI.closeBrowser()

