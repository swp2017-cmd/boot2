package com.icss.boot2.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/4/19 15:55
 * @autho SWP
 * @Version 1.0
 */
@Data
public class MyInfo implements Serializable {
private Integer mid;
private  String mname;
private  String mphone;
private  String ming;

}
