package com.cyh.session.service.impl;

import com.cyh.session.dao.ResumeDao;
import com.cyh.session.pojo.Resume;
import com.cyh.session.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public Resume save(Resume resume) {
        return resumeDao.save(resume);
    }

    @Override
    public void delete(Long id) {
        resumeDao.deleteById(id);
    }

    @Override
    public List<Resume> queryAccountList() {
        return resumeDao.findAll();
    }
}
