const images = [
    "0.jpeg",
    "1.jpeg",
    "2.jpeg"
]

const chosenImage = images[Math.floor(Math.random() * images.length )];

const bgImage = document.createElement("img");  // img 태그 생성

bgImage.src = `img/${chosenImage}`; // img 태그 src 설정

document.body.appendChild(bgImage); // HTML에 img 태그 추가해주기
