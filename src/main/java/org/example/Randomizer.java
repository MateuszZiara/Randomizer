package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Randomizer {

    public int random_int(int min_range, int max_range) {

        return new Random().nextInt(max_range + 1 - min_range) + min_range;
    }

    public String random_string(int length) {
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();

    }

    public void saveToFile(String fileName, Object... args) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file, true);
            PrintWriter printer = new PrintWriter(writer);
            String line = "";
            for (Object arg : args) {
                line += arg.toString() + ",";
            }
            line = line.substring(0, line.length() - 1);
            printer.println(line);
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}