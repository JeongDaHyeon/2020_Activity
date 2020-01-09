const http = require('http');
// node js에서 제공하는 http라는 모듈(부품)이 요구된다.
// 우리가 노드에서 사용할 수 있도록 한다.
// 리턴값이 있어서 리턴값을 http에 담는다.
// const: 상수 http라는 상수에 http 모듈을 담는다.
// 한번 할당이 되면 그 다음부터는 할당 된 값을 바꿀 수 없음.

 
const hostname = '127.0.0.1';
const port = 1337;
 
http.createServer((req, res) => {
 res.writeHead(200, { 'Content-Type': 'text/plain' });
 res.end('Hello World\n');
}).listen(port, hostname, () => {
 console.log(`Server running at http://${hostname}:${port}/`);
});

// createServer -> 서버 객체 리턴
// listen 객체 호출.