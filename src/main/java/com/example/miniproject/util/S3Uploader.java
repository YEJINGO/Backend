package com.example.miniproject.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//@RequiredArgsConstructor
//@Service
public class S3Uploader {

//    private final AmazonS3 amazonS3;
//
//    @Value("${cloud.aws.s3.bucket}")
//    private String bucket;

//    public String upload(MultipartFile multipartFile) throws IOException {
//        String fileName = UUID.randomUUID() + "_" + multipartFile.getOriginalFilename();
//
//        ObjectMetadata objMeta = new ObjectMetadata();
//        objMeta.setContentLength(multipartFile.getInputStream().available());
//
//        amazonS3.putObject(bucket, fileName, multipartFile.getInputStream(), objMeta);
//
//        return amazonS3.getUrl(bucket, fileName).toString();
//    }

//    public boolean delete(String fileUrl) {
//        try {
//            String fileKey = fileUrl.substring(58);
//
//            s3.deleteObject(bucket, fileKey);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
