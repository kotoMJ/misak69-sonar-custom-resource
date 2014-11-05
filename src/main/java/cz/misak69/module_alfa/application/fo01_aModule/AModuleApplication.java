package cz.misak69.module_alfa.application.fo01_aModule;

/**
 * User: mjenicek
 * Date: 2014.06.23
 */
public class AModuleApplication {


    AModuleApplication() {
        try {
            String a = null;
            System.out.print(a.charAt(0));
        } catch (NullPointerException npe) {
            System.out.println("Test for analysing catching Null-pointer-exception");
        }
    }
}
