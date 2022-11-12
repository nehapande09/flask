package com.company;
class friend{
    public void happiness()
    {
        System.out.println("Giving happiness :)");
    }
    public void memories()
    {
        System.out.println("Giving memories ;)");
    }
    public void funTime()
    {
        System.out.println("All the funtime together");
    }
}
class bestFriend extends friend {
    public void trust()
    {
        System.out.println("Trust");
    }
    public void love()
    {
        System.out.println("love");
    }
    public void addiction()
    {
        System.out.println("addiction");
    }
    public void secrets()
    {
        System.out.println("secrets");
    }

}

public class inheritance {
    public static void main(String args[])
    {
        friend f1=new friend();
        f1.happiness();
        bestFriend f2=new bestFriend();
        f2.happiness();;
        f2.secrets();
    }
}
