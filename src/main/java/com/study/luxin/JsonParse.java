package com.study.luxin;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/**
 * Created by luxin on 2018/11/27.
 */
public class JsonParse {

    @Test
    public void parseJsonFromFile() throws IOException {
        // 获取文件路径
        URL resource = this.getClass().getClassLoader().getResource("arg.json");
        String file = resource.getFile();

        // 将文件以流的形式读出文件
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(file), 1024);
        String jsonString = "";
        byte[] buffer = new byte[1024];

        // 将文件读入 buffer 中,如果返回时-1 说明文件已经读完
        while (bf.read(buffer) != -1) {
            jsonString += new String(buffer);
        }

        HashMap<String, Object> argMap = JSON.parseObject(jsonString, HashMap.class);

        // 遍历 map
        argMap.forEach((k, v) -> {
            System.out.println("key: " + k);
            System.out.println("value: " + v);
            System.out.println();
        });

       /* for (Map.Entry<String, Object> entity : argMap.entrySet()) {
            System.out.println(entity.getKey());
            System.out.println(entity.getValue());
            System.out.println();
        }*/
       

    }


}
