package web_imprintsupplier

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class login {

	@Keyword
	def doLogin (String Email, String Password) {

		WebUI.comment("Open browser")
		WebUI.openBrowser('')

		WebUI.comment("Maximize windows")
		WebUI.maximizeWindow()

		WebUI.comment("Input URL")
		WebUI.navigateToUrl('https://buildensis.imprintsupplier.com/login')

		if(Email == 'valid') {
			WebUI.comment('Input Field Email')
			WebUI.setText(findTestObject('Object Repository/login_page/Input_email'), "dev@imprint.co.id")
		} else if(Email != 'invalid') {
			WebUI.comment('Input Field Email')
			WebUI.setText(findTestObject('Object Repository/login_page/Input_email'), "dv@imprint.co.id")
		}

		if(Password == 'valid') {
			WebUI.comment("Input Field Password")
			WebUI.setText(findTestObject('Object Repository/login_page/Input_password'), "vbHkFJy22k8KAH5")
		} else if (password != 'valid') {
			WebUI.comment("Input Field Password")
			WebUI.setText(findTestObject('Object Repository/login_page/Input_password'), "HkFJy22k8KAH5")
		}

				WebUI.comment('click button masuk')
				WebUI.click(findTestObject('Object Repository/login_page/click_button_masuk'))

		//		WebUI.comment('click fitur lembur saya')
		//		WebUI.click(findTestObject('Object Repository/fitur_lembur_saya/click_lemburSaya'))
		//
		//		WebUI.comment('use fitur lembur saya')
		//		WebUI.click(findTestObject('Object Repository/fitur_lembur_saya/use_fitur_lembur_saya'))
		//
		//		WebUI.comment('Clik januari')
		//		WebUI.click(findTestObject('Object Repository/capture_element/febuari_2023'))
		//
		//		WebUI.comment('Clik rekap lembur')
		//		WebUI.click(findTestObject('Object Repository/fitur_lembur_saya/rekap_lembur'))


	}
}
