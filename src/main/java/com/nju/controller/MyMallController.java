package com.nju.controller;

import com.nju.entity.MymallRole;
import com.nju.excption.NotFoundException;
import com.nju.service.MymallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author maw-b
 * @date 2021/6/8 10:39
 */
@RestController
public class MyMallController {

    @Autowired
    private MymallService mymallService;

    @GetMapping("mall")
    public List<MymallRole> getRoles(){
        System.out.println("hello");
        throw new NotFoundException("接口错误");
//        StringBuilder sb = new StringBuilder();
//        StringBuffer stringBuffer = new StringBuffer();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        List<MymallRole> roleList = mymallService.getRoles();
//        return roleList;

    }
}
