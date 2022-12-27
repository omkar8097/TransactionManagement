package com.example.TransactionManagement.service;

import java.util.List;

@org.springframework.stereotype.Service
public interface IService {

    public List<String> getData();
    
    public List<String> insertData() throws Exception;
}
