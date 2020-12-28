"use strict";

/**
 * Database Operations related to collection is here:)
 */
var model = require('../models/games');

var settings = require('../db/settings'); // cREATE A ROW


exports.save = function (data, callback) {
  new model.Games(data).save(function (err, inserted) {
    callback(err, inserted);
  });
}; // CREATE multiple vacation packages


exports.saveMany = function (rows, callback) {
  model.Games.insertMany(rows, function (err, docs) {
    callback(err, docs);
  });
}; //Update the games packages


exports.update = function (criteria, doc, callback) {
  model.Games.updateMany(criteria, doc, function (err, data) {
    callback(err, data);
  });
}; //Retrive  games package


exports.select = function (criteria, callback) {
  model.Games.find(criteria, function (err, data) {
    callback(err, data);
  });
};