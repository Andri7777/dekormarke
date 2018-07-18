package com.example.dekormarket.controller;

import com.example.dekormarket.dto.FileRequest;
import com.example.dekormarket.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/file1")
@CrossOrigin
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping
    public void saveFile(@RequestBody FileRequest content) throws IOException {
        fileService.saveFile(content.getContent());

    }
}
