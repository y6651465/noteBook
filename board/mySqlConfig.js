var mysql = require('mysql');
var pool  = mysql.createPool({
  connectionLimit : 10,
  host            : 'localhost',
  port            : 3308,
  user            : 'root',
  password        : 'root',
  database        : 'java94'
});




module.exports = pool;