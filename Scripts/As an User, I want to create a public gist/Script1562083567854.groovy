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

WebUI.navigateToUrl(GlobalVariable.dtGitHubGistDiscovery)

WebUI.click(findTestObject('Create a public gist/a_Signin'))

WebUI.setText(findTestObject('Create a public gist/input_Username or email address_login'), GlobalVariable.dtUsername)

WebUI.setText(findTestObject('Create a public gist/input_Forgot password_password'), GlobalVariable.dtPassword)

WebUI.click(findTestObject('Create a public gist/input_Forgot password_commit'))

WebUI.navigateToUrl(GlobalVariable.dtGitHubGist)

WebUI.setText(findTestObject('Create a public gist/input_Instantly share code notes and snippets_gistdescription'), 'Create a public gist')

WebUI.setText(findTestObject('Create a public gist/input_Instantly share code notes and snippets_gistcontentsname'), 'create-public-gist.txt')

WebUI.click(findTestObject('Create a public gist/pre_'))

WebUI.setText(findTestObject('Create a public gist/div_1As an User I want to create a public gist'), 'As an User, I want to create a public gist.')

WebUI.click(findTestObject('Create a public gist/button_Create public gist'))

