package io.github.harmannz.app;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import org.slf4j.Logger;

@ManagedBean
public class Hello {

    @Inject
    private Logger logger;

    private static final String world = "Hello World!";
    private String response;

    public String getWorld() {
        return world;
    }

    public String getResponse(){
        return response;
    }

    public void submit(){
        logger.debug("Hi called!");
        response = "Hi responded";
    }
}