import React from "react";
import Single from "views/ui/Single";
import 'css/Board.css';
import { useEffect,useState } from "react";
import  Axios  from "axios";
import { createProxyMiddleware } from "http-proxy-middleware";
import { Table } from "reactstrap";
import $, { data } from "jquery";


const Comment = (props) =>{
  // 댓글 쓰기 페이지

  // const state = useLocation().state;
  // let num = parseInt(state.b_num)
  // console.log("데이터",state.b_num);
  console.log("데이터",props.data)

  const [comment, setComment] = useState([]);
  const [teststate,setTest] = useState("1");
  const mem_id = sessionStorage.getItem('mem_id')
  const mem_address = sessionStorage.getItem('mem_address')
  const mem_name = sessionStorage.getItem('mem_name')
  const mem_phone = sessionStorage.getItem('mem_phone')
  let param = {};
  let num = parseInt(props.data)

  useEffect(()=>{

    console.log("댓글 ~~~~")
    Axios.post("/api/comment", num,{headers: { "Content-Type": `application/json`}}).then((response)=>{
      console.log("댓글 : ",response.data)
      if(response.data){
        setComment(response.data)
      }else{
        alert("failed to");
      }
    });


  },[]);




const writeComment=()=>{

  param.c_content = $("textarea.q-1").val();
  param.b_num = parseInt(props.data);
  param.mem_id = (sessionStorage.getItem('mem_id'))
  console.log($("textarea.q-1").val());
  console.log("파람아~ : ", param);
  console.log("댓글 추가 해줘");


Axios.post("/api/commentInsert", param).then((response)=>{
  if(response.data){
    // setComment(response.data)
    location.reload()
  }else{
    alert("failed to");
  }
})
}
  

  
  const removeComment = (e) =>{

  console.log("댓글삭제");

  console.log("data",e)
  let num = e;

  Axios.post("/api/commentDelete", num, {headers: { "Content-Type": `application/json`}}).then((response)=>{
    console.log("댓글삭제 ㄱㄱ?",response);
    setTest("2");
    location.reload()
  })

}



    if(mem_id === "admin"){
    return(
      <div id="root">
      <div>
          <div id="writing-area">
            <textarea id="new-tweet-content" name="c_content" className="q-1"></textarea>
            <button className="q-2" id="submit-new-tweet"  onClick={()=>writeComment()}>댓글</button>
          </div>
          <div className="q-3">
          <ur id="tweets">
            <div>
              <Table className="table">
                {
                  comment.map((comment,index)=>(
                <tr>
                <td>{comment.c_wirter}</td>
                <td>{comment.c_content}</td>
                <td className="td">{comment.c_date}</td>
                <a className="a" onClick={()=>removeComment(comment.c_num) }>삭제</a>
                </tr>
                ))
                }
              </Table>
            </div>
            
          </ur>
          </div>
      </div>
    </div>
    )}
    else{
      return(
        <div id="root">
        <div>

            <div className="q-3">
            <ur id="tweets">
              <div>
                <Table className="table">
                  {
                    comment.map((comment,index)=>(
                  <tr>
                  <td>{comment.c_wirter}</td>
                  <td>{comment.c_content}</td>
                  <td className="td">{comment.c_date}</td>
                  <a className="a" >ㅤ</a>
                  </tr>
                  ))
                  }
                </Table>
              </div>
              
            </ur>
            </div>
        </div>
      </div>
    )
    }
  }

export default Comment;