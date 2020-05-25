package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private int loc = 0;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String printCars(@RequestParam String locale, ModelMap model) {
        List<Car> carList = CarService.getCarService().getAllCars();
        model.addAttribute("carList", carList);
        loc = 1;
        if (locale.equals("en")) {
            model.addAttribute("car", "CARS");
        } else if (locale.equals("ru")) {
            model.addAttribute("car", "МАШИНЫ");
        } else {
            model.addAttribute("car", "unknown locale Cars");
        }
        return "cars";
    }

    /* метод printCars2 в условиях задачи избыточен но иначе при отсутствии локали выкидывает 404
    * */

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printCars2(ModelMap model) {
        if (loc == 0) {
            List<Car> carList = CarService.getCarService().getAllCars();
            model.addAttribute("carList", carList);
            model.addAttribute("car", "No locale Cars");
            return "cars";
        }
        loc = 0;
        return "cars";
    }
}
