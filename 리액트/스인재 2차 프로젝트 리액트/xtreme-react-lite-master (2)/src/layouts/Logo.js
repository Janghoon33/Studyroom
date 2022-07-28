import { ReactComponent as LogoDark } from "../assets/images/logos/로고.svg"; // 이름만 바꾸면 됨 xtremelogo.svg (기존 로고)
import { Link } from "react-router-dom";
import 'css/lest.css'

const Logo = () => {
  return (
    <Link to="/">
      <LogoDark className="logo"/>
    </Link>
  );
};

export default Logo;
