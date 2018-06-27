package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object app_path
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['app_path' : '/Users/trongbui/katalon/sources/katalon-studio-samples/ios-mobile-tests/App/Coffee Timer 2018-06-20 15-04-42/Coffee Timer-iPad Pro (9.7-inch).ipa'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        app_path = selectedVariables['app_path']
        
    }
}
