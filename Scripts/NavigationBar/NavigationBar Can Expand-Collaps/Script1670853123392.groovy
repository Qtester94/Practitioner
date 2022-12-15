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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/button_Admin_oxd-icon-button oxd-main-menu-button'), 
    0)

WebUI.click(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/i_Admin_oxd-icon bi-chevron-left'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/img_1'), 0)

WebUI.click(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/i_Admin_oxd-icon bi-chevron-right'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/Page_OrangeHRM/img'), 0)

WebUI.closeBrowser()

