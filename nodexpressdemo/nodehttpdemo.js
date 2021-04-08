const http = require('http');
const server = http.createServer((req,res)=>{
res.writeHead(201,{'Content-Type':'text/html'})   
 res.write('<h2>Welcome To NodeJs Server</h2>')
res.end()
})
server.listen(8080,"localhost",()=>{
    console.log('server ready')
})

// HTTP Status Codes 
// 100 (100,101,102,103 ..... 110) (request is partially processed)
// 200 (200 .... 230) (Success)
// 300 (300 ... 320) (redirect)
// 400 (400 ... 428) (error on the client side)
// 500 (500 .. 532) (error on the server side)

