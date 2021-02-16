import java.io.*;

import java.net.*;

import java.util.Scanner;

public class Main

{

    

	public static void main(String[] args) throws IOException	{

        File file = new File("/sdcard/图片.txt");

        Writer wr = new FileWriter(file);

        

		int year = 0;//年份最后以后数字

        //Main ma = new Main();

		for (int b = 1;b <= 366;b++)

        {//日期范围

			if (("" + b).length() == 1)

            {

				String twozero = "00" + b;

                

                wr.write("https://madamevoyeur.com/images/202" + year + "/" + "2" + year + twozero  +".jpg\r\n");

                wr.write("https://madamevoyeur.com/images/202" + year + "-2/" + "2" + year + twozero  +".jpg\r\n");

                wr.write("https://madamevoyeur.com/images/202" + year + "-3/" + "2" + year + twozero  +".jpg\r\n");

            }

            else if (("" + b).length() == 2)

            {

                String onezero = "0" + b;

                wr.write("https://madamevoyeur.com/images/202" + year + "/" + "2" + year + onezero  +".jpg\r\n");

                wr.write("https://madamevoyeur.com/images/202" + year + "-2/" + "2" + year + onezero  +".jpg\r\n");

                wr.write("https://madamevoyeur.com/images/202" + year + "-3/" + "2" + year + onezero  +".jpg\r\n");

            }

            else if (("" + b).length() == 3)

            {

                String onezero = "" + b;

                wr.write("https://madamevoyeur.com/images/202" + year + "/" + "2" + year + onezero  +".jpg\r\n");

                wr.write("https://madamevoyeur.com/images/202" + year + "-2/" + "2" + year + onezero  +".jpg\r\n");

                wr.write("https://madamevoyeur.com/images/202" + year + "-3/" + "2" + year + onezero  +".jpg\r\n");

                

            }

		}

        System.out.println("[*]完成！");

        wr.close();

    }

}
