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

WebUI.navigateToUrl('https://magang.dikahadir.com/absen/login')

WebUI.setText(findTestObject('Object Repository/Page_mobileHADIR/input_Email_email'), 'satu@hadir.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_mobileHADIR/input_Password_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/button_Lupa password_MuiButtonBase-root Mui_b3cfdc'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/a__user__menu__item'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/button_Pulang Cepat_MuiButtonBase-root MuiB_331598'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/button_Tanggal_MuiButtonBase-root MuiIconBu_2da378'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/button_S_MuiButtonBase-root MuiPickersDay-r_602219'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/button_Jam_MuiButtonBase-root MuiIconButton_76f69b'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/div_Ajukan_MuiClock-squareMask css-1umqo6f'))

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/div_Keterangan_MuiInputBase-root MuiOutline_2be835'))

WebUI.setText(findTestObject('Object Repository/Page_mobileHADIR/textarea_Keterangan_notes_17'), 'keperluan pribadi')

WebUI.click(findTestObject('Object Repository/Page_mobileHADIR/button__MuiButtonBase-root MuiButton-root M_bb9416'))

WebUI.delay(3)

WebUI.closeBrowser()

