/*
* generated by Xtext
*/
package org.uqbar;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HoopeStandaloneSetup extends HoopeStandaloneSetupGenerated{

	public static void doSetup() {
		new HoopeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
