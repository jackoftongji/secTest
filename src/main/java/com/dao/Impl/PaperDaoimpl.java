package com.dao.Impl;

import com.dao.PaperDao;
import com.pojo.Paper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaperDaoimpl implements PaperDao {
    @Autowired
    private PaperDao a;

    public int addPaper(Paper paper) {
        return a.addPaper(paper);
    }

    public int deletePaperById(long id) {
        return a.deletePaperById(id);
    }

    public int updatePaper(Paper paper) {
        return a.updatePaper(paper);
    }

    public Paper queryById(long id) {
        return a.queryById(id);
    }

    public List<Paper> queryAllPaper() {
        return a.queryAllPaper();
    }
}

