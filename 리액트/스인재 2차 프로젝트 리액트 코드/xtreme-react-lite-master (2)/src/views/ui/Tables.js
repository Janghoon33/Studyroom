import ProjectTables from "../../components/dashboard/ProjectTable";
import { Row, Col, Table, Card, CardTitle, CardBody, Button } from "reactstrap";
import { Link, useLocation, useNavigate } from "react-router-dom";
import 'css/Board.css';
import Pagination from 'modals/Pagination';
import  Axios  from "axios";
//import $ from "jquery";
import { useEffect,useState } from "react";

const Tables = () => {
  // 게시글 목록 페이지
  const navigate = useNavigate();
  const [board, setBoard] = useState([]);
  const mem_id = sessionStorage.getItem('mem_id')
  const mem_address = sessionStorage.getItem('mem_address')
  const mem_name = sessionStorage.getItem('mem_name')
  const mem_phone = sessionStorage.getItem('mem_phone')
  useEffect(()=>{

    Axios.post("/api/board").then((response)=>{
      console.log("데이터", response)
      console.log("데이터2", response.data)
      if(response.data){
        // 여기 스프레드표현법 말고 그냥 바로넣음(그래야 실행이 되네??)
        setBoard(response.data); // ...을 써줘서  state가 변경된걸 리액트에게 알려주기
        console.log(response.data);
      }else{
        alert("failed to");
      }
    });
 // useEffect안에서 set함수 사용하면 오류 발생(무한루프) -> 빈 배열([]) 하나 넣어주기

  },[]);
  
  // const handleClick = () => {
  //   navigate('/Test', {
  //     state: {
  //       title: "test",
  //     },
  //   });
  // };

  const fn_moveDetail = (b_num,  e) => {
    navigate('/Buttons', {
      state: {
        b_num : b_num
      },
    })
  };
if(mem_id === null){
  return (
    
    <Row>
      <Col lg="12">
        <Card>
          <CardTitle tag="h6" className="border-bottom p-3 mb-0">
            <i className="bi bi-card-text me-2"> </i>
            문의게시판
          </CardTitle>
          <CardBody className="">
            {/* <button onClick={handleClick}>이동</button> */}
            <Table bordered striped>
              <thead>
                <tr className="z">
                  <th>번호</th>
                  <th>제목</th>
                  <th>작성자</th>
                  <th>작성일</th>
                </tr>
              </thead>
              
              <tbody>
                
              {
                  board.map((board,index) => (
                  <tr className="z">
                  <th key={index} scope="row">{board.b_num}</th>
                  {/* <td><Link to="/Buttons" value={board.b_num}  className="em-3"> */}
                  <td onClick={(e)=>{fn_moveDetail(board.b_num, e)}}>{board.b_title}</td>
                  <td>{board.b_writer}</td>
                  <td>{board.b_date}</td>
                </tr>
                ))
                } 
              </tbody>
            </Table>
          </CardBody>
        </Card>
      </Col>
      <div className="fhdn">
      <Pagination></Pagination>
      </div>
    </Row>
  )}
  else{
    return (
    
      <Row>
        <Col lg="12">
          <Card>
            <CardTitle tag="h6" className="border-bottom p-3 mb-0">
              <i className="bi bi-card-text me-2"> </i>
              문의게시판<Link to="/Badges"><button className="bu">글 작성</button></Link>
            </CardTitle>
            <CardBody className="">
              {/* <button onClick={handleClick}>이동</button> */}
              <Table bordered striped>
                <thead>
                  <tr className="z">
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                  </tr>
                </thead>
                
                <tbody>
                  
                {
                    board.map((board,index) => (
                    <tr className="z">
                    <th key={index} scope="row">{board.b_num}</th>
                    {/* <td><Link to="/Buttons" value={board.b_num}  className="em-3"> */}
                    <td onClick={(e)=>{fn_moveDetail(board.b_num, e)}}>{board.b_title}</td>
                    <td>{board.b_writer}</td>
                    <td>{board.b_date}</td>
                  </tr>
                  ))
                  } 
                </tbody>
              </Table>
            </CardBody>
          </Card>
        </Col>
        <div className="fhdn">
        <Pagination></Pagination>
        </div>
      </Row>
    )
  }

};

export default Tables;
