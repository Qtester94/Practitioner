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

WebUI.setText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-menu-icon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/input_Admin_oxd-input oxd-input--focus'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Admin'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Admin'), 'Admin')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_PIM'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_PIM'), 'PIM')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Leave'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Leave'), 'Leave')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Time'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Time'), 'Time')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Recruitment'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Recruitment'), 'Recruitment')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_My Info'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_My Info'), 'My Info')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Performance'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Performance'), 'Performance')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Dashboard'), 0)

WebUI.verifyElementPresent(findTestObject('NavigationBar/Page_OrangeHRM/a_Performance'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Dashboard'), 'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Directory'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Directory'), 'Directory')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Maintenance'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Maintenance'), 'Maintenance')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/a_Buzz'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/svg_Admin_oxd-icon oxd-main-menu-item--icon'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/span_Buzz'), 'Buzz')

WebUI.verifyElementPresent(findTestObject('Object Repository/NavigationBar/Page_OrangeHRM/button_Admin_oxd-icon-button oxd-main-menu-button'), 
    0)

WebUI.closeBrowser()

