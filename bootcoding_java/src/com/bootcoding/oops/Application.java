package com.bootcoding.oops;

public class Application {
    public static void main(String[] args) {
        Book1 powerElectronics=new Book1();
        powerElectronics.authorName="Danial W Hart";
        powerElectronics.quantity=80.00;
        powerElectronics.pages=120;
        powerElectronics.price=125.00;
        System.out.println(powerElectronics.authorName);
        System.out.println(powerElectronics.quantity);
        System.out.println(powerElectronics.pages);
        System.out.println(powerElectronics.price);

        Book1 Maths=new Book1();
        Maths.authorName="B.S Grewal";
        Maths.quantity=96.00;
        Maths.pages=130;
        Maths.price=150.00;
        System.out.println(Maths.authorName);
        System.out.println(Maths.quantity);
        System.out.println(Maths.pages);
        System.out.println(Maths.price);



        Cycle Avon =new Cycle();
        Avon.companyName="Hero";
        Avon.colour="Red";
        Avon.size="Big";
        Avon.price=4000.00;
        Avon.wheel=2;
        System.out.println(Avon.companyName);
        System.out.println(Avon.colour);
        System.out.println(Avon.size);
        System.out.println(Avon.price);
        System.out.println(Avon.wheel);

        Cycle TurboDrive =new Cycle();
        TurboDrive.companyName="Hercules";
        TurboDrive.colour="Black";
        TurboDrive.size="Big";
        TurboDrive.price=8500.00;
        TurboDrive.wheel=2;
        System.out.println(TurboDrive.companyName);
        System.out.println(TurboDrive.colour);
        System.out.println(TurboDrive.size);
        System.out.println(TurboDrive.price);
        System.out.println(TurboDrive.wheel);

        Cycle FireFox=new Cycle();
        FireFox.companyName="Ranger";
        FireFox.colour="Blue";
        FireFox.size="small";
        FireFox.price=6000.00;
        FireFox.wheel=4;
        System.out.println(FireFox.companyName);
        System.out.println(FireFox.colour);
        System.out.println(FireFox.size);
        System.out.println(FireFox.price);
        System.out.println(FireFox.wheel);


        Cycle avon =new Cycle();
        avon.setCompanyName("hero");
        avon.setColour("green");
        avon.setSize("big");
        avon.setPrice(6500.00);
        avon.setWheel(4);
        System.out.println(avon.getCompanyName());
        System.out.println(avon.getColour());
        System.out.println(avon.getSize());
        System.out.println(avon.getPrice());
        System.out.println(avon.getWheel());


        Cat c1=new Cat();
        c1.run();
        c1.eat();
        System.out.println(c1.legs);
    }

}
