package com.sag.appium.RestAssued1;
interface Sag{
    public int add(int a, int b);

}
public class MethodReference {

    public int cal(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        Sag s= new MethodReference()::cal;
        System.out.println(s.add(5,6));
    }
}
