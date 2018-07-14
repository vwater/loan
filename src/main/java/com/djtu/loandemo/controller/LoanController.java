package com.djtu.loandemo.controller;


import com.djtu.loandemo.common.DateTimeUtil;
import com.djtu.loandemo.service.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author vwater
 * @since 2018-06-29
 */
@RestController
@RequestMapping("/loanTest")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/loan")
    public String  LoadTest(@RequestBody Map map) {
            double LoanQuota=Double.parseDouble(map.get("income").toString());
            String str=DateTimeUtil.getDateTimeNow();
            map.put("time" ,str);
            loanService.addLoadUser(map);
            return ""+(LoanQuota*0.5*12);
    }

    @GetMapping("/test")
    public double Load(){
        return 100;
    }

    public static void main(String[] args) {
        Date time = new Date(System.currentTimeMillis());
        String str=DateTimeUtil.getDateTimeNow();
        System.out.println(time.toString());
        System.out.println(str);
       /* Map map=new HashMap();
        map.put("income",15000);
        map.put("phoneNumber","18321122961");
        map.put("time",time);*/
    }

}

