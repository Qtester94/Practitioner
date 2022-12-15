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

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Paul Collings'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Change Password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/li_Configuration'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/span_Configuration'), 'Configuration')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Configuration_oxd-icon bi-chevron-down'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Optional Fields'), 'Optional Fields')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Custom Fields'), 'Custom Fields')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Data Import'), 'Data Import')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Reporting Methods'), 'Reporting Methods')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Termination Reasons'), 'Termination Reasons')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/li_Employee List'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'), 'Employee List')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/li_Add Employee'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Add Employee'), 'Add Employee')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/li_Reports'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_Reports'), 'Reports')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Configuration_oxd-icon bi-chevron-down_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/button_Cancel'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/button_Cancel'), 'Cancel')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/button_Save'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/button_Save'), 'Save')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/label_Current Password'), 'Current Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_Current Password_oxd-input oxd-input--focus'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/label_Password'), 'Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_Current Password_oxd-input oxd-input--focus'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/label_Confirm Password'), 'Confirm Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_Current Password_oxd-input oxd-input--focus'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_For a strong password, please use a hard _685b13'), 
    'For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_Required'), '* Required')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h6_Update Password'), 'Update Password')

WebUI.closeBrowser()

