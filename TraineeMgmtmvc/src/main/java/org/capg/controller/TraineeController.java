package org.capg.controller;


import org.capg.entities.Trainee;
import org.capg.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TraineeController {
	
	@Autowired
	private ITraineeService service;
	
	@GetMapping("/home")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("homepage");
		return mv;
	}
	
	@GetMapping("processtrainee")
    public ModelAndView processTrainee(@RequestParam("traineeid")int id,
                                        @RequestParam("traineename") String traineename,
                                        @RequestParam("loc") String location,
                                        @RequestParam("domain")String domain){
        Trainee trainee=new Trainee();
        trainee.setTraineeId(id);
        trainee.setTraineeName(traineename);
        trainee.setTraineeLocation(location);
        trainee.setTraineeDomain(domain);
        service.add(trainee);
        ModelAndView mv=new ModelAndView("details","trainee",trainee);
        return mv;
    }

}
