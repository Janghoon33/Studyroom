import ProgressBar from 'react-bootstrap/ProgressBar';
import 'css/lest.css';

function WithLabelExample() {
  const now = 80;
  return <ProgressBar className='bar' now={now} label={`${now}%`} />;
}

export default WithLabelExample;