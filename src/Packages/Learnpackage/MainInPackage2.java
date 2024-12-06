package Packages.Learnpackage;

import Packages.packages.Teacher;

public class MainInPackage2 extends Teacher {
    public static void main(String[] args) {
        Teacher ob=new Teacher();
        ob.teachingClass=13;
        System.out.println(ob.teachingClass);
        MainInPackage2 mp=new MainInPackage2();
        mp.salary=10000;
    }
}
