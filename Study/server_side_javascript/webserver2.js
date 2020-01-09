const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;


// 서버 객체를 만듦
// req: request
// res: response
var server = http.createServer(function(req, res) {
    res.setHeader('Content-Type', 'text/plain');
    res.end('Hello World\n');
});

server.listen(port, hostname, function() {
    console.log(`Server running at http://${hostname}:${port}/`);
});
