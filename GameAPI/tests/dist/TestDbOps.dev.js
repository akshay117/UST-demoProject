"use strict";

/**
 * This module is for testing DB operations
 */
// Setup the DB_URI
process.env.DB_URI = require("../db/clouddb").DB_URI; //Test#1  Insert the Vacation data

var db = require('../db/games');

var data = require('../data/games'); // Save a single game


db.save(data.SingleRow, function (err, saved) {
  if (err) {
    console.log("Failed single row insert");
  } else {
    console.log("Success - Save single row - %s", saved.name);
  }
}); // Save multiple games

db.saveMany(data.MultipleRows, function (err, docs) {
  if (err) {
    console.log("Failed multiple row insert");
  } else {
    console.log("Success - Multiple rows inserted - %d", docs.length);
  }
}); // Select game with a criteria

var selectCriteria = {
  released: {
    $lte: new Date()
  }
};
db.select(selectCriteria, function (err, data) {
  if (err) {
    console.log("Failed to get vacations : %s", criteria);
    console.log(err);
  } else {
    console.log("Successfully selected %d documents for %s", data.length, JSON.stringify(selectCriteria));
  }
}); // Update Operation

var updateCriteria = {
  name: "CyberPunk 2077"
};
var doc = {
  description: 'UPDATED Desc for TESTING'
};
db.update(updateCriteria, doc, function (err, doc) {
  if (err) {
    console.log("Failed to get update");
    console.log(err);
  } else {
    console.log("Successfully updated with criteria %s", updateCriteria);
  }
});