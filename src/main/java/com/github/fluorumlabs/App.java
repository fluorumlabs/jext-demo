package com.github.fluorumlabs;

/**
 * Hello world!
 *
 */
public class App implements Runnable
{
    public static void main( String[] args )
    {
        new App().run();
    }

    @Override public void run() {
        System.out.println( "Hello World!" );
    }

}
