const express = require('express')
const app = express();


app.get('/',(req,res)=>res.send('<h2>Express Page</h2>'))
app.get('/home',(req,res)=>res.send('<h2>Home Page</h2>'))

app.get('/search/:username',(req,res)=>res.send(`<h2>Welcome User ${req.params['username']}To My Page</h2>`))

app.get('/search',(req,res)=>res.send(`<h2>Welcome User  ${req.query.username}To Request Param demo Page</h2>`))

app.listen(3002,()=>console.log('express server started'))
