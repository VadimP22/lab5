package me.lab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


}

class Box<T> {
    T value;
    void put(T val) { this.value = val; }
    T get() { return this.value; }
}
