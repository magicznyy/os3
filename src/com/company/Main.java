package com.company;

import java.io.File;


public class Main {

        public static void main(String[] args) {

            File file = new File("C:\\Users\\HardPc\\Desktop\\processes.txt");

            FileReader fileReader = new FileReader(file);

            ProcessesCreator processesCreator = new ProcessesCreator();
            processesCreator.createProcesses(fileReader.getTextFile());

        }

}
