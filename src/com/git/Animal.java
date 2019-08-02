package com.git;

public interface Animal
{
    void showData();
}

class Cat implements Animal
{

    @Override
    public void showData()
    {
        System.out.println("Cat here");

    }

}
