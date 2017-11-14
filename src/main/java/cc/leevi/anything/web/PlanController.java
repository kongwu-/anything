//package cc.leevi.anything.web;
//
//import cc.leevi.anything.model.Plan;
//import cc.leevi.anything.rest.request.PlanRequest;
//import cc.leevi.anything.rest.request.Request;
//import cc.leevi.anything.rest.response.Response;
//import cc.leevi.anything.service.PlanService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
///**
// * Created by jiang on 2017-04-22.
// */
////@RestController
////@RequestMapping("plan")
//public class PlanController {
//
//    @Autowired
//    private PlanService planService;
//
//
//    @GetMapping(value = "list")
//    public Response list(){
//        Response response = new Response();
//        response.setData(planService.planList());
//        return response;
//    }
//
//    @GetMapping(value = "{planId}/data")
//    public Response planData(@PathVariable Integer planId){
//        Response response = new Response();
//        response.setData(planService.planDataList(planId));
//        return response;
//    }
//
//    @PostMapping(value = "save")
//    public Response save(@RequestBody PlanRequest plan){
//        Response response = new Response();
//        planService.save(plan);
//        return response ;
//    }
//
//    @PatchMapping(value = "{id}/start")
//    public Response start(@PathVariable Integer id){
//        Response response = new Response();
//        planService.start(id);
//        return response ;
//    }
//
//    @PatchMapping(value = "{id}/stop")
//    public Response stop(@PathVariable Integer id){
//        Response response = new Response();
//        planService.stop(id);
//        return response ;
//    }
//
//    @DeleteMapping(value = "{id}")
//    public Response delete(@PathVariable Integer id){
//        Response response = new Response();
//        planService.delete(id);
//        return response ;
//    }
//
//}
