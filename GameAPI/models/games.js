/**
 * Model for gamedb
 */

 var settings = require("../db/settings")

 var GamesSchema = settings.mongoose.Schema(
    {
        
        name: {type:String, required:[true,'Name is needed']},
        description : {type:String, required:true},
        type: {type:String, required:true},
        developer : [{studio:String, publisher:String}],
        OnlineMode:{type: Boolean, required:true, default:false},
        price: Number,
        size: {type:String, required:true},
        released:{type:Date, required:true},
        soldout: {type:Boolean, required:true, default:false}
        //pictures:{type:[String]}
    }

 );

 exports.Games = settings.mongoose.model('games',GamesSchema)