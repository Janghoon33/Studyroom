package com.jh.firstproject.repository;

import com.jh.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> { // -> < 관리대상, 대표값 >

}
