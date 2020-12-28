"use strict";

/**
 * DB settings done here 
 * mongoose is setup here
 * also the connection with actual db
 */
var mongoose = require('mongoose'); //Import mongoose


mongoose.Promise = global.Promise; //this line make mongoose use native javascript promise

var uri = process.env.DB_URI; //URI of mongodb

mongoose.connect(process.env.DB_URI, {
  useNewUrlParser: true,
  useUnifiedTopology: true
}); //Event Listeners for the Mongoose connections

mongoose.connection.on('error', function (err) {
  console.log('Mongoose connection error');
  console.log(err);
});
mongoose.connection.on('disconnected', function () {
  console.log('Mongoose disconnected');
});
mongoose.connection.on('open', function () {
  console.log('Mongoose connected');
});
exports.mongoose = mongoose;
exports.db = mongoose.connection;