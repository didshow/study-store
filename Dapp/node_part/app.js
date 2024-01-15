const express = require('express')
const app = express()
const routes = require('./routes')

app.set('view engin','pug')
app.set('views','./views')
app.use(routes)

app.listen(3000,()=> console.log('Server is running on port 3000'));