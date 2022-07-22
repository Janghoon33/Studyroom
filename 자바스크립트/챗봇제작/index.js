const message = [
    {
        request: "1번",
        response:"배고파 밥줘 멍🐶"
    },
    {
        request:"2번",
        response:"뭐🐶🐶"
    },
    {
        request:"3번", // 이미지 보여주면서 설명
        response:"멍멍멍🐶🐶🐶" 
    },
    
    {
        request:"4번",
        response:"🐶🐶🐶🐶"
    },
    {
        request:"5번", // 링크 보여주기
        response:"🐶🐶🐶🐶🐶" 
    },
    {
        request:"6번",
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
    
    const report = document.querySelector(".pre__report");
    const reportContent = report.querySelectorAll(".report-flex");
    
    function handlerSumbit(target){
        
        
            // text.innerText = '';
            const li = document.createElement("li");
            let inputValue = target.value;
            console.log("데이터",inputValue)
            // inputBtn.value = '';
            ul.appendChild(li);
            // message[0].request
            if(inputValue === message[0].request){
                console.log("실행1")
                report.style.display = "none";
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[0].response;
            } else if(inputValue === message[1].request) {
                console.log("실행2")
                console.log(2)
                report.style.display = "none";
                ul.querySelector("li").innerText = message[1].response;
                // setTimeout(function(){
                //     block.style.display ="flex";
                //     ul.querySelector("li").innerText = "뭐";
                // },2000);
            } else if(inputValue === message[2].request){
                console.log("실행3")
                //이미지 보여주기
                report.style.display = "none";
                imgWrapper.style.opacity = 1;
                ul.querySelector("li").innerText = message[2].response;
            } else if(inputValue ===  message[3].request){
                console.log("실행4")
                report.style.display = "none";
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[3].response;
            } else if(inputValue ===  message[4].request){
                console.log("실행5")
                report.style.display = "none";
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[4].response;
            } else if(inputValue ===  message[5].request){
                console.log("실행6")
                report.style.display = "none";
                imgWrapper.style.opacity = 0;
                ul.querySelector("li").innerText = message[5].response;
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
    
    
    
    
    
    // inputText.addEventListener("submit",handlerSumbit);
     //inputBtn.addEventListener("click",handlerSumbit(target));
    // inputBtn.addEventListener("click",function(e){
    //     e.preventDefault();
    //     block.style.display = "none";
    // })


    
    let targetFirst = document.querySelectorAll('.input-btn1');
    targetFirst.forEach((target) => target.addEventListener("click", function(){ 
        //handlerSumbit
        console.log(target)
        handlerSumbit(target)
    }));


