/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q2;

/**
 *
 * @author adina
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
public class L7Q2 {
    public static void main(String[] args) {
        
        try {
            URL u = new URL("http://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            PrintWriter out= new PrintWriter(new FileOutputStream("index.htm"));
            String line="";
            while(in.hasNextLine()){
                line = in.nextLine();
                String[]website = line.split(" ");
                for(int i = 0 ; i < website.length ; i++){
                    out.println(in.nextLine());
                }
            }
                out.close();
            }
            catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
            }
    }
}
