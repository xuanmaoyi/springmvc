package com.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by maoyi.xuan on 2017/4/18.
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return  "url"+request.getRequestURL()+"can access";
    }

    @RequestMapping(value = "/pathVar/{str}",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String pathVar(HttpServletRequest request,@PathVariable String str){
        return  "url"+request.getRequestURL()+"can access str"+str;
    }

    @RequestMapping(value = "/requestpara",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String requestPara(HttpServletRequest request,Long id){
        return  "url"+request.getRequestURL()+"can access id"+id;
    }

    @RequestMapping(value = "/obj",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String pathVar(HttpServletRequest request,DemoObj obj){
        return  "url"+request.getRequestURL()+"can access id"+obj.getId()+"name"+obj.getName();
    }

    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain;charset=UTF-8")
    public @ResponseBody String multipath(HttpServletRequest request){
        return  "url"+request.getRequestURL()+"can access";
    }

}
