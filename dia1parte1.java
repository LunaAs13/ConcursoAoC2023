package dia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class dia1 {
   
static String mem;
static int[] lista;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st;
        String [] letras= new String[100];
        int pr=0;
        int ul=0;
        int suma=0;
        boolean primero=false;
        
        while (line!=null) {
            st = new StringTokenizer(line);
            mem = st.nextToken();
            primero=true;

            System.out.println(mem);
            for (int i = 0; i < mem.length(); i++) {
                if (isNumeric(String.valueOf(mem.charAt(i)))){
                    if (primero){
                        pr=Integer.parseInt(String.valueOf(mem.charAt(i)));
                        primero=false;
                    }
                    ul=Integer.parseInt(String.valueOf(mem.charAt(i)));
                }
            }
            suma+=pr*10;
            suma+=ul;
            
            line = br.readLine();
            
        }
        System.out.println(suma);
        
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false; //Error no es numerico
        }
        return true; //Es numerico
    }
}
