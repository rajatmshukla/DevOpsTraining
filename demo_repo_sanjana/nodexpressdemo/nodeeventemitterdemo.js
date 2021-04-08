const { EventEmitter } = require('events');
const fs = require('fs')
//const EventEmitter = require('events')
const readableStream = fs.createReadStream('data1.txt');

readableStream.on('data',(data)=>console.log(data.toString().trim()))
readableStream.on('end',()=>console.log('close'))

readableStream.on('start',()=>console.log('begin'))

readableStream.on('error',(reason)=>console.log(reason))
console.log('hello');

// http
// http responsible exchanging the information between web browser & webserver
// Structure Of Http (HTTP2)
// HEADER & BODY (METHOD=> GET,POST,PUT,DELETE,PATCH)




// const writableStream = fs.createWriteStream('data1.txt');
// readableStream.pipe(writableStream)


// console.log(readableStream instanceof EventEmitter)

// console.log(writableStream instanceof EventEmitter)