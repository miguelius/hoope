package org.uqbar.scoping

import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes

class HoopeImplicitlyImportedTypes extends ImplicitlyImportedTypes {
	
    override protected getStaticImportClasses() {
            (super.getStaticImportClasses() + #[Math, System]).toList
    }
}