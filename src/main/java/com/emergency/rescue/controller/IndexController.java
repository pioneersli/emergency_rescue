package com.emergency.rescue.controller;

import com.emergency.rescue.service.ECGService;
import com.emergency.rescue.util.DateUtils;
import com.emergency.rescue.vo.Demo;
import com.emergency.rescue.vo.ECGVo;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ECGService ecgService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/initData")
    @ResponseBody
    public List<ECGVo> initData(){

        //Map<String,Object> map=new HashMap<String,Object>();
        List<ECGVo> list=ecgService.getECGVo();
//        if(list==null || list.size()<1){
//            ECGVo vo=new ECGVo();
//            vo.setTime(DateUtils.getTime(new Date()));
//            vo.setValue("20");
//            list=new ArrayList<ECGVo>();
//            list.add(vo);
//        }
        return list;
       // map.put("list",list);
//        if(list!=null && list.size()>0){
//            map.put("list",list);
//        }else{
//            ECGVo vo=new ECGVo();
//            vo.setTime(DateUtils.getTime(new Date()));
//            vo.setValue("0");
//            list=new ArrayList<ECGVo>();
//            list.add(vo);
//            map.put("list",list);
//        }

       // return map;



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
        demo.setName("0.04");
        if(random.nextInt(2)==1){
            demo.setValue(base+add.nextInt(4)+"");
        }else{
            demo.setValue(base-add.nextInt(4)+"");
        }
        list.add(demo);
        demo.setName("0.04");
        if(random.nextInt(2)==1){
            demo.setValue(base+add.nextInt(4)+"");
        }else{
            demo.setValue(base-add.nextInt(4)+"");
        }
        list.add(demo);
        demo.setName("0.04");
        if(random.nextInt(2)==1){
            demo.setValue(base+add.nextInt(4)+"");
        }else{
            demo.setValue(base-add.nextInt(4)+"");
        }
        list.add(demo);
        demo.setName("0.04");
        if(random.nextInt(2)==1){
            demo.setValue(base+add.nextInt(4)+"");
        }else{
            demo.setValue(base-add.nextInt(4)+"");
        }
        list.add(demo);
        demo.setName("0.04");
        if(random.nextInt(2)==1){
            demo.setValue(base+add.nextInt(4)+"");
        }else{
            demo.setValue(base-add.nextInt(4)+"");
        }
        list.add(demo);
        map.put("list",list);
        return map;


    }
}
