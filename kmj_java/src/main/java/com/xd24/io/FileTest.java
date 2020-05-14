package com.xd24.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * File  练习
 * @author shuifu
 * @version 1.0
 * @date 2020/4/14 11:48
 */
public class FileTest {

    /**
     * 遍历file
     *
     * @param dir  File
     */
    public   static  void  listAllFiles(File dir){
        if (dir ==null || !dir.exists()){
            return;
        }
        if (dir.isFile()){
            System.out.println(dir.getName());
            return;
        }
        for (File file: dir.listFiles()){
            listAllFiles(file);
        }
    }

    /**
     * 复制文件  字节类型
     * @param src
     * @param dist
     * @throws IOException
     */
   public static  void  copyFile(String  src, String dist) throws IOException {
       FileInputStream in = new FileInputStream(src);
       FileOutputStream out = new FileOutputStream(dist, true);
       BufferedOutputStream  bufferedOutputStream =new BufferedOutputStream(out);
       byte[]  buffer  = new byte[20  *1024];
       int cnt;

       // read() 最多读取 buffer.length 个字节
       // 返回的是实际读取的个数
       // 返回 -1 的时候表示读到 eof，即文件尾
       // 0 表示数据偏移量
       while((cnt = in.read(buffer, 0 , buffer.length)) != -1){
           bufferedOutputStream.write(buffer, 0, cnt);
       }

       in.close();
       out.close();
   }


    /**
     * 读取文件  并输出
     *
     * @param filePath
     * @throws IOException
     */
    public static void readFileContent(String filePath) throws IOException {

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
        // 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
        // 因此只要一个 close() 调用即可
        bufferedReader.close();
    }


//    public static void main(String[] args) {
//        try {
//            readFileContent("C:\\code\\test.md");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        List<String>   a = null;
        for (String  a1: a){
            System.out.println(a1);
        }
    }
}
