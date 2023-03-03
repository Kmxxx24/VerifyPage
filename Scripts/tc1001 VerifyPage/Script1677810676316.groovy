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

WebUI.navigateToUrl('https://www.cloudnative-skill.com/register')

WebUI.verifyTextPresent('Register', false)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Modern Software Development Toolchains', false)

branchtext = WebUI.getAttribute(findTestObject('RegisterPage/branch_display_text'), 'placeholder')

WebUI.verifyMatch(branchtext, 'เช่น สำนักงานใหญ่', false)

WebUI.verifyElementNotChecked(findTestObject('RegisterPage/html_checkbox'), 0)

WebUI.verifyElementNotClickable(findTestObject('RegisterPage/invoice_name'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('RegisterPage/add_invoice_option2'))

WebUI.verifyElementClickable(findTestObject('RegisterPage/invoice_name'))

WebUI.setText(findTestObject('RegisterPage/birthday_in'), '24/03/2546')

WebUI.sendKeys(findTestObject('RegisterPage/birthday_in'), Keys.chord(Keys.ENTER))

autoage = WebUI.getAttribute(findTestObject('RegisterPage/auto_age'), 'value')

WebUI.verifyMatch(autoage, '20', false)

