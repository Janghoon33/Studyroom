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
      <iframe src="http://59.0.236.92:9000/video_feed" width="700" height="500" url="59.0.124.230:9000/video_feed" title="YouTube video player" frameBorder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
      </Modal.Body>
      <Modal.Footer>
        <Button onClick={onHide} className="A">확인</Button>
      </Modal.Footer>
    </Modal>
  
  )
}

export default modal