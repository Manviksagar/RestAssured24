package com.sag.appium.RestAssued1;
import com.sag.appium.RestAssued1.Posts;

import java.util.ArrayList;
import java.util.List;


public class TestStreams {
    static List<Posts> ar = new ArrayList<Posts>();
    static{
        ar.add(new Posts("1","sag","Dev"));
        ar.add(new Posts("2","sagar","Tester"));
        ar.add(new Posts("3","ALlusagar","Tester"));
    }


    public static void main(String[] args) {
        System.out.println(ar);
        ar.stream().skip(1).limit(1).map(w ->new Posts(w.getId(),w.getTitle(),w.getAuthor()+"super")).forEach(a ->System.out.println(a));
    }
}
