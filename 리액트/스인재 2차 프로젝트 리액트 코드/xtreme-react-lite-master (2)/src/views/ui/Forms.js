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


const Forms = () => {
  return (
    <Row>
      <Col>
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
                  id="exampleName"
                  name="name"
                  placeholder="이름을 입력해주세요."
                  type="text"
                />
              </FormGroup>
              <FormGroup>
                <Label for="exampleDate">생년-월-일</Label><span className="a-1">*</span>
                <Input
                  id="exampleDate"
                  name="Date"
                  placeholder="년-월-일"
                  type="Date"
                />
              </FormGroup>
              <FormGroup tag="fieldset">
                <Label>성별</Label><span className="a-1">*</span>
                <FormGroup check>
                  <Input name="radio1" type="radio" />{" "}
                  <Label check>
                    남성
                  </Label>
                </FormGroup>
                <FormGroup check>
                  <Input name="radio1" type="radio" />{" "}
                  <Label check>
                    여성
                  </Label>
                </FormGroup>
              </FormGroup>
              <FormGroup>
                <Label for="exampleFile">이미지</Label>
                <Input id="exampleFile" name="file" type="file" />
              </FormGroup>
              <FormGroup>
                <Label for="exampleTel">보호자 전화번호</Label>
                <Input
                  id="exampleTel"
                  name="tel"
                  placeholder="보호자 번호를 입력해주세요."
                  type="tel"
                />
              </FormGroup>
              <FormGroup>
                <Label for="exampleAddress">주소</Label>
                <Input
                  id="exampleAddress"
                  name="address"
                  placeholder="주소를 입력해주세요."
                  type="text"
                />
              </FormGroup>
              <FormGroup>
                <Label for="exampleText">특징</Label>
                <Input id="exampleText" name="text" type="textarea" placeholder="시니어의 질병이나 주의할 점을 적어주세요."/>
              </FormGroup>
              <Link to="/Cards"><Button>등록🌹</Button></Link>
            </Form>
          </CardBody>
        </Card>
      </Col>
    </Row>
  );
};
export default Forms;