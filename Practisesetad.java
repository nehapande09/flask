package com.company;

import java.io.FileWriter;
import java.io.IOException;

class Music{
    @Deprecated
    public void song()
    {
        System.out.println("Playing song");
    }
    public void songs()
    {
        System.out.println("Playing Music.. :)");
    }

}
interface  myinterface{
    void display();
}

public class Practisesetad {

    public static void main(String[] args) {
//        @SuppressWarnings("Deprication")
//        Music obj= new Music();
//
//        obj.song();
//        obj.songs();
//        myinterface a =new myinterface() {
//            @Override
//            public void display() {
//                System.out.println("Display songs list ");
//            }
//        };
//        a.display();
        //File myFile = new File("Tables");
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
