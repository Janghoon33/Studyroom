package com.jh.firstproject.controller;

import com.jh.firstproject.dto.ArticleForm;
import com.jh.firstproject.entity.Article;
import com.jh.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j  // 로깅을 위한 어노테이션
public class ArticleController {

    @Autowired // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결 -> new ArticleRepository(); 같이 객체 생성할 필요 없음
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){

        log.info(form.toString());
        // System.out.println(form.toString()); -> 로깅 기능으로 대체 성능적으로 우수할뿐아니라 어디에서 로깅한건지 확인 가능

        // 1. Dto를 Entity 로 변환
        Article article = form.toEntity();
        log.info(article.toString());
//        System.out.println(article.toString());

        // 2. Repository에게 Entity를 DB안에 저장하게함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
//        System.out.println(saved.toString());

        return "";
    }

}
