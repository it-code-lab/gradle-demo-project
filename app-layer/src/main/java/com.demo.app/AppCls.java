package com.demo.app;

import com.demo.DataModel;
import com.demo.bus.BusinessCls;

public class AppCls {

    public static void main(String[] args) {
        new BusinessCls().displayName(new DataModel("Full Name"));
    }
}