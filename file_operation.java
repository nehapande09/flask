package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class file_operation {
    public static void main(String[] args) {
        File myfile = new File("Java");
// Code To create a file
//        try {
//            myfile.createNewFile();
//            System.out.println("The file is created");
//
//        } catch (IOException e) {
//            System.out.println("Error Occured in creating file");
//
//            e.printStackTrace();
//        }
// Code to write data in the file
//try {
//    FileWriter fileWriter=new FileWriter("Java");
//    fileWriter.write("Hii ,hello welcome to java file \n Here we see about java.");
//    fileWriter.close();
//
//}
//catch(IOException e){
//    System.out.println("Error occured in writing data in file");
//    e.printStackTrace();
//
//        }


        // code to read data from file
//        try {
//            Scanner sc = new Scanner(myfile);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//
//
//            }
//        }
//            catch(FileNotFoundException e)
//            {
//                System.out.println("Error occured in reading file");
//
//            }
        // code to delete file
        if(myfile.delete()){
            System.out.println("File deleted");
        }
        else{
            System.out.println("Some prblm occured while deleting file");
        }
        }
    }

