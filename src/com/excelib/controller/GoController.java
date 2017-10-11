package com.excelib.controller;




@Controller
public class GoController {
    private final Log logger = LogFactory.getLog(GoController.class);
    //处理head类型的“/”的请求
    @RequestMapper(value={"/"},method={RequestMethod.HEAD})
    public String head() {
        return "go.jsp";
    }
    //处理get类型的“/index”和“/”请求
    @RequestMapper(value={"/insex","/"},method={RequestMethod.GET})
    public String index(Model model) throws Exception{
        logger.info("========processed by index ========");
        //返回msg参数
        model.addAttribute("msg", "GO,GO,GO!");
        return "go.jsp";
    }
}
