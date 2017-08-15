package com.company;

class MarbleBag {
       int red;
       int green;
       int blue;


//constructors for MarbleBag
    public MarbleBag (Integer red, Integer green, Integer blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    //Method
    public Integer getTotalNumberOfMarbles(){
        return this.red + this.green + this.blue;
    }
      class RunnerMarbleBag{

        //goes in the Runner from the assignment
        public void main(String[] args) {
            MarbleBag marbleBag = new MarbleBag(3, 1, 2);

            ///STUCK Right here. Message: " Non-static mathod can't be
            // referenced from static content"

            marbleBag.printInfo(){
                System.out.println(MarbleBag.getTotalNumberOfMarbles());
            } ///                               ^ underlined in red with the above message


            //Not even worried about this. for now...
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
    }

