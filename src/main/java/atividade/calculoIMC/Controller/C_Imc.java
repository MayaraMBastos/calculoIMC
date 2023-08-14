package atividade.calculoIMC.Controller;

import atividade.calculoIMC.Service.S_CalculoIMC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Imc {

    @GetMapping("/")
    public String pagHome (){
       return  "Home/home";
    }

    @PostMapping("/")
    public String dadosCalculo(@RequestParam("altura") String altura, @RequestParam("peso") String peso, Model model) {
        S_CalculoIMC.calculo(altura, peso, model);
        return "Home/home";
    }
}
