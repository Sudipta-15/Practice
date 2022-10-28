package com.sudipta.practice.git_practice;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		
		System.out.println("data = "+ data);
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app= new App();
        app.addData("some-data");
    }
}
