/**
  * This file creates server using express and
  *  listens to a port 3000
  */
  //DB_URI
  process.env.DB_URI = require("./db/clouddb").DB_URI
  PORT = 4000

  var express = require('express');        //import express
  var bodyParser = require('body-parser') //import body-parser

  var router = express.Router();           //get router from express.router
  require('./api/v1/games')(router);

  require('./api/v1/hotels')(router);

  //For partial response

  var app = express();                     //Create express app
 app.use(bodyParser.json());                 //Sets BodyParser
 app.use(router);                           //Sets Router
 app.listen(PORT);                           //Listens
 console.log("APP is listening on PORT: ",PORT)//indicates port status on console

