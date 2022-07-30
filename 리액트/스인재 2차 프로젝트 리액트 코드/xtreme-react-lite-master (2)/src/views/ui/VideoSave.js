import React, {useState} from 'react';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import 'css/lest.css';
// import Bar from 'modals/Bar';
import Pagination from 'modals/Pagination';
import RecordModal from 'modals/RecordModal';
import 'css/lest.css';


function AutoLayoutExample() {
  const [RecordModalOn, setRecordModalOn] = useState(false);
  const mem_id = sessionStorage.getItem('mem_id')
  const mem_address = sessionStorage.getItem('mem_address')
  const mem_name = sessionStorage.getItem('mem_name')
  const mem_phone = sessionStorage.getItem('mem_phone')
    
  
  if(mem_id === null ){
      return(
      <>
      <div className='dd'>
        <br></br>
        <center><h5>로그인 후 이용가능합니다.</h5></center>
        <hr></hr>
        <button className='one' type='button'>로그인</button><button className='two' type='button'>회원가입</button>
      </div>
      </>
      )
    } 
    
    
    else{
  return (
    <>
     <RecordModal show={RecordModalOn} onHide={()=>setRecordModalOn(false)}/>
   <div>
    <center><h2>Video Save</h2></center>
    <hr></hr>
    <Row>
        <Col className='z-1' md="3">
          <div className='x-1'>
            
              <img src="img/record.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
           
          </div>
          <hr className='hr'></hr>
          <p className='p-1'>KR100443682B1_01_33._</p>
        </Col>
        <Col className='z-2' md="3"><div className='x-1'>
         
              <img src="img/record.png" className='gg-2' onClick={()=>setRecordModalOn(true)}></img>
          
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
   </div>
   <div className="page">
    <Pagination></Pagination>
    </div>
    </>
  )}
}

export default AutoLayoutExample;