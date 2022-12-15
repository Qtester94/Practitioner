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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_Time at WorkPunched OutPunched Out Toda_214c17'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Time at WorkPunched OutPunched Out Toda_214c17'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_My Actions (14) Leave Requests to Appro_5722cf'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_My Actions (14) Leave Requests to Appro_5722cf'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_Quick LaunchAssign LeaveLeave ListTimes_7de346'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Quick LaunchAssign LeaveLeave ListTimes_7de346'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_Employees on Leave TodayPaul CollingssC_1cb3d7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Employees on Leave TodayPaul CollingssC_1cb3d7'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_Employee Distribution by Sub UnitEngine_525aaf'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Employee Distribution by Sub UnitEngine_525aaf'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/div_Employee Distribution by LocationNew Yo_066f30'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/div_Employee Distribution by LocationNew Yo_066f30'))

WebUI.closeBrowser()

