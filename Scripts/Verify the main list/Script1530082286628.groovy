import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

CustomKeywords.'sample.Common.startApplication'()

Mobile.verifyElementText(findTestObject('Spy/XCUIElementTypeStaticText - Mexican'), 'Mexican')

Mobile.verifyElementText(findTestObject('Spy/XCUIElementTypeStaticText - Colombian'), 'Colombian')

Mobile.verifyElementText(findTestObject('Spy/XCUIElementTypeStaticText - Coffees'), 'Coffees')

Mobile.closeApplication()

