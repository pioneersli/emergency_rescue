package com.emergency.rescue.controller;

import com.emergency.rescue.vo.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author lihexiao
 * @create 2018-03-28 15:43:46
 **/
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("initData")
    @ResponseBody
    public Map<String,Object> initData(){

        Map<String,Object> map=new HashMap<String,Object>();
        Random random=new Random();
        List<Demo> list=new ArrayList<Demo>();
        Random add=new Random();
        int base=80;
        Demo demo=new Demo();
        demo.setName("0.04");
        demo.setValue("80");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
        list.add(demo);
        demo.setName("0.04");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
        demo.setValue("80");
        list.add(demo);
        demo.setName("0.04");
        demo.setValue("80");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
        list.add(demo);
        demo.setName("0.04");
        demo.setValue("80");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
        list.add(demo);
        demo.setName("0.04");
        demo.setValue("80");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
        list.add(demo);
        demo.setName("0.04");
        demo.setValue("80");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
        list.add(demo);


        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);

        demo.setName("0.04");
        demo.setValue("80");
        list.add(demo);
            map.put("list",list);
            return map;



    }
    @RequestMapping("/getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map=new HashMap<String,Object>();
        Random random=new Random();
        List<Demo> list=new ArrayList<Demo>();
        Random add=new Random();
        int base=80;
        Demo demo=new Demo();
        demo.setName("0.04");
        if(random.nextInt(2)==1){
            demo.setValue(base+add.nextInt(4)+"");
        }else{
            demo.setValue(base-add.nextInt(4)+"");
        }
        list.add(demo);
//        demo.setName("0.04");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
//        list.add(demo);
//        demo.setName("0.04");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
//        list.add(demo);
//        demo.setName("0.04");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
//        list.add(demo);
//        demo.setName("0.04");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
//        list.add(demo);
//        demo.setName("0.04");
//        if(random.nextInt(2)==1){
//            demo.setValue(base+add.nextInt(4)+"");
//        }else{
//            demo.setValue(base-add.nextInt(4)+"");
//        }
//        list.add(demo);
        map.put("list",list);
        return map;


    }
}
