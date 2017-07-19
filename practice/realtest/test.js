var url = require('url');
var fs = require('fs');
var http = require('http');
var qs = require('querystring');
var events =require('events');
http.createServer(function (request, response) {
    var uObj =  url.parse('http://localhost:10002/cal?num1=10&num2=20&cumm=*');
}).listen(10002, function(){
    console.log('http://localhost:10002 구동중');
});