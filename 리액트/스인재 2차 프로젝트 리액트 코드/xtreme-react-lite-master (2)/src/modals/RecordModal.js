import React from 'react'
import { Modal, Button } from 'react-bootstrap'
import "css/Modal.css"

const RecordModal = ({ show, onHide}) => {
  return (
    <Modal
      show={show}
      onHide={onHide}
      size="xl"
      aria-labelledby="contained-modal-title-vcenter"
      centered
    >
      <Modal.Header closeButton>
        <Modal.Title id="contained-modal-title-vcenter">
          제목
        </Modal.Title>
      </Modal.Header>
      <Modal.Body>
      <video controls className='video'>

        <source src="video/pang.mp4"
        type="video/mp4"></source>

      </video>
      </Modal.Body>
      <Modal.Footer>
      </Modal.Footer>
    </Modal>
  )
}

export default RecordModal