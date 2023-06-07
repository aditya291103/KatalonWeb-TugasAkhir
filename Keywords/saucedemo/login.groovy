package saucedemo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class login {

	@Keyword
	def doLogin (String Username, String Password) {

		WebUI.comment("Open browser")
		WebUI.openBrowser('')

		WebUI.comment("Maximize windows")
		WebUI.maximizeWindow()

		WebUI.comment("Input URL")
		WebUI.navigateToUrl('https://www.saucedemo.com/')

		if (Username == 'valid') {
			WebUI.comment('input username')
			WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/01_login/input_usename'), 'standard_user')
		} else if (Username != 'invalid') {
			WebUI.comment('input username')
			WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/01_login/input_usename'), 'salahh')
		}

		if(Password == 'valid') {
			WebUI.comment('input password')
			WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/01_login/input_password'), 'secret_sauce')
		} else if (Password != 'invalid') {
			WebUI.comment('input password')
			WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/01_login/input_password'), 'password_salah')
		}

		WebUI.comment('click login')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/01_login/click_login'))
	}
}
