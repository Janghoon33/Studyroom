import { Col, Row } from "reactstrap";
import SalesChart from "../components/dashboard/SalesChart";
import Feeds from "../components/dashboard/Feeds";
import ProjectTables from "../components/dashboard/ProjectTable";
import TopCards from "../components/dashboard/TopCards";
import Blog from "../components/dashboard/Blog";
import bg1 from "../assets/images/bg/bg1.jpg";
import bg2 from "../assets/images/bg/bg2.jpg";
import bg3 from "../assets/images/bg/bg3.jpg";
import bg4 from "../assets/images/bg/bg4.jpg";
import Process from "components/dashboard/Process";
import Int from "Main/Int";

const BlogData = [
  {
    image: bg1,
    title: "낙상 사고 예방법",
    subtitle: "어르신 낙상 주의보!",
    description:
      "낙상 환자는 매년 증가하는 추세이며, 응급실에 방문하는 손상 환자 4명 중 1명은 낙상환자이며....",
    btnbg: "primary",
  },
  {
    image: bg2,
    title: "영유아 낙상 사고",
    subtitle: "영아 안전사고 92% 가정에서 발생",
    description:
      "영아(만 1세 미만) 안전사고 10건 중 9건이 가정에서 일어나.... ",
    btnbg: "primary",
  },
  {
    image: bg3,
    title: "낙상 케어",
    subtitle: "낙상 감지··· 골든타임 방지",
    description:
      "집 안의 낙상 감지 시스템으로 위험도(알림) 감지해 혼자있는 시니어들의 골든타임을....",
    btnbg: "primary",
  },
  {
    image: bg4,
    title: "낙상 피해",
    subtitle: "몸이 불편한 사람들",
    description:
      "한 요양병원에서 낙상으로 머리부터 떨어져 수술이 필요한 A씨가 병원에 변상을 요구했지만....",
    btnbg: "primary",
  },
];

const Starter = () => {
  return (
    <div>
    {/***Top Cards***/}
    <Row>
      <Col sm="6" lg="3">
        <TopCards
          bg="bg-light-success text-success"
          title="Profit"
          subtitle="CCTV를 통해 행동감지" // 소제
          earning=" 감지" // 제목
          icon="bi bi-webcam"
        />
      </Col>
      <Col sm="6" lg="3">
        <TopCards
          bg="bg-light-danger text-danger"
          title="Refunds"
          subtitle="카카오톡으로 알림 서비스"
          earning=" 알림"
          icon="bi bi-bell"
        />
      </Col>
      <Col sm="6" lg="3">
        <TopCards
          bg="bg-light-warning text-warning"
          title="New Project"
          subtitle="낙상 사고 영상 실시간송출"
          earning="영상"
          icon="bi-camera-video-fill"
        />
      </Col>
      <Col sm="6" lg="3">
        <TopCards
          bg="bg-light-info text-into"
          title="Sales"
          subtitle="인력 부족 해결 및 감소"
          earning="인력"
          icon="bi-people"
        />
      </Col>
    </Row>
    {/***Sales & Feed***/}
    <Row>
      <Col sm="6" lg="6" xl="7" xxl="8">
        <SalesChart />
      </Col>
      <Col sm="6" lg="6" xl="5" xxl="4">
        <Feeds />
      </Col>
    <Row>
      <Process />
    </Row>
    </Row>
    {/***Table ***/}
    <Row>
    {BlogData.map((blg, index) => (
        <Col sm="6" lg="6" xl="3" key={index}>
          <Blog
            image={blg.image}
            title={blg.title}
            subtitle={blg.subtitle}
            text={blg.description}
            color={blg.btnbg}
          />
        </Col>
      ))}
    </Row>
    {/***Blog Cards***/}
    <Row>
        <ProjectTables />
        <Int />
    </Row>
  </div>
);
};
export default Starter;
