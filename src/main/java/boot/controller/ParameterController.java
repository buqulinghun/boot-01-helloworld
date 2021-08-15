package boot.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterController {
    /**
     * @PathVariable 路径变量
     * @RequestHeader 获取请求头
     * @RequestParam 获取请求参数
     * @RequestAttribute 获取request域属性
     * @RequestBody 获取请求体
     * @MatrixVariable 获取矩阵变量
     *
     *
     * @param id
     * @param name
     * @param pv
     * @param userAgent
     * @param headMap
     * @param age
     * @param inters
     * @param requestparams
     * @return
     */
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> headMap,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String,String> requestparams) {
        Map<String, Object> map = new HashMap<>();
        /*
        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        map.put("user-agent", userAgent);
        map.put("header", headMap);
         */

        /*
        map.put("age", age);
        map.put("inters", inters);
        map.put("params", requestparams);
        */

        //map.put("cookie", cookie);

        return map;
    }


    @PostMapping("/save")
    public Map postMethod(@RequestBody String content) {
        Map<String,Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List brand,
                        @PathVariable String path){
        Map<String, Object> map = new HashMap<>();
        map.put("low", low);
        map.put("brand", brand);
        map.put("path", path);
        return map;
    }

}
