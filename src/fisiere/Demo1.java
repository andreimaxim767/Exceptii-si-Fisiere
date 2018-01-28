/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisiere;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Andrei
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File f = new File("/tmp/f1");
//        f.createNewFile();
//        f.renameTo(new File("/tmp/f2"));
//        System.out.println(f.length());
//        System.out.println(f.isDirectory());
//        
//        File dir = new File("/DATE/homedir/Desktop");
//        String[] f1 = dir.list();
//        for(String x:f1){
//            System.out.println(x);
//        }
//        
//        File[] f2 = dir.listFiles();
//        for(File x:f2){
//            System.out.println(x.getAbsolutePath());
//        }
//        System.out.println("*******************");
//        FileFilter filtrujpg = new FileFilter(){
//            @Override
//            public boolean accept(File f) {
//                return f.getName().toLowerCase().endsWith(".jpg");
//            }
//        };
//        File[] poze = dir.listFiles(filtrujpg);
//        for(File x:poze){
//            System.out.println(x.getAbsolutePath());
//        }
//        System.out.println("++++++++++++++++++++++++++++");
//        Path p = Paths.get("/DATE/homedir/Desktop/desters.txt");
//        Files.createFile(p);
        
        Catzel c = new Catzel("Azor", 100);
        File fcatzel;
        fcatzel = new File("C:\\Users\\Andrei\\Desktop\\save.txt");
        FileOutputStream fos = new FileOutputStream(fcatzel);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream(fcatzel);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Catzel c1 = (Catzel)ois.readObject();
        ois.close();
        fis.close();
        
        System.out.println(c1.getNume());
    }
}

class Catzel implements Serializable{
    private String nume;
    private int varsta;

    public Catzel(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }
    
    
}