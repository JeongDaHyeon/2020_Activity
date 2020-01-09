var express = require('express');
var app = express(); // application을 리턴.
app.use(express.static('public')); // 정적인 파일이 위치할 디렉토리 지정
// get: routing
app.get('/', function(req, res) {
    res.send('Hello home page');
});
app.get('/route', function(req, res) {
    res.send('Hello Router, <img src="/node-js.png">')
});
app.get('/login', function(req, res) {
    res.send('Login please');
});
 // set port number 3000
app.listen(3000, function() {
    console.log('Connected 3000 port!');
});

