package com.guardado;

import com.guardado.com.guardado.builder.Auto;
import com.guardado.com.guardado.builder.Director;

public class Main {

    public static void main(String[] args) {
        Director d = new Director();
        Auto a = d.getSedan("Toyota","Corolla",1994);
        System.out.println(a.toString());
    }
}
