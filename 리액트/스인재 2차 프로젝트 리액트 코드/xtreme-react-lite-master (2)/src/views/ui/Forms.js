import {
  Card,
  Row,
  Col,
  CardTitle,
  CardBody,
  Button,
  Form,
  FormGroup,
  Label,
  Input,
} from "reactstrap";
import "css/lest.css";
import DaumPost  from 'modals/DaumPost';
import { Link } from "react-router-dom";
import { useEffect } from "react";
import 'css/lest.css';
import $ from 'jquery';
import Axios  from 'axios';



// const [mem, setMember] = useState("");


const Forms = () => {
  let param = {};
  useEffect(()=>{ 
  
    $(".tt-4").on('click',function () {      //마우스 누를떼 
      console.log($("div.loginregister__id > input:eq(0)").val());
      console.log($("div.loginregister__email > input:eq(0)").val());
      console.log($("div.loginregister__pw > input:eq(0)").val());
      param.mem_id = $("div.loginregister__id > input:eq(0)").val()
      param.mem_pw = $("div.loginregister__pw > input:eq(0)").val() 
      param.mem_name = $("div.loginregister__name > input:eq(0)").val()
      param.mem_email = $("div.loginregister__email > input:eq(0)").val()
      param.mem_address = $("div.loginregister__address > input:eq(0)").val()
      param.mem_phone = $("div.loginregister__phone > input:eq(0)").val()
      param.s_name = $("input[name='s_name']").val()
      param.s_birth = $("input[name='s_birth']").val()
      param.s_gender = $("input[name='s_gender']:checked").val()
      // param.photo = $("#photo").val()
      // param.photo = document.getElementById('s_photo').value
      param.s_phone = $("input[name='s_phone']").val()
  
      param.s_address = $("input[name='s_address']").val()
      param.s_care = $("input[name='s_care']").val()
  
      console.log(param);
      
      Axios.post("/api/seniorInsert",param).then((response)=>{
        if(response.data){
          console.log(response.data);
          //setUser(response.data);
        }else{
          alert("failed to ");
        }
      });
     });
  },[]);
  return (
    <Row>
      <Col className="col" md="9">
        {/* --------------------------------------------------------------------------------*/}
        {/* Card-1*/}
        {/* --------------------------------------------------------------------------------*/}
        <Card>
          <CardTitle tag="h6" className="border-bottom p-3 mb-0">
            <i className="bi bi-bell me-2"> </i>
            시니어 정보 등록
            <span className="a-1">ㅤ* </span>
            <span className="a-2"> 항목은 필수 입력사항입니다.</span>
          </CardTitle>
          <CardBody>
            <Form>
              <FormGroup>
                <Label for="exampleName">이름</Label><span className="a-1">*</span>
                <Input
                  id="s_name"
                  name="s_name"
                  placeholder="이름을 입력해주세요."
                  type="text"
                />
              </FormGroup>
              <FormGroup>
                <Label for="exampleDate">생년-월-일</Label><span className="a-1">*</span>
                <Input
                  id="s_birth"
                  name="s_birth"
                  placeholder="년-월-일"
                  type="Date"
                />
              </FormGroup>
              <FormGroup tag="fieldset">
                <Label>성별</Label><span className="a-1">*</span>
                <FormGroup check>
                  <Input name="s_gender" type="radio" value ="남성"/>{" "}
                  <Label check>
                    남성
                  </Label>
                </FormGroup>
                <FormGroup check>
                  <Input name="s_gender" type="radio" value ="여성"/>{" "}
                  <Label check>
                    여성
                  </Label>
                </FormGroup>
              </FormGroup>
              {/* <FormGroup>
                <Label for="exampleFile">이미지</Label>
                <Input id="exampleFile" name="file" type="file" />
              </FormGroup> */}
              <FormGroup>
                <Label for="exampleTel">보호자 전화번호</Label>
                <Input
                  id="s_phone"
                  name="s_phone"
                  placeholder="보호자 번호를 입력해주세요."
                  type="tel"
                />
              </FormGroup>
              <FormGroup>
                <Label for="exampleAddress">주소</Label>
                <Input
                  id="s_address"
                  name="s_address"
                  placeholder="주소를 입력해주세요."
                  type="text"
                />
              </FormGroup>
              <FormGroup>
                <Label for="exampleText">특징</Label>
                <Input id="s_care" name="s_care" type="text" placeholder="시니어의 질병이나 주의할 점을 적어주세요."/>
              </FormGroup>
              <Link to="/Cards"><Button className="tt-4">등록하기</Button></Link>
            </Form>
          </CardBody>
        </Card>
      </Col>
    </Row>
  );
};
export default Forms;