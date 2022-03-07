package org.example.service.impl;

import org.example.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl(){
        System.out.println("Service construct without para");
    }
    @Override
    public void doSome(){
        System.out.println("Run doSome() in SomeServiceImpl");
    }
}
