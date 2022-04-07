public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 17;
        System.out.println(myFavoriteNumber);

        String myString = "I am cool";
        System.out.println(myString);

        myString = "No I am not"; //Overwrites the content inside the string
        System.out.println(myString);

        //myString = 3.14159; //It doesnt compile

        //long myNumber; // Non-compile: Nothing prints since the variable wasnt invoked
        //long myNumber = 3.14;
        long myNumber = 123;
        System.out.println(myNumber);
        //myNumber = 3.14; // Cant change the var to a float
        //float newNumber = myNumber;
        //System.out.println(newNumber);    //Wont print

        //int x = 5;
        //System.out.println(x++); //Calls x then in the next call it adds the +1 then prints x
        //System.out.println(x);

        int x = 5;
        System.out.println(++x); //Adds +1 to x then prints and then just prints val of x again
        System.out.println(x);

        //class is a global var that cannot be used

        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o; // string cant be an integer - warning in compiler

        //int three = (int) "three"; // string cant be an integer - wont compile

        int xme = 4;
        xme += 5;
        System.out.println(xme);

        int xne = 3;
        int yne = 4;
        yne *= xne;
        System.out.println(yne);

        int xbe = 10;
        int ybe = 2;
        xbe /= ybe;
        ybe -= xbe;
        System.out.println(ybe);




    }
}
