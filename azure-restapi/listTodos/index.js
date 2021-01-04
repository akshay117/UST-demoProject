// var mongoClient = require("mongodb").MongoClient;
// mongoClient.connect("mongodb://cosmosdb-ust-todo:0ocVA0dynYCFpjLeMvAfAQpRYNwUMqpxLa6k8qME9JiailuMbRLpm6mcBPp1NnRRvIBn9MMfZwQPO5xPkMwyrg==@cosmosdb-ust-todo.mongo.cosmos.azure.com:10255/?ssl=true&appName=@cosmosdb-ust-todo@", function (err, db) {
//   db.close();
// });

const MongoClient = require("mongodb").MongoClient;
module.exports = async function (context, req) {

    
    const URL = process.env.MONGODB_URL;                                            //'mongodb://cosmosdb-ust-todo:0ocVA0dynYCFpjLeMvAfAQpRYNwUMqpxLa6k8qME9JiailuMbRLpm6mcBPp1NnRRvIBn9MMfZwQPO5xPkMwyrg%3D%3D@cosmosdb-ust-todo.mongo.cosmos.azure.com:10255/?ssl=true&replicaSet=globaldb&retrywrites=false&maxIdleTimeMS=120000&appName=@cosmosdb-ust-todo@';
    const DATABASE_NAME = process.env.MONGODB_DATABASE_NAME;
    const COLLECTION_NAME= process.env.MONGODB_COLLECTION_NAME;
    
   
    const connection = await MongoClient.connect(URL, {useUnifiedTopology: true});
    const todocollection= connection.db(DATABASE_NAME)
                                    .collection(COLLECTION_NAME)

    const results = await todocollection
                           .find({})
                           .toArray();
    await connection.close();                       
    return {
        // status: 200, /* Defaults to 200 */
        body: JSON.stringify(results).replace(/_id/g,"id")
    };
}