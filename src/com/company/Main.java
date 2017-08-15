package com.company;

class MarbleBag
{
    // START

    int red;
    int green;
    public int numBlueMarbles;


    // constructors for MarbleBag
    public MarbleBag (Integer red, Integer green, Integer blue) {
        this.red = red;
        this.green = green;
        this.numBlueMarbles = blue;
    }

    public Integer getTotalNumberOfMarbles() {
        return red + green + numBlueMarbles;
    }

    public void printInfo() {
        System.out.println(getTotalNumberOfMarbles());
    }

    public void removeAllGreenMarbles() {
        this.green = 0;
    }


    // END
}

class Main
{

    // goes in the Runner from the assignment
    public static void main(String[] args) {
        MarbleBag marbleBag = new MarbleBag(3, 1, 2);

        marbleBag.printInfo();

        marbleBag.numBlueMarbles = 5;

        if (marbleBag.getTotalNumberOfMarbles() == 9) {
            System.out.println("Total is 9, as expected");
        } else {
            System.out.println("PANIC!!!");
            throw new AssertionError(); //Crashes the program
        }

        marbleBag.removeAllGreenMarbles();

        if (marbleBag.getTotalNumberOfMarbles() == 8) {
            System.out.println("Total is 8, as expected");
        } else {
            System.out.println("Panic even more!!!");
            throw new AssertionError();
        }

    }
}

