package com.myapp.groovy.main

//def file=new File('data.txt')
//file.readLines().forEach{line->println line}

def file=new File('contents')
file.eachFileRecurse{f->
	if(f.name.endsWith('groovy')) {println(f.name)}
	
}
new File('dir1/dir2/dir3').mkdirs()