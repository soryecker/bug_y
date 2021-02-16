				

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
