package com.jh.firstproject.dto;

import com.jh.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 생성자 자동생성(lombok)
@ToString  //  toString 메소드 자동생성(lombok)
public class ArticleForm {

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null,title,content);
    }

}
