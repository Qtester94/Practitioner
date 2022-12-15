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

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/a_Admin'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_User Management'), 'User Management')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_System UsersUsernameUser Role-- Select _3559ba'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/i_System Users_oxd-icon bi-caret-down-fill'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Username'), 'Username')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_User Role'), 'User Role')

WebUI.rightClick(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Username_oxd-input oxd-input--active'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_-- Select --'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Employee Name'), 'Employee Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/input'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Status'), 'Status')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_-- Select --'), 0)

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill _93b898'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Reset'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Search'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Add'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_(61) Records Found'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_Employee NameAaliyah HaqUsernameAaliyah_cd4cd7'), 
    0)

WebUI.closeBrowser()

