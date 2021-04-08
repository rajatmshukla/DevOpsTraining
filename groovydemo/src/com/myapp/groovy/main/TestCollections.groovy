@Grapes(
	@Grab(group='org.codehaus.groovy',module='groovy-dateutil',version='3.0.7')
)

package com.myapp.groovy.main

//def letters=['a','b','c','d']
//for(int i=0;i<letters.size();i++) {
//	println letters[i]
//}
Range r=1..<10
println r
println r.class
println r.from
println r.to
println r.contains(1) 
def today=new Date()
def oneweekaway=(today+7)

Range days=today..oneweekaway
days.each { t -> println(t)}

List nums=[1,2,3,4,5,6,7,8,9]

println nums.class
nums.push(02)
nums.add(1,77)
println(nums)
nums<<100
println(nums)
nums.pop()
println(nums)

def map=[:]
println map.getClass().getName()
def person=[first:'Ajinkya',last:'Rahane',email:'ajinkya@gmail.com']
println person.email1
person.each{k,v-> println k+' '+v}
enum Days{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
Range day=Days.Sunday..Days.Saturday
day.each{d-> println d}

