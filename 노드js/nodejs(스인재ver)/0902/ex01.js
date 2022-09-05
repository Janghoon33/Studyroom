console.log("Node동작성공");
// 단축키
/**
* ctrl + c : 명령취소 / 종료
 * ls : 파일확인
 * cd [폴더명]: 폴더이동
 * cd .. : 상위폴더이동
 * clear : 이전 명령삭제
 * node [js파일] : nodejs 실행
 * 방향키 ↑: 이전명령 확인
 * tab : 파일이름 자동생성
 */
/**
 * 모듈(Module) :  독립된 기능을 갖는 함수/파일들의 모임, Nodejs에서 만들어놓은 기능들의 단위
 * require :  모듈을 가져오는 명령어
 * http모듈 : 현재 파일을 서버로 만들어주는 모듈
 */
const http = require("http") ;

http.createServer(function(request, response){

    console.log("서버 실행");

    let ip = request.connection.remoteAddress;
    // request : Client의 모든 정보를 갖고 있는 변수
    console.log("접근한  Client의 IP : "+ip);

    response.writeHead(200, {"Content-Type" : "text/html;charset=utf-8"});
    // 패킷(Header/Body), writeHead : 패킷에 Header값을 지정
    // response : Server가 Client에게 응답해주는 객체
    //                      (html 페이지 생성/페이지이동)
    response.write("<html>");
    response.write("<body>");
    response.write("환영합니다");
    response.write(" 당신의 IP : "+ ip);
    response.write("</body>");
    response.write("</html>");
    response.end();

}).listen(3000);
// listen : port번호 설정(방번호)