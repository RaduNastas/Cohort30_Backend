package de.ait;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<User1> users = new ArrayList<>();
        System.out.println("Input the following users:");
        while (true) {
            System.out.println("Name: ");
            String name = sc.nextLine().trim();
            if (name.isEmpty()) break;
            System.out.println("Email: ");
            String email = sc.nextLine();
            users.add(new User1(name, email));
        }
        System.out.println("The users entered are: ");
        for (User1 user : users) {
            System.out.println(user);
        }
        String filename = "users.txt";
        try {BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (User1 user : users) {
                writer.write(user.getName() + " " + user.getEmail());
                writer.newLine();
            }
            System.out.println("File " + filename + " saved.");

        } catch (IOException e) {
            System.err.println("Error when writing to file: " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}