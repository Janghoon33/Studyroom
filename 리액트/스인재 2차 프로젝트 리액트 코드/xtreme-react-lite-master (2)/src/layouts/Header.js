import React, { useEffect } from "react";
import { Link } from "react-router-dom";
import {
  Navbar,
  Collapse,
  Nav,
  NavItem,
  NavbarBrand,
  UncontrolledDropdown,
  DropdownToggle,
  DropdownMenu,
  DropdownItem,
  Dropdown,
  Button,
} from "reactstrap";
import { ReactComponent as LogoWhite } from "../assets/images/logos/xtremelogowhite.svg";
import user1 from "../assets/images/users/user1.jpg";
import 'css/lest.css';
import Alram from 'Main/Alram';

const Header = (props) => {
  const [isOpen, setIsOpen] = React.useState(false);
  const [dropdownOpen, setDropdownOpen] = React.useState(false);
  const toggle = () => setDropdownOpen((prevState) => !prevState);
  const Handletoggle = () => {
    setIsOpen(!isOpen);
  };
  const showMobilemenu = () => {
    document.getElementById("sidebarArea").classList.toggle("showSidebar");
  };
  const mem_id = sessionStorage.getItem('mem_id')
  const mem_address = sessionStorage.getItem('mem_address')
  const onLogout = () => {
    // sessionStorage 에 저장되어있는 아이템을 삭제한다.
      sessionStorage.removeItem('mem_id')
      sessionStorage.removeItem('mem_name')
      sessionStorage.removeItem('mem_address')
      sessionStorage.removeItem('mem_phone')
      // App 으로 이동(새로고침)
      document.location.href = '/'
  }
    if(mem_id === null ){
  return (
  
    <Navbar color="primary" dark expand="md">
      <div className="d-flex align-items-center">
        <NavbarBrand href="/" className="d-lg-none">
          <LogoWhite />
        </NavbarBrand>
        <span className="ling"><Alram></Alram></span>
        <Button
          color="primary"
          className="d-lg-none"
          onClick={() => showMobilemenu()}
        >
          <i className="bi bi-list"></i>
        </Button>
      </div>
      <div className="hstack gap-2">
        <Button
          color="primary"
          size="sm"
          className="d-sm-block d-md-none"
          onClick={Handletoggle}
        >
          {isOpen ? (
            <i className="bi bi-x"></i>
          ) : (
            <i className="bi bi-three-dots-vertical"></i>
          )}
        </Button>
      </div>

      <Collapse navbar isOpen={isOpen}>
        <Nav className="me-auto" navbar>
          <NavItem>
            {/* <Link to="/starter" className="nav-link">
               
            </Link> */}
          </NavItem>
          <NavItem>
            {/* <Link to="/about" className="nav-link">
               
            </Link> */}
          </NavItem>
          <UncontrolledDropdown inNavbar nav>
            {/* <DropdownToggle caret nav>
               
            </DropdownToggle> */}
            
          </UncontrolledDropdown>
        </Nav>
        <Dropdown isOpen={dropdownOpen} toggle={toggle}>
          <DropdownToggle color="primary">
            
          <Link to="/About">
              <button type="button" 
              className="lo" 
              style={{marginRight:15, 
                borderStyletype:"solid",
                borderRadius: 5}}>
                 
                    Log-in
              </button>
            </Link>
            
        {/*=========로그인 사람 로그 분리==================*/}
            {/* <img
              src={user1}
              alt="profile"
              className="rounded-circle"
              width="30"
            ></img> */}
        {/*=========로그인 사람 로그 분리==================*/}

          </DropdownToggle>
          {/* <DropdownMenu>
            <DropdownItem header>Info</DropdownItem>
            <DropdownItem>My Account</DropdownItem>
            <DropdownItem>Edit Profile</DropdownItem>
            <DropdownItem divider />
            <DropdownItem>My Balance</DropdownItem>
            <DropdownItem>Inbox</DropdownItem>
            <DropdownItem>Logout</DropdownItem>
          </DropdownMenu> */}
        </Dropdown>
      </Collapse>
    </Navbar>
  )}
  else{
    return (
  
      <Navbar color="primary" dark expand="md">
        <div className="d-flex align-items-center">
          <NavbarBrand href="/" className="d-lg-none">
            <LogoWhite />
          </NavbarBrand>
          <span className="ling"><Alram></Alram></span>
          <Button
            color="primary"
            className="d-lg-none"
            onClick={() => showMobilemenu()}
          >
            <i className="bi bi-list"></i>
          </Button>
        </div>
        <div className="hstack gap-2">
          <Button
            color="primary"
            size="sm"
            className="d-sm-block d-md-none"
            onClick={Handletoggle}
          >
            {isOpen ? (
              <i className="bi bi-x"></i>
            ) : (
              <i className="bi bi-three-dots-vertical"></i>
            )}
          </Button>
        </div>
  
        <Collapse navbar isOpen={isOpen}>
          <Nav className="me-auto" navbar>
            <NavItem>
              {/* <Link to="/starter" className="nav-link">
                 
              </Link> */}
            </NavItem>
            <NavItem>
              {/* <Link to="/about" className="nav-link">
                 
              </Link> */}
            </NavItem>
            <UncontrolledDropdown inNavbar nav>
              {/* <DropdownToggle caret nav>
                 
              </DropdownToggle> */}
              
            </UncontrolledDropdown>
          </Nav>
          <Dropdown isOpen={dropdownOpen} toggle={toggle}>
            <DropdownToggle color="primary">
                <button type="button" onClick={(onLogout)} className="lo222" 
                style={{marginRight:15, 
                  borderStyletype:"solid",
                  borderRadius: 5}}>
                      Log-out
                </button>
              
          {/*=========로그인 사람 로그 분리==================*/}
              {/* <img
                src={user1}
                alt="profile"
                className="rounded-circle"
                width="30"
              ></img> */}
          {/*=========로그인 사람 로그 분리==================*/}
  
            </DropdownToggle>
            {/* <DropdownMenu>
              <DropdownItem header>Info</DropdownItem>
              <DropdownItem>My Account</DropdownItem>
              <DropdownItem>Edit Profile</DropdownItem>
              <DropdownItem divider />
              <DropdownItem>My Balance</DropdownItem>
              <DropdownItem>Inbox</DropdownItem>
              <DropdownItem>Logout</DropdownItem>
            </DropdownMenu> */}
          </Dropdown>
        </Collapse>
      </Navbar>
  )}
};

export default Header;