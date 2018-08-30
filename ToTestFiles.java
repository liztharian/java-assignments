package com.inapp.firstjava.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import jdk.nashorn.internal.ir.WhileNode;

public class ToTestFiles {
	
	public static void main(String[] args) {
        ToTestFiles test = new ToTestFiles();
        //System.out.println(test.listFileInDirectory("D:\\testfiles\\helloworld"));
        //System.out.println(test.listFileInDirectory("C:\\Users\\LIZ\\Downloads\\Testfiles"));
        
        System.out.println("File content is : "+test.readFileContentAsString("C:\\Users\\LIZ\\Downloads\\Testfiles\\AddressFiles.txt"));
    }
    
   /* public List<String> listFileInDirectory(String directoryPath){
        List<String> fileNames  = new ArrayList<String>();
        if(null != directoryPath && !"".equals(directoryPath.trim())){
            File directory = new File(directoryPath);        
            if(directory.exists()){
                System.out.println("Given path is valid : "+directoryPath);
                if(directory.isDirectory()){
                    System.out.println("Given path points to a directory : "+directoryPath);
                    File[] containingFiles = directory.listFiles();
                    if(null != containingFiles && containingFiles.length > 0) {
                        for (int i = 0; i < containingFiles.length; i++) {
                            fileNames.add(containingFiles[i].getName());
                        }
                    } else {
                        System.out.println("The given directory is Empty.");
                    }
                } else {
                    System.out.println("Given path is no a directory : "+directoryPath);
                }
                
            } else {
                System.out.println("Given path is Invalid : "+directoryPath);
            }
        } else {
            System.out.println("Given path is Empty : "+directoryPath);
        }
        
        
        return fileNames;
    }*/
    
    public String readFileContentAsString(String path){
        String fileContent = "";
        if(path != null && !"".equals(path)){
            File file = new File(path);
            if(!file.isDirectory()){
                //FileInputStream fileInputStream = null;
                try {
                    System.out.println("In try");
                   // fileInputStream = new FileInputStream(file);
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    fileContent = reader.readLine();
                } catch (FileNotFoundException e) {                    
                    e.printStackTrace();
                } catch (IOException e) {                    
                    e.printStackTrace();
                } finally{
                    System.out.println("In finally");
                }
                } else {
                System.out.println("The given path points to a directory");
            }
        } else {
            System.out.println("Filename is invalid");
        }
        return fileContent;
    }

   /* public void mapping(){
    String filepath="";
        HashMap<String, String> map= new HashMap<String,String>();
        
        
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        While ((line=reader.readLine())!=null);
        {
            String[] parts=line.split(":",2);
            if (parts.length>=2)
            {
                String key = parts[0];
                String value=parts[1];
                map.put(key, value);
            }
            else{
                System.out.println("ignore"+line);
            }
            
        }
        for (String key:map.keySet()){
            System.out.println(key+"i"+map.get(key));
        }
        reader.close();
    }*/
    
public void toGetDetails(){
	System.out.println("Enter path : ");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
        System.out.println("Input path is : "+reader.readLine());
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
	
}
}
