package BiomesK.Biomes;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Maincon {
    //Path and return page
    @RequestMapping("/index")
    public String pageIndex(Model model){
        return "index";
    }
      @RequestMapping("/index/page0")
    public String pageIndex0(Model model){
        return "page0";
    }
    @RequestMapping("/index/page1")
    public String pageIndex1(Model model){
        return "page1";
    }
     @RequestMapping("/index/page2")
    public String pageIndex2(Model model){
        return "page2";
    }
     @RequestMapping("/index/page3")
    public String pageIndex3(Model model){
        return "page3";
    }
     @RequestMapping("/index/page4")
    public String pageIndex4(Model model){
        return "page4";
    }
         @RequestMapping("/index/page5")
    public String pageIndex5(Model model){
        return "page5";
    }
         @RequestMapping("/index/page6")
    public String pageIndex6(Model model){
        return "page6";
    }
         @RequestMapping("/index/page7")
    public String pageIndex7(Model model){
        return "page7";
    }
          @RequestMapping("/index/page8")
    public String pageIndex8(Model model){
        return "page8";
    }
           @RequestMapping("/index/q1")
    public String pageq1(Model model){
        return "q1";
    }
             @RequestMapping("/index/q1t")
    public String pageq1t(Model model){
        return "q1t";
    }
             @RequestMapping("/index/q1f")
    public String pageq1f(Model model){
        return "q1f";
    }
               @RequestMapping("/index/q2")
    public String pageq2(Model model){
        return "q2";
    }
             @RequestMapping("/index/q2t")
    public String pageq2t(Model model){
        return "q2t";
    }
             @RequestMapping("/index/q2f")
    public String pageq2f(Model model){
        return "q2f";
    }
}
