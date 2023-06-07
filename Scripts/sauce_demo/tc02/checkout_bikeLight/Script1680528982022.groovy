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

WebUI.comment("Open browser")
WebUI.openBrowser('')

WebUI.comment("Maximize windows")
WebUI.maximizeWindow()

WebUI.comment("Input URL")
WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.comment('vertify swag labs')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/01Login/vertify_swagLabs_pageLogin'), 0)

WebUI.comment('input username')
WebUI.setText(findTestObject('Object Repository/saucedemo/tc02/01Login/input_usename'), 'standard_user')

WebUI.comment('input password')
WebUI.setText(findTestObject('Object Repository/saucedemo/tc02/01Login/input_password'), 'secret_sauce')

WebUI.comment('click login')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/01Login/click_login'))

WebUI.comment('vertify')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/02product/vertify_productPage'), 0)

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/02product/click_sauceLabs_bikeLight'))

WebUI.comment('vertify')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/02product/vertify_swagLabs_inventoryPage'), 0)

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/02product/click_addToCart'))

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/02product/click_keranjang'))

WebUI.comment('vertify')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/03keranjang/vertify_keranjangPage'), 0)

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/03keranjang/click_checkout'))

WebUI.comment('vertify')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/04checkout/vertify_checkoutPage'), 0)

WebUI.comment('input')
WebUI.setText(findTestObject('Object Repository/saucedemo/tc02/04checkout/input_firstName'), 'Aditya')

WebUI.comment('input')
WebUI.setText(findTestObject('Object Repository/saucedemo/tc02/04checkout/input_lastName'), 'Nur Fahmi')

WebUI.comment('input')
WebUI.setText(findTestObject('Object Repository/saucedemo/tc02/04checkout/input_codePost'), '2023')

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/04checkout/click_continue'))

WebUI.comment('vertify')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/04checkout/verify_checkoutPageStep2'), 0)

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/04checkout/click_finish'))

WebUI.comment('vertify')
WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc02/05logout/vertify_pageCompleteCheckout'), 0)

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/05logout/click_menu_kiriAtas'))

WebUI.comment('click')
WebUI.click(findTestObject('Object Repository/saucedemo/tc02/05logout/click_logout'))

