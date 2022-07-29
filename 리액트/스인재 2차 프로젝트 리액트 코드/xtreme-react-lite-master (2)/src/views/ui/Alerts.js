import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
import Toast from 'react-bootstrap/Toast';
import Accordion from 'react-bootstrap/Accordion';
import 'css/lest.css';

function DismissibleExample() {
  const [showA, setShowA] = useState(true);
  
  const toggleShowA = () => setShowA(!showA);

  return (
    <Row className='fh-3'>
      <Col md={12}>
        <Toast show={showA} className="ww-3">
          <Toast.Body>
            <>
            <Accordion defaultActiveKey="0">
      <Accordion.Item eventKey="0">
        <Accordion.Header>영상 저장기간이 어떻게 되나요?</Accordion.Header>
        <Accordion.Body>
         영상은 1주일 동안 저장되면 추후에는 자동 삭제됩니다.
         감사합니다 🌈
        </Accordion.Body>
      </Accordion.Item>
      <Accordion.Item eventKey="1">
        <Accordion.Header>Question</Accordion.Header>
        <Accordion.Body>
          Answer 🚀
        </Accordion.Body>
      </Accordion.Item>
      <Accordion.Item eventKey="2">
        <Accordion.Header>궁금한게 없어요!!</Accordion.Header>
        <Accordion.Body>
         그만큼 완벽하다는 거죠.
         감사합니다 🌈
        </Accordion.Body>
      </Accordion.Item>
      <Accordion.Item eventKey="3">
        <Accordion.Header>한 번씩 오작동해요</Accordion.Header>
        <Accordion.Body>
          쏴리 (～￣▽￣)～
        </Accordion.Body>
      </Accordion.Item>
      <Accordion.Item eventKey="4">
        <Accordion.Header>이 제품 자체를 잘 모르겠어요</Accordion.Header>
        <Accordion.Body>
          저희 제품은 이상행동을 감지할 시 알림을 보냅니다.!!
        </Accordion.Body>
      </Accordion.Item>
            </Accordion>
            </>
          </Toast.Body>
        </Toast>
      </Col>
    </Row>
  );
}

export default DismissibleExample;