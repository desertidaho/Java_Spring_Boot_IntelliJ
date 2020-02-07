package com.pluralsight.service;

import com.pluralsight.entity.Test;
import com.pluralsight.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public Iterable<Test> listTests() {
        return testRepository.findAll();
    }

}
