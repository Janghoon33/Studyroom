import { Card, CardBody, CardTitle, CardSubtitle, Table } from "reactstrap";
import user1 from "assets/images/users/user1.jpg";
import user2 from "assets/images/users/user2.jpg";
import user3 from "assets/images/users/user3.jpg";

const tableData = [
  {
    avatar: user1,
    name: "나태린",
    email: "tyui0330op@gmail.com",
    project: "프론트",
  },
  {
    avatar: user2,
    name: "이건이",
    email: "hgover@gmail.com",
    project: "백엔드",
  },
  {
    avatar: user3,
    name: "심우현",
    email: "hgover@gmail.com",
    project: "인공지능 총괄",
  },
];

const Int = () => {
  return (
    <div className="mm-3">
      <Card>
        <CardBody>
          <CardTitle tag="h5">ㅤ</CardTitle>
          
          <Table className="no-wrap mt-3 align-middle" responsive borderless>
            <thead>
              <tr>
                <th>Team Lead</th>
                <th>Project</th>
              </tr>
            </thead>
            <tbody>
              {tableData.map((tdata, index) => (
                <tr key={index} className="border-top">
                  <td>
                    <div className="d-flex align-items-center p-2">
                      <img
                        src={tdata.avatar}
                        className="rounded-circle"
                        alt="avatar"
                        width="45"
                        height="45"
                      />
                      <div className="ms-3">
                        <h6 className="mb-0">{tdata.name}</h6>
                        <span className="text-muted">{tdata.email}</span>
                      </div>
                    </div>
                  </td>
                  <td>{tdata.project}</td>
                </tr>
              ))}
            </tbody>
          </Table>
        </CardBody>
      </Card>
    </div>
  );
};

export default Int;
