package com.victor.bdlocal.model;

public class Departamento {
    private int code_dep;
    private String name;

    public Departamento() {
    }

    public Departamento(int code_dep, String name) {
        this.code_dep = code_dep;
        this.name = name;
    }

    public int getCode_dep() {
        return code_dep;
    }

    public void setCode_dep(int code_dep) {
        this.code_dep = code_dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
