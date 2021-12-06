package com.demo.dao;

import com.demo.domain.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @Author: YST
 * @Date: 2021/12/7 2:21
 * @Version: 1.0
 * @Description:
 */
@EnableElasticsearchRepositories
public interface PersonEsDao extends ElasticsearchRepository<Person, String> {
}
