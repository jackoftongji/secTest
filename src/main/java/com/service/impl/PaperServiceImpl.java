package com.service.impl;

import com.pojo.Paper;
import com.dao.PaperDao;
import com.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService{
    //PaperServiceImpl这个类继承PaperService接口，目的是为了实现PaperService接口；
    //同时也用来实现接口中定义的抽象方法；
    @Autowired   //Spring扫描识别并注入类，在ioc容器中找到匹配的类并注入
    private PaperDao paperDao;

    @Override  //伪代码表示重写下述方法，利用编译器验证父类中方法是否有误
    public int addPaper(Paper paper) { return paperDao.addPaper(paper); }

    @Override
    public int deletePaperById(long id) { return paperDao.deletePaperById(id); }

    @Override
    public int updatePaper(Paper paper) { return paperDao.updatePaper(paper);}

    @Override
    public Paper queryById(long id) {
        return paperDao.queryById(id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return paperDao.queryAllPaper();
    }
}
