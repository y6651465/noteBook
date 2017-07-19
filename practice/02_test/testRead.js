var fs = require('fs');
var http = require('http');

http.createServer(function (request, response) {

fs.readFile('data/form.html', (err, data) => {
  response.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
  response.end(data)
  console.log(data);
  
});
}).listen(10004, function() {
  console.log('http://localhost:10004 구동중');
});
