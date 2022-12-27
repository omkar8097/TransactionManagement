package com.example.TransactionManagement.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.TransactionManagement.dao.JdbcDao;

@org.springframework.stereotype.Service
public class Service implements IService {

    @Autowired
    JdbcDao jdbcDao;

    @Override
    public List<String> getData() {
        
        jdbcDao.get();
        
        
        return jdbcDao.gets();
        
        
        
    }
    
    @Transactional(rollbackFor = Exception.class)
    public List<String> insertData() throws Exception {
        
        int i = jdbcDao.insert("omkar1"+LocalDateTime.now().toString());
        
        if(i !=0) {
        throw new DataAccessException("") {};
        }
        
        jdbcDao.insert1("omkar2"+LocalDateTime.now().toString());
        
        
        return jdbcDao.gets();
        
        
        
    }


	
    
    

}
