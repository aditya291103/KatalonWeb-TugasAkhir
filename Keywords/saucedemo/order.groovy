package saucedemo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
















public class order {

	@Keyword
	def orderBarang (String Product) {

		new saucedemo.login().doLogin('valid', 'valid')

		WebUI.takeScreenshot()

		if (Product == 'backPage') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc01/02_product/click_sauceLaps_backPack'))
		} else if (Product == 'bikeLight') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc02/02product/click_sauceLabs_bikeLight'))
		} else if (Product == 'bolt_T-shirt') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc03/02Product/click_swagLabs_bolt_T-shirt'))
		} else if (Product == 'jacket') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc04/02Product/click_sauceLabs_fleeceJacket'))
		} else if (Product == 'onesie') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc05/02Product/click_sauceLabs_onesie'))
		} else if (Product == 'Tshirt_red') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc06/02Product/click_T-shirtRed'))
		}

		//	WebUI.comment('vertify')
		//	WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc01/02_product/vertify_productPage'), 10)


		if (Product == 'backPage') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc01/02_product/click_addToCart'))

		} else if (Product == 'bikeLight') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc02/02product/click_addToCart'))

		} else if(Product == 'bolt_T-shirt') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc03/02Product/click_addToCart'))

		} else if (Product == 'jacket') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc04/02Product/click_addToCart'))

		} else if (Product == 'onesie') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc05/02Product/click_addToCart'))

		} else if (Product == 'Tshirt_red') {
			WebUI.comment('click')
			WebUI.click(findTestObject('Object Repository/saucedemo/tc06/02Product/click_addToCart'))

		}

		WebUI.comment('click')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/02_product/click_keranjang'))

		//		WebUI.comment('vertify')
		//		WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc01/03_keranjang/vertivy_yourCart_pageKeranjang'), 10)

		WebUI.comment('click')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/03_keranjang/click_checkout'))

		//		WebUI.comment('vertify')
		//		WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc01/04_checkout/vertify_checkout_page'), 10)

		WebUI.comment('input')
		WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/04_checkout/input_firstName'), 'Aditya')

		WebUI.comment('input')
		WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/04_checkout/input_lastName'), 'Nur Fahmi')

		WebUI.comment('input')
		WebUI.setText(findTestObject('Object Repository/saucedemo/tc01/04_checkout/input_codePost'), '2023')

		WebUI.comment('click')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/04_checkout/click_continue'))

		//		WebUI.comment('vertify')
		//		WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc01/04_checkout/vertify_checkoutStep2Page'), 10)

		WebUI.comment('click')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/04_checkout/click_finish'))

		//		WebUI.comment('vertify')
		//		WebUI.waitForElementPresent(findTestObject('Object Repository/saucedemo/tc01/05_logout/vertify_pageCompleteCheckout'), 0)

		WebUI.comment('click')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/05_logout/click_menu_kiriAtas'))

		WebUI.comment('click')
		WebUI.click(findTestObject('Object Repository/saucedemo/tc01/05_logout/click_logout'))


	}



}
