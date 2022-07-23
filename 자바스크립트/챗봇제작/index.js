const message = [
    {
        request: "안녕하세요",
        response:"반갑다 멍🐶"
    },
    {
        request:"날씨가 좋네요",
        response:"야 밖에 비온다 🐶🐶"
    },
    {
        request:"콩아 나와라!!", 
        response:"멍멍멍🐶🐶🐶" 
    },
    
    {
        request:"배고프다",
        response:"국밥에 쐬주 ㄱ?"
    },
    {
        request:"코딩공부 어디서 하지?", 
        response:"코딩공부는 역시 병갑 블로그!!!" 
    },
    {
        request:"재롱부려봐",
        response:"🐶🐶🐶🐶🐶🐶" 
    }
];
    
    const block = document.querySelector(".block-box");
    // const blockBtn = block.querySelector("input");
    
    const html = document.querySelector("html");
    const body = html.querySelector("body");
    
    const form = document.querySelector(".main__form");
    // const inputText = form.querySelector(".input-btn1");
    const inputBtn = form.querySelector(".input-btn1")

    const contentBox = document.querySelector(".main__content-box");
    const ul = contentBox.querySelector("ul");
    const text = ul.querySelector("li");
    
    const imgWrapper = document.querySelector(".img-baloon__wrapper");
    const img = imgWrapper.querySelector("img");
    
    
    function handlerSumbit(target){
        
        
            // text.innerText = '';
            const li = document.createElement("li");
            let inputValue = target.value;
            console.log("데이터",inputValue)
            ul.appendChild(li);
            if(inputValue === message[0].request){
                console.log("실행1")
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[0].response;
            } else if(inputValue === message[1].request) {
                console.log("실행2")
                console.log(2)
                ul.querySelector("li").innerText = message[1].response;
                
            } else if(inputValue === message[2].request){
                console.log("실행3")
                //이미지 보여주기
                imgWrapper.style.opacity = 1;
                ul.querySelector("li").innerText = message[2].response;
            } else if(inputValue ===  message[3].request){
                console.log("실행4")
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[3].response;
            } else if(inputValue ===  message[4].request){
                console.log("실행5")
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[4].response;
                let typerwriter2 = new Typerwriter(ul.querySelector("li"))
                typerwriter2
                .typeString()
                .pauseFor(1300)
                .start();
            } else if(inputValue ===  message[5].request){
                console.log("실행6")
                imgWrapper.style.opacity = 0;
                // ul.querySelector("li").innerText = message[5].response;
                let typewriter1 = new Typewriter(ul.querySelector("li"));
                typewriter1
                .typeString("귀찮음")
                .pauseFor(1300)
                .start();
            } else {
                console.log("실행7")
                report.style.display = "none";
                imgWrapper.style.opacity = 0;
                let typewriter = new Typewriter(ul.querySelector("li"),{
                    loop:false,
                });
                typewriter
                .typeString("선택지에 없는 질문입니다!")
                .pauseFor(1300)
                .deleteAll()
                .typeString("다시 질문해주세요!")
                .pauseFor(2500)
                .start();
            }
            // inputBtn.value = '';
        }
    
    
    
    


    
    let targetFirst = document.querySelectorAll('.input-btn1');
    targetFirst.forEach((target) => target.addEventListener("click", function(){ 
        //handlerSumbit
        console.log(target)
        handlerSumbit(target)
    }));


