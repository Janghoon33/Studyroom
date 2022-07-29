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

const Header = () => {
  const [isOpen, setIsOpen] = React.useState(false);
  const [dropdownOpen, setDropdownOpen] = React.useState(false);
  const toggle = () => setDropdownOpen((prevState) => !prevState);
  const Handletoggle = () => {
    setIsOpen(!isOpen);
  };
  const showMobilemenu = () => {
    document.getElementById("sidebarArea").classList.toggle("showSidebar");
  };

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
              style={{marginRight:15, 
                borderStyletype:"solid",
                borderRadius: 5}}>
                    Login 💨
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
  );
};

export default Header;
