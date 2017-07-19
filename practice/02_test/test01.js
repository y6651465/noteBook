var http = require('http');
var fs = require('fs');
var qs = require('querystring');
var url = require('url');


http.createServer(function (request, response) {
	if(url.parse(request.url).pathname === '/favicon.ico'){
		return;
	}

	fs.readFile('data/form.html', (err, data) => {
		response.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
		var pData = '';
		request.on('data', function (data){
			pData += data;
		});
		request.on('end', function (){
			var param = qs.parse(pData);
			response.end(`<h1>${param.id} : ${param.pass}</h1>`)
			console.log(param);
		});
		
		
	});

	console.log('서버 들어옴');
		
	}).listen(10002, function() {
	console.log('http://localhost:10002 구동중');
});