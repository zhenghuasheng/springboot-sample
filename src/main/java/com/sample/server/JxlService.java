package com.sample.server;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenghuasheng on 2017/4/17.21:51
 */
@Service
public class JxlService {

    @Autowired
    private ConsumerServer consumerServer;

   public void insert() throws IOException, BiffException {
       InputStream instream = new FileInputStream("D:/products.xls");

       Workbook workbook = Workbook.getWorkbook(instream);
       Sheet readsheet = workbook.getSheet(1);

       int rsColumns = readsheet.getColumns();
       //获取Sheet表中所包含的总行数
       int rsRows = readsheet.getRows();

       for (int i = 1; i< rsRows ;i++) {
           Map<String,Object> params = new HashMap<>();
           params.put("name", readsheet.getCell(0,i).getContents());
           params.put("option", readsheet.getCell(1,i).getContents());
           params.put("units", readsheet.getCell(2,i).getContents());
           params.put("quantity", readsheet.getCell(3,i).getContents());
           params.put("sn", readsheet.getCell(4,i).getContents());
           params.put("price", readsheet.getCell(5,i).getContents());
           consumerServer.insertProducts(params);
       }
   }
}
