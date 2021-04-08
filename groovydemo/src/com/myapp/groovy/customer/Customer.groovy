package com.myapp.groovy.customer

import groovy.transform.Immutable
import groovy.transform.Sortable

@Immutable ()
@Sortable (excludes='favItems')
class Customer {
	String first,last
	int age
	Date since
	Collection favItems
	
}
