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