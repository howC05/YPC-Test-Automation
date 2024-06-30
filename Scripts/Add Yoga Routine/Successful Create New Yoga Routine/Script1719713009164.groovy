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

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/div'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Sign in (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Sign in your account_floatingInput (2)'), 
    'cuteboy@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Email address_floatingPassword (2)'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Sign In (5)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_ROUTINE (2)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/div_View Routine_grid place-content-center _849044 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Routine Name_RoutineName (2)'), 'Routine 5')

WebUI.setText(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Description_Description (2)'), 'routine 5')

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/input_Description_Description (2)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Next (2)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/img_select postures_hovertransition hoverdu_4e210b (2)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/img_select postures_hovertransition hoverdu_4e210b_1 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Yoga Posture Correction/button_Confirm (2)'))

