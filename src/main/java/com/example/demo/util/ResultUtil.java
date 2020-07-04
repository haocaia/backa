package com.example.demo.util;

import com.example.demo.pojo.Result;

/**
 * @author zyt
 */
public class ResultUtil {
    public static Result success(Object object){
        Result r = new Result();
        r.setCode(0);
        r.setMsg("success!");
        r.setData(object);
        return r;
    }

    public static Result error(int code, String msg){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }
}
