var request = require('request');
var app = require('express')();
var fs = require('fs');
var bodyParser = require('body-parser');
var con = require('./mySqlConfig.js');
var ejs = require("ejs");
var query = require('./query.js');
var hbs = require('handlebars');
var browserify = require('browserify');

app.get('/', function (req, res) {
  fs.readFile("index.html", function(err, data) {
    res.writeHeader(200, {"Content-Type": "text/html; charset=UTF-8"});
    
    res.end(data);
  });
});
app.get('/board/list', function (req, res) {
  res.writeHeader(200, {"Content-Type": "text/html; charset=UTF-8"});
  con.query(query.boardList, function (err, rows, fields){
    if (err) { throw err; }
    console.log(rows);
  });
app.get('/board/user', function (req, res){
  fs.readFile('./user.html', function (err, data){
     if (err) { throw err; }
     res.end(data);
  });
});
  
});
app.listen(3000, function () {
    console.log('http://localhost:3000 구동중');
});


