/**
 * This modules setup the database url
 */

//Mongodb connection string = mongodb+srv://akshay:<password>@apidemo.2dvob.mongodb.net/<dbname>?retryWrites=true&w=majority

DB_NAME = "gamersdb"
DB_USER = "akshay"
DB_PASSWORD = "iamalama117"
CLUSTER_HOST = "apidemo.2dvob.mongodb.net"


exports.DB_URI = `mongodb+srv://${DB_USER}:${DB_PASSWORD}@${CLUSTER_HOST}/${DB_NAME}?retryWrites=true&w=majority`