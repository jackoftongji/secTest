package com.controller;

import com.pojo.Paper;
import com.service.PaperService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //标注控制层
@RequestMapping("/paper")  //注解请求地址映射路径
public class PaperController {

    @Autowired  //让Spring自动扫描自动装配，注入工具方法并匹配
    private PaperService paperService;

    @RequestMapping("/allPaper")
    public String list(Model model) {  //前端输出必须使用${ul.value.属性名}的形式

        //List<Paper>为一个表对象，对集合内对象进行搜索排序；此为声明一个Paper对象的List表；
        //接收查询的信息，即将数据库信息读取到list中
        List<Paper> list = paperService.queryAllPaper();

        //model是controller里面的Map结构，Map里面添加key为逗号前面的，逗号后面的为对象的值；
        //将list对象的值给model，最后将这个model返回给jsp，在jsp界面上就可以得到这个对象的值了.
        model.addAttribute("list", list);

        return "allPaper";  // 返回model跳转路径
    }

    @RequestMapping("toAddPaper")
    //控制器调用此方法回到addPaper界面
    public String toAddPaper() {
        return "addPaper";
    }

    @RequestMapping("/addPaper")
    public String addPaper(Paper paper) {
        paperService.addPaper(paper);
        //客户端路径跳转
        return "redirect:/paper/allPaper";
    }

    @RequestMapping("/del/{paperId}")
    public String deletePaper(@PathVariable("paperId") Long id) {
        paperService.deletePaperById(id);
        return "redirect:/paper/allPaper";
    }

    @RequestMapping("toUpdatePaper")
    public String toUpdatePaper(Model model, Long id) {
        model.addAttribute("paper", paperService.queryById(id));
        return "updatePaper";
    }

    @RequestMapping("/updatePaper")
    public String updatePaper(Model model, Paper paper) {
        paperService.updatePaper(paper);
        paper = paperService.queryById(paper.getPaperId());
        model.addAttribute("paper", paper);
        return "redirect:/paper/allPaper";
    }
}

