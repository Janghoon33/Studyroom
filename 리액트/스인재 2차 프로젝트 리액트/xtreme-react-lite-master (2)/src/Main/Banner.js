import Carousel from 'react-bootstrap/Carousel';
import 'css/lest.css';

function Banner() {
  return (
    <Carousel>
      <Carousel.Item className='banner-3'>
        <img
          className="d-block"
          src="img/car.png"
          alt="First slide"
        />
      </Carousel.Item>
      <Carousel.Item className='banner-3'>
        <img
          className="d-block"
          src="img/record.png"
          alt="Second slide"
        />
      </Carousel.Item>
      <Carousel.Item className='banner-3'>
        <img
          className="d-block"
          src="img/로고.png"
          alt="Third slide"
        />
      </Carousel.Item>
    </Carousel>
  );
}

export default Banner;