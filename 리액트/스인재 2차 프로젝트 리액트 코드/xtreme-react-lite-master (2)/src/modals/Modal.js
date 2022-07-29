import React from 'react'
import {Modal, Button} from 'react-bootstrap'; 
import "css/Modal.css"

const modal = ({show, onHide}) => {
  return (
 
    <Modal
      show={show}
      onHide={onHide}
      size="lg"
      aria-labelledby="contained-modal-title-vcenter"
      centered
    >
      <Modal.Header closeButton>
        
        <Modal.Title id="contained-modal-title-vcenter">
          <div className='title'>video</div>
        </Modal.Title>
      </Modal.Header>
      <Modal.Body>
        <h4>여따 영상 박을 거임</h4>
       <p>조절</p>
       <p>쌉</p>
       <p>가능</p>
       <p>어느정도 크기 원해 ㅋ</p>
      </Modal.Body>
      <Modal.Footer>
        <Button onClick={onHide} className="A">확인</Button>
      </Modal.Footer>
    </Modal>
  
  )
}

export default modal