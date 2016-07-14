/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;
import java.io.StringWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author root
 */
public class JavaApplication6  
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JSONObject obj = new JSONObject();
        JSONParser parser = new JSONParser();
        String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        try
        {            

              obj.put("name", "foo");
              obj.put("num", new Integer(100));
              obj.put("balance", new Double(1000.21));
              obj.put("is_vip", new Boolean(true));

              System.out.print(obj);

              StringWriter out = new StringWriter();
              obj.writeJSONString(out);

              String jsonText = out.toString();
              System.out.print(jsonText);
        }
        catch (Exception e)
        {
            //
        }
   }
}


