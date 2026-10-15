package freunion.com.freunion;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

import java.nio.file.FileSystemException;
import java.util.*;


public class filehandler{

    boolean filhandler(int uuid, String username, String filename, String myfolder ){
        File directory = new File(filename);
        try{
            String str_uuid = Integer.toString(uuid);
            Path dirPath = Paths.get("pbluser", str_uuid , myfolder);
            if(Files.notExists(dirPath) ){
                Files.createDirectories(dirPath);
                System.out.println(("inside line 24"));
                System.out.println("Directory created successfully " + dirPath.toAbsolutePath() );
            }else if(Files.isDirectory(dirPath)){
                System.out.println(("inside line 27"));
                System.out.println("Directory already exists: " + dirPath.toAbsolutePath());
            }
            Path absolutePath = dirPath.toAbsolutePath();


   //  call anoter method  that will store file  to sqlite

        } catch(Exception e){
System.out.println("ERROR an FILE exception" + e + "occured \n inside line 36");
/*
send error notification to user, to a debug file
 */
            return false;
    }
        return true;
    }
}
