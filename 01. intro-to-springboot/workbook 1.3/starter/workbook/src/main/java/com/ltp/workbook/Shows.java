package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Shows {
    @GetMapping("/shows")
    public String printShows(){
        return "shows";
    }

}
