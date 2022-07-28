import React, {useState} from 'react';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import 'css/lest.css';
// import Bar from 'modals/Bar';
import Pagination from 'modals/Pagination';
import RecordModal from 'modals/RecordModal';


function AutoLayoutExample() {
  const [RecordModalOn, setRecordModalOn] = useState(false);
  return (
    <>
    <RecordModal show={RecordModalOn} onHide={()=>setRecordModalOn(false)}/>
    <Container>
      <center><h1>🎥 record 🎬</h1></center>
      {/* <Bar></Bar> */}
      <hr></hr>
      <br></br>
      <Row>
        <Col className='z-1' md="3">
          <div className='x-1'>
            
              <img src="img/car.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
           
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>KR100443682B1_01_33._</p>
        </Col>
        <Col className='z-2' md="3"><div className='x-1'>
         
              <img src="img/로고.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
          
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>2022-07-19 12:16 pm</p></Col>
        <Col className='z-3' md="3"><div className='x-1'>
            
              <img src="img/record.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
           
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>KR100443682B1_01_33._</p></Col>
      </Row>
      <br></br>
      <br></br>
      <Row>
        <Col className='z-1' md="3"><div className='x-1'>
          
              <img src="img/record.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
         
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>KR100443682B1_01_33._</p></Col>
        <Col className='z-2' md="3"><div className='x-1'>
          
              <img src="img/record.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
          
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>KR100443682B1_01_33._</p></Col>
        <Col className='z-3' md="3"><div className='x-1'>
          
              <img src="img/record.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
          
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>KR100443682B1_01_33._</p></Col>
      </Row>
      <br></br>
      <br></br>     
    </Container>
    <div className="page">
    <Pagination></Pagination>
    </div>
    </>
  );
}

export default AutoLayoutExample;