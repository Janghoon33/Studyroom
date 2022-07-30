import { Button, Nav, NavItem } from "reactstrap";
import Logo from "./Logo";
import { Link, useLocation } from "react-router-dom";
import Alerts from "views/ui/Alerts";
import { useState } from "react";
import user1 from "../assets/images/users/user1.jpg";
import 'css/lest.css';

const navigation = [
  // {
  //   title: "Banner",
  //   href: "/banner",
  //   icon: "bi bi-speedometer2",
  // },
  {
    title: "Home",
    href: "/starter",
    icon: "bi bi-speedometer2",
  },
  
  // {
  //   title: "Alert",
  //   href: "/alerts",
  //   icon: "bi bi-bell",
  // },
  // {
  //   title: "Badges",
  //   href: "/badges",
  //   icon: "bi bi-patch-check",
  // },
  // {
  //   title: "Buttons",
  //   href: "/buttons",
  //   icon: "bi bi-hdd-stack",
  // },
  {
    title: "Senior Care",
    href: "/cards",
    icon: "bi bi-card-text",
  },
  // {
  //   title: "Grid",
  //   href: "/grid",
  //   icon: "bi bi-columns",
  // },
  {
    title: "Board",
    href: "/table",
    icon: "bi bi-layout-split",
  },
  // {
  //   title: "Forms",
  //   href: "/forms",
  //   icon: "bi bi-textarea-resize",
  // },
  {
    title: "VideoSave",
    href: "/videoSave",
    icon: "bi bi-textarea-resize",
  },
  // {
  //   title: "Breadcrumbs",
  //   href: "/breadcrumbs",
  //   icon: "bi bi-link",
  // },
  // {
  //   title: "About",
  //   href: "/about",
  //   icon: "bi bi-people",
  // },
  // {
  //   title: "Alram",
  //   href: "/alram",
  //   icon: "bi bi-textarea-resize",
  // },
  // {
  //   title: "Int",
  //   href: "/int",
  //   icon: "bi bi-textarea-resize",
  // },
  // {
  //   title: "A",
  //   href: "/a",
  //   icon: "bi bi-card-text",
  // },
];
const Sidebar = () => {

  const [testData, setTestData] = useState(false);

  const test = () =>{
    testData === false ? setTestData(true): setTestData(false)
  }

  const showMobilemenu = () => {
    document.getElementById("sidebarArea").classList.toggle("showSidebar");
  };
  let location = useLocation();

  const mem_id = sessionStorage.getItem('mem_id')
  const mem_address = sessionStorage.getItem('mem_address')
  const mem_name = sessionStorage.getItem('mem_name')
  const mem_phone = sessionStorage.getItem('mem_phone')

    if(mem_id === null ){
  return (
    <div className="p-3">
      <div className="d-flex align-items-center">
        <Logo />
        <Button
          close
          size="sm"
          className="ms-auto d-lg-none"
          onClick={() => showMobilemenu()}
        ></Button>
      </div>
      {/* =========================================================================== */}
     
      <div>  {/* className="pt-4 mt-2" 원래 클래스 네임*/}
        <Nav vertical className="sidebarNav">
          <hr></hr>
      <div>
          <img
              src={user1}
              alt="profile"
              className="img"
              width="50"
            ></img>
      <span>  <Link to="/About">
              <button type="button" 
              className="lo" 
              style={{marginRight:15, 
                borderStyletype:"solid",
                borderRadius: 5}}>
                 
                 GUEST
              </button>
            </Link> </span>
     </div>
     <hr></hr>
          {/* 기존자리 */}
          {navigation.map((navi, index) => (
            <NavItem key={index} className="sidenav-bg">
              <Link
                to={navi.href}
                className={
                  location.pathname === navi.href
                    ? "text-primary nav-link py-3"
                    : "nav-link text-secondary py-3"
                }
              >
                <i className={navi.icon}></i>
                <span className="ms-3 d-inline-block">{navi.title}</span>
              </Link>
            </NavItem>
          ))}
        {/* =========================================================================== */}
                
          <li>
            {/* onClick={()=>test()} <Button className="loginregister__button2">Q&A</Button> */}
          </li>
          
          {testData===true ? <Alerts href="#"> Chat-bot </Alerts> : <div></div>}
          
        {/* =========================================================================== */}
        </Nav>
      </div>
      {/* =========================================================================== */}
    </div>
  )}
  else{
    return (
      <div className="p-3">
        <div className="d-flex align-items-center">
          <Logo />
          <Button
            close
            size="sm"
            className="ms-auto d-lg-none"
            onClick={() => showMobilemenu()}
          ></Button>
        </div>
        {/* =========================================================================== */}
       
        <div>  {/* className="pt-4 mt-2" 원래 클래스 네임*/}
          <Nav vertical className="sidebarNav">
            <hr></hr>
        <div>
            <img
                src={user1}
                alt="profile"
                className="img"
                width="50"
              ></img>
        <span> {mem_name}님 환영합니다.</span>
       </div>
         {/* =========================================================================== */}
       <hr></hr>
            {/* 기존자리 */}
            {navigation.map((navi, index) => (
              <NavItem key={index} className="sidenav-bg">
                <Link
                  to={navi.href}
                  className={
                    location.pathname === navi.href
                      ? "text-primary nav-link py-3"
                      : "nav-link text-secondary py-3"
                  }
                >
                  <i className={navi.icon}></i>
                  <span className="ms-3 d-inline-block">{navi.title}</span>
                </Link>
              </NavItem>
            ))}
          {/* =========================================================================== */}
                  
            <li>
              {/* onClick={()=>test()} <Button className="loginregister__button2">Q&A</Button> */}
            </li>
            
            {testData===true ? <Alerts href="#"> Chat-bot </Alerts> : <div></div>}
            
          {/* =========================================================================== */}
          </Nav>
        </div>
        {/* =========================================================================== */}
      </div>
    )
  }
};

export default Sidebar;