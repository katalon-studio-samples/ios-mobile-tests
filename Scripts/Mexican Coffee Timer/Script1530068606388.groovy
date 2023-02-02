import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

CustomKeywords.'sample.Common.startApplication'()

Mobile.verifyElementText(findTestObject('Spy/XCUIElementTypeStaticText - Mexican'), 'Mexican')

Mobile.tap(findTestObject('XCUIElementTypeStaticText - Mexican'), 0)

Mobile.tap(findTestObject('XCUIElementTypeButton - Start'), 0)

Mobile.tap(findTestObject('XCUIElementTypeStaticText - 319'), 0)

Mobile.tap(findTestObject('XCUIElementTypeButton - Stop'), 0)

Mobile.tap(findTestObject('XCUIElementTypeButton - Back'), 0)

Mobile.closeApplication()

