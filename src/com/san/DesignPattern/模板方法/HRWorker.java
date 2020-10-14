package com.san.DesignPattern.模板方法;

public class HRWorker extends Worker {
    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "看简历-打电话-接电话");
    }
}
