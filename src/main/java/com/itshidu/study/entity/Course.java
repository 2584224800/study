package com.itshidu.study.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "study_cou")//课程表
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String name;//课程
    private  String teacher;//老师名称
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private  Date  createtime;//创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finishtime;//结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date begintime;//开始时间
    private Double price;//价钱
    private String avatar;//图片路径
    private String  intro;//简介
    private String apply;//适用人群
    private  double  discount ;//折扣价格
    private  Date   createdistime;//开始折扣时间
    private  Date   outdistime;//结束折扣时间
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
    @OneToMany(mappedBy="course")
    private List<Chapter> chapter;




}
