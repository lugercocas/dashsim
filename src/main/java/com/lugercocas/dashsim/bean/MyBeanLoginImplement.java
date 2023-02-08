package com.lugercocas.dashsim.bean;

public class MyBeanLoginImplement implements MyBeanLogin{

    private String nombre;
    private String apellido;

    

    public MyBeanLoginImplement(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }



    @Override
    public String functionLogin() {
        // TODO Auto-generated method stub
        return nombre+" "+apellido;
    }
    
}
