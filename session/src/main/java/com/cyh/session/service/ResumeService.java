package com.cyh.session.service;

import com.cyh.session.pojo.Resume;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public interface ResumeService {
    List<Resume> queryAccountList();

    Resume save(Resume resume);

    void delete(Long id);
}
