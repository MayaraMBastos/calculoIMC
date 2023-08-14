package atividade.calculoIMC.Service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class S_CalculoIMC {

    public static String calculo(String altura, String peso, Model model) {
        Long resultado;
        String mensagem = "";

        resultado = Long.valueOf(peso) / (Long.valueOf(altura) * Long.valueOf(altura));

        if (resultado >= 18.5) {
            mensagem+="Sua Classificação é de Magreza";
        } else if (resultado <= 18.5 && resultado >= 24.9) ;{
            mensagem+="Sua Classificação Está Dentro do Normal";
        } if (resultado <= 25.0 && resultado >= 29.9) {
            mensagem+="Sua Classificação é de Sobrepeso I";
        } else if (resultado <= 30.0 && resultado >= 39.9) {
            mensagem+="Sua Classificação é Obesidade II";
        } else if (resultado <= 40.0 ) {
            mensagem+="Sua Classificação é Obesidade Grave III";
        }

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("resultado", String.valueOf(resultado));
        return mensagem;
    }



}
