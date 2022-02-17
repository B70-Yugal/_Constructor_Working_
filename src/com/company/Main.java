package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

	// write your code here
     Scanner sc = new Scanner(System.in);
     Constructor c1 = new Constructor();
     c1.rollNo = 7;
     c1.data = 234;
     c1.name = "Yugal";
     c1.diaplay();
    }
}

class Constructor{
    int data;
    String name;
    int rollNo;

    void diaplay(){
        System.out.println(data+" "+name+" "+rollNo);
    }
}
