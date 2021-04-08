package com.myapp.groovy
import groovy.transform.Canonical

@Canonical


class MyAccount {
	BigDecimal balance;
	BigDecimal deposit(BigDecimal amount) {
		balance+=amount
	}
	BigDecimal withdraw(BigDecimal amount) {
		balance-=amount
	}

	BigDecimal plus(MyAccount other) {
		balance:this.balance+other.balance
	}

	MyAccount minus(MyAccount other) {
		new MyAccount(balance:this.balance-other.balance)
	}
}



