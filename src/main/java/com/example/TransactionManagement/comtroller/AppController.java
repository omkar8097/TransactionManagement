package com.example.TransactionManagement.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TransactionManagement.service.IService;

@RestController
public class AppController {

	@Autowired
	IService service;
	
	@GetMapping("get")
    public List<String> get() {
        System.out.println("get api called");
        try {
			service.insertData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return service.getData();
    }
    
}
