const express = require('express');
const router = express.Router();

// 数据交换：通过json
const requestLogger = (req,res,next) => {
    console.log('request',req.url)
    next()
}

router.use(requestLogger)

const errorLogger = (err,req,res,next) => {
    console.log('error',err)
    next()
}

const errorResponse = (err,req,res,next) => {
    res.status(500).json({
        "message": "Internal Server Error"
    })
}

router.get('/home',(req,res)=>{
    res.render('home',{
        title: 'Home Page',
        message: 'Welcome to Home Page'
    })
})

router.get('/', function (req, res) {
    res.send('Hello World')
  })
  // 中间键 ： request => HTTPServer => middleware(接受请求，服务器还未响应)三个参数：（function(req,res,next)） => Response
  // function(req,res,next){console.log(req) next()}
  let products = [
      {
          "name":"Television",
          "price":1000,
          "brand":"Xiaomi"
      },
      {
          "name":"Mobile",
          "price":2000,
          "brand":"Samsung"
      }
  ]

  router.get('/products/:brand', function(req, res){
      let brand = req.params.brand
    
      let filteredProducts = products.filter(product => product.brand === brand)
      res.json(filteredProducts)
  });
  router.post('/products',(req,res) => {
      const name = req.body.name;
      const price = req.body.price;
      const brand = req.body.brand;

      products.push({name,price,brand})
  });
  res.json({
    "message": "success",
    "data": products
  })

module.exports = router;