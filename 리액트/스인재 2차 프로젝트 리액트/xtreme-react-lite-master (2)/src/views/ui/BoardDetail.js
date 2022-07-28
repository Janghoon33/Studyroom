import { Component } from "react";
import Table from "react-bootstrap/Table";
import Button from "react-bootstrap/Button";
import 'css/Board.css';
import Comment from 'views/ui/Comment'; 
import { Link, useParams } from "react-router-dom";
import {useEffect,useState} from "react";
import Axios from "axios";
import { useLocation } from 'react-router-dom';
import axios from "axios";

// class BoardList extends Component {
    
function BoardDetail(){
        const state = useLocation().state;
        console.log(state);
        const [board, setBoard] = useState({});
        
        useEffect(()=>{
            Axios.post("/api/boardContent/" + state.b_num).then((response)=>{
                console.log("상세페이지",response);
                if(response.data){
                    setBoard(response.data) 
                }else{
                    alert("failed to");
                }
            });
        },[])

        return (
            <div key={board.b_num}>
                <div className="a-3"><h1>제목 : {board.b_title}</h1></div> 
                <div className="b-3">
                    <a href="#" className="re-3">수정ㅤ</a>
                <button onClick={()=>{
                    Axios.post("/api/board/delete/"+state.b_num)
                    alert("삭제완료")
                    href="/Tables"
                }}>삭제</button>
                </div>
                
                <hr></hr>
                <div className="br-3">{board.b_content}</div>
                <div className="cr-3">
                    <span className="a1">🕐 {board.b_date}</span>
                    <span className="a2">작성자 : {board.b_writer}</span>
                </div>
                <br></br>
                <Comment></Comment>
                <br></br>
                <Link to="/Table">
                <button type="button" className="back-3">목록으로</button>
                </Link>
            </div>
        );
        }


export default BoardDetail;