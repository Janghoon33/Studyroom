import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import 로고 from "../assets/images/logos/로고.svg";
import Nav from 'react-bootstrap/Nav';
import 'css/Footer.css';

function AutoLayoutVariableExample() {
  return (
    <Container>
      <Row>
        <Col>
        <img
              src={로고}
              alt="profile"
              className="img2"
              width="330"
            ></img>
        <Nav className="justify-content-center" activeKey="/home">
        <Nav.Item>
          <Nav.Link href="/home">Active</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link eventKey="link-1">Link</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link eventKey="link-2">Link</Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link eventKey="disabled" disabled>
            Disabled
          </Nav.Link>
        </Nav.Item>
      </Nav>
      <p className="text-center mt-4 mb-4">Or right-aligned</p>
        </Col>
        <Col>

        </Col>
        <Col>
        
        </Col>
      </Row>
    </Container>
  );
}

export default AutoLayoutVariableExample;