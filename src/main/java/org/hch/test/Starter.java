package org.hch.test;

import org.hch.test.utils.HttpUtils;

import java.io.IOException;

/**
 * @author chenghao
 * @date 2019/10/17
 */
public class Starter {

    public static void main(String args[]) {
        try {
            baiduTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void baiduTest() throws IOException {
        String url = "http://www.baidu.com";
        String result = HttpUtils.get(url, null);
        System.out.println(result);
    }
}
