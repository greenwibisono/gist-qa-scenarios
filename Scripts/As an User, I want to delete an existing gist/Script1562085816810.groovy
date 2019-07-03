import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(((GlobalVariable.dtGitHubGist + GlobalVariable.dtUsername) + '/') + GlobalVariable.dtGistID)

WebUI.click(findTestObject('Delete an existing gist/a_Signin'))

WebUI.setText(findTestObject('Delete an existing gist/input_Username or email address_login'), GlobalVariable.dtUsername)

WebUI.setText(findTestObject('Delete an existing gist/input_Forgot password_password'), GlobalVariable.dtPassword)

WebUI.click(findTestObject('Delete an existing gist/input_Forgot password_commit'))

WebUI.click(findTestObject('Delete an existing gist/button_Delete'))

WebUI.acceptAlert()

