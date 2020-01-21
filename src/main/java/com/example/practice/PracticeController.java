package com.example.practice;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class PracticeController {
	
    @RequestMapping("/index")
    private String jspTest() throws Exception{
        
//        System.out.println(mBoardMapper.boardCount());
        
        return "index"; 
    }
}
