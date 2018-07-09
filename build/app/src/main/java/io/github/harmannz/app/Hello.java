package io.github.harmannz.app;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class Hello {

    private static final String world = "Hello World!";

    public String getWorld() {
        return world;
    }
}