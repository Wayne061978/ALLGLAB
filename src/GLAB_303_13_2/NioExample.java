package GLAB_303_13_2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class NioExample {
    public static void main(String[] args) throws IOException
    {
        String[] inputFiles = {"C:\\Users\\Wayne Hunte\\Documents\\file1.txt",
                "C:\\Users\\Wayne Hunte\\Documents\\file2.txt"};

        String outputFile = "C:\\Users\\Wayne Hunte\\Documents\\nioOutput.txt";

        FileOutputStream  fos = new FileOutputStream(outputFile);
        FileChannel targetChannel =  fos.getChannel();

        for(int i =0; i < inputFiles.length; i++)
        {
            // Get channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputchannel =  fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int)size);
            System.out.print((char) buf.get());
            while (inputchannel.read(buf)> 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    //  System.out.print((char) buf.get());
                    targetChannel.write(buf);
                }
            }
        }
    }}
