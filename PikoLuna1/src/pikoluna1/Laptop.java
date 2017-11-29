/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikoluna1;

/**
 *
 * @author MrJimi
 */
public class Laptop {

    int laptopID;
    String name;
    int ram;
    int displaySize;
    String processorType;
    int hardDrive;
    String gpu;
    String displayType;
    String os;
    int cpuCores;
    int displayRes;
    double rating;
    double price;

    public Laptop(int laptopID, String name, int ram, int displaySize, String processorType, int hardDrive, String gpu, String displayType, String os, int cpuCores, int displayRes, double rating, double price){
        this.laptopID = laptopID;
        this.name = name;
        this.ram = ram;
        this.displaySize = displaySize;
        this.processorType = processorType;
        this.hardDrive = hardDrive;
        this.gpu = gpu;
        this.displayType = displayType;
        this.os = os;
        this.cpuCores = cpuCores;
        this.displayRes = displayRes;
        this.rating = rating;
        this.price = price;
    }
    
}
