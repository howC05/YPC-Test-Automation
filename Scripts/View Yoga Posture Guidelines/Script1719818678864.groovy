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

WebUI.navigateToUrl('https://yoga-react-deploy.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Sign in your account_floatingInput'), 
    'chiner@graduate.utm.my')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Email address_floatingPassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Sign In (1)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_LEARN'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Tree'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/span_Chair'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Chair'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/a_Cobra'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Cobra'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/span_Warrior'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Warrior'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/span_Dog'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Dog'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/span_Shoulderstand'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Shoulderstand'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/span_Triangle'))

WebUI.closeBrowser()

