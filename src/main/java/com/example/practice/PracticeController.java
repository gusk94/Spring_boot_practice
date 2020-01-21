package com.example.practice;
 
import javax.annotation.Resource;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.example.practice.board.mapper.BoardMapper;
 
@Controller
public class PracticeController {
 
    @Resource(name="com.example.practice.board.mapper.BoardMapper")
    BoardMapper mBoardMapper;
    
    @RequestMapping("/index")
    private String jspTest() throws Exception{
        
//        System.out.println(mBoardMapper.boardCount());
        
        return "index"; 
    }
}
