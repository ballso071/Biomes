package BiomesK.Biomes;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincon {

    //Path and return page
    @RequestMapping("/index")
    public String pageIndex(Model model) {
        return "index";
    }

    @RequestMapping("/index/page0")
    public String pageIndex0(Model model) {
        return "page0";
    }

    @RequestMapping("/index/page1")
    public String pageIndex1(Model model) {
        return "page1";
    }

    @RequestMapping("/index/page2")
    public String pageIndex2(Model model) {
        return "page2";
    }

    @RequestMapping("/index/page3")
    public String pageIndex3(Model model) {
        return "page3";
    }

    @RequestMapping("/index/page4")
    public String pageIndex4(Model model) {
        return "page4";
    }

    @RequestMapping("/index/page5")
    public String pageIndex5(Model model) {
        return "page5";
    }

    @RequestMapping("/index/page6")
    public String pageIndex6(Model model) {
        return "page6";
    }

    @RequestMapping("/index/page7")
    public String pageIndex7(Model model) {
        return "page7";
    }

    @RequestMapping("/index/page8")
    public String pageIndex8(Model model) {
        return "page8";
    }

    @RequestMapping("/index/q1")
    public String pageq1(Model model) {
        return "q1";
    }

    @RequestMapping("/index/q1t")
    public String pageq1t(Model model) {
        return "q1t";
    }

    @RequestMapping("/index/q1f")
    public String pageq1f(Model model) {
        return "q1f";
    }

    @RequestMapping("/index/q2")
    public String pageq2(Model model) {
        return "q2";
    }

    @RequestMapping("/index/q2t")
    public String pageq2t(Model model) {
        return "q2t";
    }

    @RequestMapping("/index/q2f")
    public String pageq2f(Model model) {
        return "q2f";
    }

    @RequestMapping("/index/q3")
    public String pageq3(Model model) {
        return "q3";
    }

    @RequestMapping("/index/q3t")
    public String pageq3t(Model model) {
        return "q3t";
    }

    @RequestMapping("/index/q3f")
    public String pageq3f(Model model) {
        return "q3f";
    }

    @RequestMapping("/index/q4")
    public String pageq4(Model model) {
        return "q4";
    }

    @RequestMapping("/index/q4t")
    public String pageq4t(Model model) {
        return "q4t";
    }

    @RequestMapping("/index/q4f")
    public String pageq4f(Model model) {
        return "q4f";
    }

    @RequestMapping("/index/q5")
    public String pageq5(Model model) {
        return "q5";
    }

    @RequestMapping("/index/q5t")
    public String pageq5t(Model model) {
        return "q5t";
    }

    @RequestMapping("/index/q5f")
    public String pageq5f(Model model) {
        return "q5f";
    }

    @RequestMapping("/index/q5f2")
    public String pageq5f2(Model model) {
        return "q5f2";
    }
        @RequestMapping("/index/q")
    public String pageq(Model model) {
        return "q";
    }
        @RequestMapping("/index/name")
    public String pagename(Model model) {
        return "name";
    }
         @RequestMapping("/index/info")
    public String pageinfo(Model model) {
        return "info";
    }
             @RequestMapping("/index/end")
    public String pageend(Model model) {
        return "end";
    }
}
