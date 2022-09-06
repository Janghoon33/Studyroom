const http = require("http");
const url = require("url");

http.createServer(function (request, response) {

    let query = url.parse(request.url, true).query;  

    response.writeHead(200, {"Content-Type" : "text/html;charset=utf-8"});
    response.write("<html>");
    response.write("<body>");
    // 입력한 값만큼 td태그 반복 출력
    response.write("<table border='1'>");
    response.write("<tr>");
    for(let i=1; i<=parseInt(query.num1); i++){
        response.write("<td>"+i+"</td>");
    }
    response.write("</tr>");
    response.write("</table>");
    
    response.write("</body>");
    response.write("</html>");
    response.end();

    console.log("서버생성성공");

    response.end();

}).listen(3000);