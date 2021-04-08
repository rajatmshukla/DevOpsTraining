
@Grapes([
	@Grab(group='mysql',module='mysql-connector-java',version='8.0.14'),
	@Grab(group='org.codehaus.groovy',module='groovy-sql',version='3.0.7')
	]
	)
package com.myapp.groovy.main

import groovy.sql.Sql
def db=[url:'jdbc:mysql://localhost:3306/devops',user:'admin',password:'admin',
	driver:'com.mysql.cj.jdbc.Driver']

def sql=Sql.newInstance(db.url,db.user,db.password,db.driver)
//println sql.connection
//sql.query("""SELECT * FROM products"""){
//	resultset-> while(resultset.next()) {
//		println resultset.getString(1)
//	}
//}
//sdef insert='INSERT INTO products values (?,?,?,?)'
//def params=[2,'Iphone9',67000,'Mobile']
//def keys=sql.executeInsert(insert,params)
sql.eachRow("""SELECT * FROM products"""){rows-> println rows.productName}