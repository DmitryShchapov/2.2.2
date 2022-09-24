package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarServiceImp;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", new CarServiceImp().resultCars(count));
        return "cars";
    }

}
