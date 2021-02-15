import java.io.*;
import java.net.*;

public class Main
{
	public static void main(String[] args)
	{
		//for(int j = 0;j<2;j++){
		int year = 0;
			//Main ma = new Main();
		for(int b = 172;b<=356;b++){//日期范围
			if((""+b).length()==1){
				String twozero = "00"+b;
			
			try
			{
				download("https://madamevoyeur.com/images/202"+year+"-3/"+"2"+year+twozero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-3/202"+year, 70);
		    	download("https://madamevoyeur.com/images/202"+year+"-2/"+"2"+year+twozero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-2/202"+year, 70);
			    download("https://madamevoyeur.com/images/202"+year+"/"+"2"+year+twozero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-1/202"+year, 70);
			
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}else if((""+b).length()==2){
			String onezero = "0"+b;
		    try
			{
				download("https://madamevoyeur.com/images/202"+year+"-3/"+"2"+year+onezero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-3/202"+year, 70);
				download("https://madamevoyeur.com/images/202"+year+"-2/"+"2"+year+onezero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-2/202"+year, 70);
			    download("https://madamevoyeur.com/images/202"+year+"/"+"2"+year+onezero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-1/202"+year, 70);
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}else if((""+b).length()==3){
			String onezero = ""+b;
		    try
			{
				download("https://madamevoyeur.com/images/202"+year+"-3/"+"2"+year+onezero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-3/202"+year, 70);
				download("https://madamevoyeur.com/images/202"+year+"-2/"+"2"+year+onezero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-2/202"+year, 70);
			    download("https://madamevoyeur.com/images/202"+year+"/"+"2"+year+onezero+".jpg",""+b, "/storage/emulated/0/本地文件夹/a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/私密/图集-1/202"+year, 70);
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		
		}
		
		
		}
	
	public static void download(String urlString, String filename,String savePath,long restTime) throws Exception { 

		Thread.sleep(restTime);

        // 构造URL 

        URL url = new URL(urlString); 

		System.out.println(urlString);
        // 打开连接 

        URLConnection con = url.openConnection(); 

        //设置请求超时为5s 

        con.setConnectTimeout(5*1000); 

        //防止简单反扒

        String referer = url.getProtocol()+"://"+url.getHost();

        con.setRequestProperty("Referer", referer);

        // 输入流 

        InputStream is = con.getInputStream(); 

        // 1K的数据缓冲 

        byte[] bs = new byte[1024]; 

        // 读取到的数据长度 

        int len; 

        // 输出的文件流 

		File sf=new File(savePath); 

		if(!sf.exists()){ 

			sf.mkdirs(); 

		} 

		OutputStream os = new FileOutputStream(sf.getPath()+"/"+filename+".jpg"); 

        // 开始读取 

        while ((len = is.read(bs)) != -1) { 

			os.write(bs, 0, len); 

        } 

        System.out.println(sf.getPath()+"\\"+filename+"下载完成");

        // 完毕，关闭所有链接 

        os.close(); 

        is.close();
}
}
