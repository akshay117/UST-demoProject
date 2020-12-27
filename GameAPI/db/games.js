/**
 * Database Operations related to collection is here:)
 */

 var model = require('../models/games')
 var settings = require('../db/settings')

// cREATE A ROW
exports.save = function (data, callback) {

    new model.Games(data).save(function (err, inserted) {
        callback(err, inserted)

    })
}

// CREATE multiple vacation packages
exports.saveMany = function (rows, callback) {

    model.Games.insertMany(rows, function (err, docs) {
        callback(err, docs)
    })

}

 //Update the games packages
 exports.update = (criteria,doc,callback) => {
     model.Games.updateMany(criteria,doc,(err,data) => {
         callback(err,data)
     })
 }

 //Retrive  games package
 exports.select = (criteria,callback) => {
     model.Games.find(criteria,(err,data) => {
         callback(err,data)
     })
 }