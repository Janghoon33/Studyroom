const http = require("http");
const url = require("url");

http.createServer(function (request, response) {

    let query = url.parse(request.url, true).query;  

    console.log("사용자가 입력한 num1값 : "+query.num1);
    console.log("사용자가 입력한 num1값 : "+query.num2);
    console.log("num1과 num2의 합 : "+(parseInt(query.num1)+parseInt(query.num2)));

    response.writeHead(200, {"Content-Type" : "text/html;charset=utf-8"});
    response.write("<html>");
    response.write("<body>");
    
    response.write("</body>");
    response.write("</html>");
    response.end();

    console.log("서버생성성공");

    response.end();

}).listen(3000);