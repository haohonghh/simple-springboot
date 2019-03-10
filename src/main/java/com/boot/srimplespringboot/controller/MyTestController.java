package com.boot.srimplespringboot.controller;

import com.boot.srimplespringboot.entity.Demo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class MyTestController {


    @GetMapping("/list")
    @ApiOperation(value="获取demo列表",notes="获取demo列表")
    public List<Demo> getList(){
        List<Demo> demos = new ArrayList<>();
        Demo demo = new Demo();
        demo.setId(1L);
        demo.setName("demo1");
        demo.setPassword("abc1");
        demo.setType(1);
        Demo demo2 = new Demo();
        demo2.setName("demo2");
        demo2.setId(2L);
        demo2.setPassword("abc2");
        demo2.setType(2);
        Demo demo3 = new Demo();
        demo3.setName("demo3");
        demo3.setId(3L);
        demo3.setType(3);
        demo3.setPassword("abc3");
        demos.add(demo);
        demos.add(demo2);
        demos.add(demo3);
        return demos;
    }

    @GetMapping("/{id}")
    @ApiOperation(value="获取demo详情",notes="通过Id获取demo详情")
    @ApiImplicitParam(value="id",paramType = "path",dataType = "Long")
    public Demo getDemoById(@PathVariable Long id){
        Demo demo = new Demo();
        demo.setId(1L);
        demo.setName("demo1");
        demo.setPassword("abc1");
        demo.setType(1);
        Demo demo2 = new Demo();
        demo2.setName("demo2");
        demo2.setId(2L);
        demo2.setPassword("abc2");
        demo2.setType(2);
        Demo demo3 = new Demo();
        demo3.setName("demo3");
        demo3.setId(3L);
        demo3.setType(3);
        demo3.setPassword("abc3");
        if (id == 1L){
            return demo;
        }else if (id == 2L){
            return demo2;
        }else if (id == 3L){
            return demo3;
        }else{
            return null;
        }

    }

    @PostMapping("save")
    @ApiOperation(value="保存demo",notes="保存demo")
    @ApiImplicitParam(name="demo",value="用户demo",required = true,dataType = "Demo")
    public Map saveDemo(@RequestBody Demo demo){
        Map map = new HashMap();
        if (demo!=null){
            map.put("key","0");
        }else{
            map.put("key","1");
        }
        return map;
    }

    @PutMapping("update/{id}")
    @ApiOperation(value="更新demo",notes="根据Id更新demo")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "DemoID", required = true, dataType = "Long",paramType = "path"),
            @ApiImplicitParam(name = "demo", value = "用户实体demo", required = true, dataType = "Demo")
    })
    public Map updateDemo(@PathVariable Long id, @RequestBody Demo demo){
        Map map = new HashMap();
        if (id!=null){
            map.put("key","0");
        }else{
            map.put("key","1");
        }
        return map;
    }



}
