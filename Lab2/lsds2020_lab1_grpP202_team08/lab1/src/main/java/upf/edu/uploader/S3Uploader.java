/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upf.edu.uploader;
import java.util.List;
import java.io.File;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 *
 * @author u149943
 */
public class S3Uploader {
    
    private String bucket;
    private String prefix;
    private String dom;
    
    public S3Uploader(String bucket, String prefix, String dom){
        this.bucket = bucket;
        this.prefix = prefix;
        this.dom = dom;
    }
    public void upload(List<String> outputFile){
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
        String key_name = "tweetfilter-lab1"; 
        String file_name;
        for(int it = 0; it < outputFile.size(); it++){
            file_name = outputFile.get(it);
            try{
                s3.putObject(bucket, key_name, new File(file_name));
            } catch (AmazonServiceException e){
                System.err.println(e.getErrorMessage());
                System.exit(1);
            }
            
        }
        
    }
}
