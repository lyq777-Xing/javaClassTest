package assignment.ass02x;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author lyq
 * @time 2023/11/24 22:11
 */
public class GetCount {
    public static void main(String[] args) {
        String fileName = "E:\\Java作业\\test_11_24\\count.txt";
        try {
//            获取文档内容
            String s = Files.readString(Paths.get(fileName));
            s = s + "\r\n";
            int word = 0;
            int words = 0;
            int enters = 0;
            int zifu = 0;
//            利用flag标记 防止连续空格
            int flag = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                    flag = 1;
                    word++;
                } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    flag = 1;
                    word++;
                } else if (s.charAt(i) == ' ' || s.charAt(i) == '\r' || s.charAt(i) == '\t') {
                    if(flag == 1){
                        words++;
                        flag = 0;
                    }
                    if(s.charAt(i) == ' '){
                        zifu++;
                    }
                } else if (s.charAt(i) == '\n'){
                    enters++;
                }else {
                    zifu++;
                }
            }
            System.out.println("文档内容为：" + s);
            System.out.println("总共的字符数为：" + zifu);
            System.out.println("总共的单词数为：" + words);
            System.out.println("总共的行数为：" + enters);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
