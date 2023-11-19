package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);
    }

    @Override
    String getDescription(){
        String baseDescription = super.getDescription();
        return baseDescription + " Moreover, it has 2 wings and can fly.";
//        return "This animal is mostly blue. " +
//                "It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
