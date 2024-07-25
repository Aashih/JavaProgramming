package com.Ashish.All.OOPS.Interface;

public class Car implements Engine,Break,Media{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerated");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }


}
