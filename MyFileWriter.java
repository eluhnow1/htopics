package htopics;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String hiddenFile = ".winkHomeworkWink.txt";
        String hiddenFolder = ".topsecretfolder";
        String regularFile = "MrTheissSecrets.txt";
        String regularFileData = "Full Name: Andrew Steven Theiss\nPhone Number (Work?): 818-487-6566\nEmails: andrewtheiss@gmail.com, atheiss@hw.com\nAge: 35\nBirthdate: February 7, 1989\nCollege: UC Davis BS in Computer Science\nCity: Hermosa Beach, California\nWork Addresses: 12181 Bluff Creek Dr, Playa Vista, California, 90094, United States | 3700 Coldwater Canyon Ave, Studio City, CA 91604\nCovid Vaccinations: March 9th, 2021 and then April 13th, 2021 (Moderna both times)\nCar: 2017 Subaru Forester\nVehicle Identification Number: JF2SJALC2HH461880\nLicense Plate: 7VIX662\nEngine: 2.5 Liter Naturally Aspirated Engine\nPIN: 1174";
        String hiddenFileData = "Super secret top secret password: ~f\\-=.<>˝Ô∆ßµ‰f4ggkos9";
        
        // 5. Using Files (java.nio.file)
        try {
            Files.write(Paths.get(hiddenFile), hiddenFileData.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.createDirectory(Paths.get(hiddenFolder));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get(hiddenFolder, regularFile), regularFileData.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printFileSize(String fileName) {
        try {
            System.out.println(Files.size(Paths.get(fileName)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
    }
    private static void printTotalFileSize(String... fileNames) {
        System.out.println("Total size of all files: ...TBD... bytes");
    }
}