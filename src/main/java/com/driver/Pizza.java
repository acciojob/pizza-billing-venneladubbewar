package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean isExtraCheese;
    private boolean isExtrasToppings;
    private boolean isTakeway;
    private boolean isBillGenarate;
    private  int toppings;
    private  int totalAmount;

    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg) {
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
    }

    public int getPrice(){
//        totalAmount+=this.price;
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese)
        {
            totalAmount+=80;
            isExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtrasToppings)
        {
            totalAmount+=this.toppings;
            isExtrasToppings=true;
        }
    }

    public void addTakeaway(){

        // your code goes here
        if(!isTakeway)
        {
            isTakeway=true;
            totalAmount+=20;
        }
    }



        public String getBill(){
        // your code goes here
            totalAmount+=this.price;
            if(!isBillGenarate)
            {
                isBillGenarate=true;
                bill="Base Price Of The Pizza: "+this.price+ "\n";

                if(isExtraCheese ) this.bill+="Extra Cheese Added: 80"+"\n";
                if(isExtrasToppings) this.bill+="Extra Toppings Added: "+this.toppings+"\n";
                if(isTakeway) this.bill+="Paperbag Added: 20"+"\n";
                this.bill+="Total Price: "+totalAmount;
                return this.bill;
            }
        return "";
    }




}



