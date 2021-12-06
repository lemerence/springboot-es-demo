package com.demo.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: YST
 * @Date: 2021/12/7 2:14
 * @Version: 1.0
 * @Description:
 */
@Data
@Document(indexName = "person",createIndex = false)
public class Person implements Serializable {

    private String id;
    private String name;
    private String describe1;
    private String describe2;
    private Integer age;
    private List<Tag> tag;
    private String synonymsfield;

    @Data
    static class Tag{
        private Integer id;
        private String name;
    }

}
