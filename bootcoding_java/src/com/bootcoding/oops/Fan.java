package com.bootcoding.oops;

public class Fan {
    int speed;
    int MAX_LIMIT=5;
    int MIN_LIMIT=0;

    public int speedIncrease(int newSpeed){
        if (newSpeed>MAX_LIMIT){
            speed=MAX_LIMIT;
        }
        else if (newSpeed<MIN_LIMIT) {
            speed=MIN_LIMIT;
        }
        else {
            speed=newSpeed;
        }
        return speed;
    }


}
