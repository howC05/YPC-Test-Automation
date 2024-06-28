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

WebUI.click(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/button_Register'))

WebUI.setText(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/input_Sign up your account_registerEmail'), 
    'hochun@graduate.utm.my')

WebUI.setEncryptedText(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/input_Email address  (e.g.,nameexample.com)_525eaa'), 
    'osqXMFwT6HY=')

WebUI.setText(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/input_Password (at least 6 characters.)_FirstName'), 
    'Ho')

WebUI.setText(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/input_First Name_LastName'), 'Wei Chun')

WebUI.setText(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/input_Last Name_age'), '66')

WebUI.setText(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/input_Age_weight'), '54')

WebUI.click(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Duplicate Registration Yoga Posture Correction/div_This email address is already registered'))

