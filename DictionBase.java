

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
//import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;



 public abstract class DictionBase
{
    
       static String [][] dictionArr;


     private int x;

  
    public DictionBase() throws Exception
    {
         
          JFileChooser dictfile = new JFileChooser();
          File workingDirectory = new File(System.getProperty("user.dir"));
          dictfile.setCurrentDirectory(workingDirectory);
          FileNameExtensionFilter filter = new FileNameExtensionFilter("Dictionary Files","dct","dct");
          dictfile.setFileFilter(filter);
           int returnVal = dictfile.showOpenDialog(null);
       
         if (returnVal == JFileChooser.APPROVE_OPTION) 
           {    String dictionStr = new Scanner(new File(".\\" + dictfile.getSelectedFile().getName())).useDelimiter("\\Z").next();
                 StringTokenizer dictTOK = new StringTokenizer(dictionStr,"|");
                dictionArr = new String[dictTOK.countTokens()][2];
                String[] cvtArr;
                int dictNdx =0;
                 System.out.println(":::::::::::q"+ dictTOK.countTokens()+":::::::::::::::");
                 while (dictTOK.hasMoreTokens())
                {
                      cvtArr = dictTOK.nextToken().split(",");
                      dictionArr[dictNdx][0] = cvtArr[0].replaceAll("\\s","");
                      dictionArr[dictNdx][1] = cvtArr[1].replaceAll("\\s","");
                       dictNdx++;
                    }
                
             
                
    }

 
   }
   
 /**
 * Returns an Image object that can then be painted on the screen. 
 * The url argument must specify an absolute {@link URL}. The name
 * argument is a specifier that is relative to the url argument. 
 * <p>
 * This method always returns immediately, whether or not the 
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives 
 * that draw the image will incrementally paint on the screen. 
 *
 * @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
 */
   public int getCount(){
       int LenghtArr = dictionArr[0].length+ dictionArr[1].length;
       return LenghtArr;// return count
      
    }
    
    
     public String getVal(int key1, int key2)
   {
       String val = dictionArr[key1][key2].toString();
       String x = "The value for which you selected is "+ val;
       return x;
      //update code to return value
    }
   
       public abstract String  translate(String eng) throws Exception;
       
}