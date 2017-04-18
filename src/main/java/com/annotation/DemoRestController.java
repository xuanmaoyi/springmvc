package com.annotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maoyi.xuan on 2017/4/18.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    public DemoObj getJson(DemoObj obj){
            return new DemoObj(obj.getId(),obj.getName());
    }
    @RequestMapping(value = "/getXml",produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId(),obj.getName());
    }
}
