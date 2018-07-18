package com.example.dekormarket.service.serviceImpl;

import com.example.dekormarket.dto.MyMultipartFille;
import com.example.dekormarket.service.FileService;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService{


    @Override
    public void saveFile(String content) throws IOException {
       String [] arr = content.split(",");
        BASE64Decoder base64 = new BASE64Decoder();
        byte [] imgContent = base64.decodeBuffer(arr[1]);
        String expansion = arr[0].split("/")[1].split(";")[0];
        String name = UUID.randomUUID().toString();
        MyMultipartFille myMultipartFille = new MyMultipartFille(imgContent,name,expansion);
        File file = new File("D:\\braskets\\multipat\\Fille\\"+name+"."+expansion);
        myMultipartFille.transferTo(file);
        file.createNewFile();
    }
}
