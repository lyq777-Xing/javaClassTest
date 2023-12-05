package assignment.ass02x;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author lyq
 * @time 2023/11/24 21:56
 */
public class GetSocre {
    public static void main(String[] args) {
        String fileName = "E:\\Java作业\\test_11_24\\score.txt";
        try {
//            成绩总和
            double sum = 0;
//            拼接成绩
            String code = "";
//            确定有几个成绩
            int count = 0;
//            获取文件内容
            String s = Files.readString(Paths.get(fileName));
            s = s + " ";
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != ' '){
                    code = code + s.charAt(i);
                }else {
                    sum = sum + Double.parseDouble( code);
                    code = "";
                    count++;
                }
            }
            double avg = sum / count;
            System.out.println("成绩个数：" + count);
            System.out.println("成绩的平均值：" + avg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
