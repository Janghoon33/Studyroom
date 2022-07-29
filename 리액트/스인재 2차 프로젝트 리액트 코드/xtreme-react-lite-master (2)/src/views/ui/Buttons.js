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
import { data } from "jquery";


// class BoardList extends Component {
// 상세 글 보기 페이지
function BoardList(){
    
        const state = useLocation().state;
        let num = parseInt(state.b_num)
        console.log("데이터",state.b_num);
        
        const [board, setBoard] = useState({});
        console.log(board)
        

        useEffect(()=>{
            console.log("boardList");
            console.log("22222222222")
            Axios.post("/api/boardContent" , num,{headers: { "Content-Type": `application/json`}}).then((response)=>{
                console.log("상세페이지",response);
                if(response.data){
                    setBoard(response.data) 
                }else{
                    alert("failed to");
                }
            });
        },[])
        
        const removeBoard = (e) => {
            console.log("삭제");
            
            Axios.post("/api/boardDelete",num,{headers: { "Content-Type": `application/json`}}).then((response)=>{
                console.log("삭제한다?",response);
                if(response.data){
                    setBoard(response.data)
                    console.log(response.data)
                    location.reload()
                }else{
                    alert("failed to");
                }
            })
        
        }

        return (
            <div key={state.b_num}>
                {console.log("3333333333333")}
                <div className="a-3"><h1> 제목 : {board.b_title}</h1></div> 
                <div className="b-3"><Link to="/Badges"> 수정  </Link> 
                <Link to="/Table"><button onClick={(e)=>removeBoard() } > 삭제 </button></Link></div>
                <hr></hr>
                <div className="br-3">{board.b_content}</div>
                <div className="cr-3">
                    <span className="a1">🕐 {board.b_date}</span>
                    <span className="a2">작성자 : {board.b_writer}</span>
                </div>
                <br></br>
                <Comment data={num}></Comment>
                <br></br>
                <Link to="/Table">
                <button type="button" className="back-3">목록으로</button>
                </Link>
            </div>
        );
        }


export default BoardList;