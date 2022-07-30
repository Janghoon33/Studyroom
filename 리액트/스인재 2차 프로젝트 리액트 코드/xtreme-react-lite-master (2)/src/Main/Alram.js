import { func } from 'prop-types';
import Button from 'react-bootstrap/Button';
import OverlayTrigger from 'react-bootstrap/OverlayTrigger';
import Popover from 'react-bootstrap/Popover';
import { Link } from "react-router-dom";
import 'css/lest.css';

function PopoverPositionedExample() {

 
function del (){
  let a = document.getElementsByClassName('ling')
  document.getElementsByClassName('bs-popover-bottom')[0].innerHTML="";
  try {
    
      a[0].classList.remove('ling')
    
  } catch (error) {
    console.log('이미없음')
  }
  
  
 
} 
  return (
    <>
      {['bottom'].map((placement) => (
        <OverlayTrigger
          name="alram"
          trigger="click"
          key={placement}
          placement={placement}
          overlay={
            <Popover id={`popover-positioned-${placement}`}>
              <Popover.Header as="h3"><center>{`*이상행동 감지*`}</center></Popover.Header>
              <Popover.Body>
                    <Link to="/Cards"><Button id='bu' onClick={del}>영상</Button></Link> 확인하러 가기
              </Popover.Body>
            </Popover>
          }
        >
          <Button variant="secondary">{placement}</Button>
        </OverlayTrigger>
      ))}
    </>
  );
}

export default PopoverPositionedExample;