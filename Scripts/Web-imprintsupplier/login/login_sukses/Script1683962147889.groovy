import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.comment("Open browser")
WebUI.openBrowser('')

WebUI.comment("Maximize windows")
WebUI.maximizeWindow()

WebUI.comment("Input URL")
WebUI.navigateToUrl('https://buildensis.imprintsupplier.com/login')

WebUI.comment("verivy text password")
WebUI.waitForElementPresent(findTestObject('Object Repository/login_page/text_password'), 10)

WebUI.comment('Input Field Email')
WebUI.setText(findTestObject('Object Repository/login_page/Input_email'), "dev@imprint.co.id")

WebUI.comment("Input Field Password")
WebUI.setText(findTestObject('Object Repository/login_page/Input_password'), "vbHkFJy22k8KAH5")

WebUI.comment("click button Masuk")
WebUI.click(findTestObject('Object Repository/login_page/click_button_masuk'))

WebUI.comment("vertiv text dasboard")
WebUI.waitForElementPresent(findTestObject('Object Repository/login_page/text_dasboard'), 10)


