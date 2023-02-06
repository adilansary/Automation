package com.config;

import org.testng.annotations.Test;

import static com.config.BrowserConfig.chromelauncher;

public class test {

    @Test
    void test1(){
        System.out.println( " i am in test1 ");
        chromelauncher();
    }
}
