package TexalaAssignment1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class Servicedata
{
    public int loadingServiceData()
    {
        int a=0;
        try {
            Document docs= Jsoup.connect("https://www.google.com/").get();
            Elements ele=docs.getAllElements();
            FileWriter fw=new FileWriter("C:/Users/user/Desktop/TexalaAssignmentData.txt");
            for(Element e:ele)
            {
                String str=e.toString();
                fw.write(str);
            }
            fw.close();
            a++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    return a;
    }
}
