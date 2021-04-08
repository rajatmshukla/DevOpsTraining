const myFunc = function(){
return new Promise((resolve,failure)=>{
    
setTimeout(function(){

    resolve(new Date());
},1000)
})
}
const promise =myFunc();
promise.then(data=>console.log(data)).catch(reason=>console.log(reason))
console.log('Im Executed');
// JavaScript | ECMAScript (ES2015|ES2016|Es2017)

// M -> MongoDB (NoSQL Database) use javascript
// E -> ExpressJS (ServerSide JavaScript)
// A -> ANGULAR (CLIENTSide UI Development)
// N -> NODE.JS (JavaScript VM )

// NODE.jS = LIBUV (Async Evented IO Library) + V8 (JSEngine) + JS/C++

// JavaScript 
// Single Threaded 
// Event Driven Language
// Asynchronous

// NPM (Node Package Manager)

// fs, http,url,os,events

// npm install -g

// package.json





