//Written by: S.S. Ahmed
//email" ss_ahmed1@hotmail.com
//April 2001
//====================================================================
import java.io.*;
import java.util.StringTokenizer;
//added new line in master on GitHub

class token
{
        public static void main(String args[]) throws IOException
        {
                BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer reader;
                reader = new StringTokenizer (stdin.readLine());
                int count =1;
                int temp;
                while (count <=10)
                {
                        while(reader.countTokens() == 0)
                                reader = new StringTokenizer(stdin.readLine());
                        temp = reader.nextToken();
                        if (temp == '+')
                        {
                         }
                        else
                        {
                        System.out.println ("hi");
                        }
                        //System.out.println(reader.nextToken());
                        count = count + 1;
                }
        }
}
