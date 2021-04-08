const fs = require('fs')
//let values=[];
fs.readFile('data.txt',(err,data)=>{
    if(err){
        throw err;
    }
    
 

    const lines=data.toString().trim().split('\r\n')
    const numbers=lines.map(Number)
   const oddNumbers= numbers.filter(number => number %2 ===0)
console.log(oddNumbers)
    
})