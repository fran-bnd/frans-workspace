package com.revature;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create();
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(7071);
    }
}
