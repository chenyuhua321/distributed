package com.cyh.session.controller;

import com.cyh.session.pojo.Resume;
import com.cyh.session.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/resume")
public class ResumeController {

    /**
     * Spring容器和SpringMVC容器是有层次的（父子容器）
     * Spring容器：service对象+dao对象
     * SpringMVC容器：controller对象，，，，可以引用到Spring容器中的对象
     */


    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Resume> queryAll() throws Exception {
        return resumeService.queryAccountList();
    }

    @RequestMapping("/add")
    @ResponseBody
    public Resume add(@RequestBody Resume resume) {
        return resumeService.save(resume);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Resume update(@RequestBody Resume resume) {
        return resumeService.save(resume);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void delete(@RequestParam("id") Long id) {
        resumeService.delete(id);
        return;
    }

}
