//package com.lambda.practice;
//
//import java.lang.constant.Constable;
//
//public class ImplementShow implements ShowInterface{
//	ShowInterface showInter=()->{
//		System.out.println("Hellow");
//	}
//
//	
//	
//}
package com.lambda.practice;

public class ImplementShow {

    ShowInterface showInter = () -> {
        System.out.println("Hello");
    };

    public void display() {
        showInter.show();
    }

}