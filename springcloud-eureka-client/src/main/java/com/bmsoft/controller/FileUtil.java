package com.bmsoft.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Calendar;

/**
 * Created by Carr on 2018/6/20 .
 */
public class FileUtil {


    /**
     * 得到字节流 数组大小
     */
    public static byte[] readStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        outStream.close();
        inStream.close();
        return outStream.toByteArray();
    }

    /**
     * 项目文件根路径
     * @return  rootPath
     */
    public static String rootPath() {
        return System.getProperty("user.dir");
    }

    /**
     * 完整路径
     * @param module folderName
     * @return  completePath
     */
    public static String completePath(String module) {
        return rootPath() + File.separator + modulePath(module);
    }

    /**
     * 业务文件路径
     * 格式: ../module/2018/7/....
     * @param module folderName
     * @return path
     */
    public static String modulePath(String module) {
        Calendar calendar = Calendar.getInstance();
        int now_y = calendar.get(Calendar.YEAR);//得到年份
        int now_m = calendar.get(Calendar.MONTH)+1;//得到月份
//        LocalDate localDate = LocalDate.now();
//        String path = module + File.separator + localDate.getYear() + File.separator + localDate.getMonthValue();
        String path = module + File.separator + now_y + File.separator + now_m;
        File dateDir = new File(path);
        if (!dateDir.exists()) {
            dateDir.mkdirs();
        }
        return path;
    }







}
