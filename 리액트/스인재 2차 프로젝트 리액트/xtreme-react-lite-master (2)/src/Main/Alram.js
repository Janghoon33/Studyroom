import Button from 'react-bootstrap/Button';
import OverlayTrigger from 'react-bootstrap/OverlayTrigger';
import Popover from 'react-bootstrap/Popover';
import { Link } from "react-router-dom";

function PopoverPositionedExample() {
    
  return (
    <>
      {['bottom'].map((placement) => (
        <OverlayTrigger
          trigger="click"
          key={placement}
          placement={placement}
          overlay={
            <Popover id={`popover-positioned-${placement}`}>
              <Popover.Header as="h3">{`*이상행동 감지*`}</Popover.Header>
              <Popover.Body>
                    <Link to="/Cards"><Button id='bu'>영상</Button></Link> 확인하러 가기
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