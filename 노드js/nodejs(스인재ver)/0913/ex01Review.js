const http = require("http");
const url = require("url");
let temp = require("./ex03Temp.js");


http.createServer(function (request, response) {

    let query = url.parse(request.url, true).query;  

    temp.template();

    response.writeHead(200, {"Content-Type" : "text/html;charset=utf-8"});
    response.write("<html>");
    response.write("<body>");
    // 입력한 값만큼 td태그 반복 출력
    response.write("<table border='1'>");
   
    for(let i=1; i<=9; i++){
        response.write("<tr>");
        response.write("<td>"+query.num1+"*"+i +" = "+(parseInt(query.num1)*i)+"</td>");

        response.write(`<td> ${query.num1}*${i}=${parseInt(query.num1)*i}</td>`)
        // Template Literal : 문자와 변수를 쉽게 치환할 수 있는 내장기능(표현식)
        response.write("</tr>");
    }
    response.write("</table>");

    response.write("pm2설치성공")

    response.write("</body>");
    response.write("</html>");
    response.end();

    console.log("서버생성성공");

    response.end();

}).listen(3000);
// pm2 start 서버파일이름.js --watch : 서버파일실행
// pm2 log : 서버파일 실행여부파악
// pm2 list : 실행되고 있는 서버 파일 확인
// pm2 kill : 모든 서버파일 삭제/중지