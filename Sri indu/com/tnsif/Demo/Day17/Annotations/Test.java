package com.tnsif.Demo.Day17.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Create annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
    String value();
}

// Use annotation
class Demo {

    @Test("My first annotation")
    public void show() {
        System.out.println("Hello");
    }
}


