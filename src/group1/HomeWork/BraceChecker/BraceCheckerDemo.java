package group1.HomeWork.BraceChecker;

import group2.chapter5.Switch;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = "Hello from {{{{Java])";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();




    }
}

