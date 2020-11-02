package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        Counter otherone = new Counter();
        myCounter.undo();
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();
myCounter.reset();
myCounter.click();
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.undo();
        myCounter.click();
myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.undo();
        myCounter.display();


        otherone.click();
        otherone.undo();
        otherone.undo();
        otherone.click();
        otherone.display();
        //TODO - add call to reset() that you implement in Counter class


        //TODO - add call to undo() that you implement in Counter class

        //TODO
        // Add a JUnit test method to test undo()

        //TODO
        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect?

    }

}
