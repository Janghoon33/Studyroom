const http = require("http");
const url = require("url");

http.createServer(function (request, response) {
    
    console.log(request.url);
    // /?   num1 =  123      &num2= 456
    // 시작 name  value
    // QueryString : URL을 통해서 서버로 값을 보내는 방식
    let query = url.parse(request.url, true).query;  // true : name과  value값으로 구분하겠다
    console.log(query);
    console.log("사용자가 입력한 num1값 : "+query.num1);
    console.log("사용자가 입력한 num1값 : "+query.num2);
    console.log("num1과 num2의 합 : "+(parseInt(query.num1)+parseInt(query.num2)));
    response.writeHead(200, {"Content-Type" : "text/html;charset=utf-8"});
    response.write("<html>");
    response.write("<body>");
    if(query.opr == "+"){
        response.write("num1과 num2의 합 : "+(parseInt(query.num1)+parseInt(query.num2)));
    }else if(query.opr == "-"){
        response.write("num1과 num2의 차 : "+(parseInt(query.num1)-parseInt(query.num2)));
    }else if(query.opr == "*"){
        response.write("num1과 num2의 곱 : "+(parseInt(query.num1)*parseInt(query.num2)));
    }else{
        response.write("num1과 num2의 몫 : "+(parseInt(query.num1)/parseInt(query.num2)));
    }
    response.write("</body>");
    response.write("</html>");
    response.end();

    console.log("서버생성성공");

    response.end();

}).listen(3000);