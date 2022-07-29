import {
  Card,
  CardImg,
  CardText,
  CardBody,
  CardTitle,
  CardSubtitle,
  CardGroup,
  Button,
  Row,
  Col,
} from "reactstrap";
import Blog from "../../components/dashboard/Blog";
import bg1 from "../../assets/images/bg/bg1.jpg";
import bg2 from "../../assets/images/bg/bg2.jpg";
import bg3 from "../../assets/images/bg/bg3.jpg";
import bg4 from "../../assets/images/bg/bg4.jpg";
import React, {useState} from "react";
import 'css/Modal.css'
import Modal from "modals/Modal";
import { Link, useLocation } from "react-router-dom";

const Cards = () => {
  const [ModalOn, setModalOn] = useState(false);
  return (
    <>
    <Modal show={ModalOn} onHide={()=>setModalOn(false)} />
    <div>
      <Row>
        <div className="ss3"><h2>노인 관리 page</h2></div>
        <div className="tt-3"><Link to="/Forms"><button className="ll-3">추가하기🔥</button></Link></div>
      </Row>
      <Row>
        <Col>
          <CardGroup>
            <Card>
              <CardImg alt="Card image cap" src={bg1} top width="100%" />
              <CardBody>
                <CardTitle tag="h5">우현백</CardTitle>
                <CardSubtitle className="mb-2 text-muted" tag="h6">
                  남, 70세
                </CardSubtitle>
                <hr></hr>
                <CardText>
                  주소 - 광주 동구 스마트인재 개발원 3층 A
                </CardText>
                <hr></hr>
                <p>특징 - 궁금한 게 많습니다</p>
                <hr></hr>
                <Button onClick={()=> setModalOn(true)}>영상보기</Button>
              </CardBody>
            </Card>
            <Card>
              <CardImg alt="Card image cap" src={bg2} top width="100%" />
              <CardBody>
                <CardTitle tag="h5">정훈김</CardTitle>
                <CardSubtitle className="mb-2 text-muted" tag="h6">
                 남, 88세
                </CardSubtitle>
                <hr></hr>
                <CardText>
                  주소 - 광주 광산구 하남 광주여대 생활관
                </CardText>
                <hr></hr>
                <p>특징 - 당뇨가 있습니다</p>
                <hr></hr>
                <Button onClick={()=> setModalOn(true)}>영상보기</Button>
              </CardBody>
            </Card>
            <Card>
              <CardImg alt="Card image cap" src={bg3} top width="100%" />
              <CardBody>
                <CardTitle tag="h5">나태란</CardTitle>
                <CardSubtitle className="mb-2 text-muted" tag="h6">
                  여, 75세
                </CardSubtitle>
                <hr></hr>
                <CardText>
                  주소 - 광주 광산구 떠돌이 생활 중
                </CardText>
                <hr></hr>
                <p>특징 - 화가 많습니다</p>
                <hr></hr>
                <Button onClick={()=> setModalOn(true)}>영상보기</Button>
              </CardBody>
            </Card>
          </CardGroup>
        </Col>
      </Row>
    </div>
    </>
  );
};

export default Cards;
