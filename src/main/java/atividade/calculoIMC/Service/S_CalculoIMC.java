package atividade.calculoIMC.Service;

import atividade.calculoIMC.Model.M_Resultados;
import org.springframework.stereotype.Service;


@Service
public class S_CalculoIMC {

    public static M_Resultados calculo(String altura, String peso) {
        Double resultado;

        String mensagem = "";

        resultado = Double.valueOf(peso)/ (Double.valueOf(altura) * Double.valueOf(altura));

        if (resultado <= 18.5) {
            mensagem+="Sua Classificação é Abaixo do peso";
        } else if (resultado >= 18.5 && resultado <= 24.9) {
            mensagem+="Sua Classificação é Peso Ideal";
        } else if (resultado >= 25.0 && resultado <= 29.9) {
            mensagem+="Sua Classificação é de Sobrepeso";
        } else if (resultado >= 30.0 && resultado <= 34.9) {
            mensagem+="Sua Classificação é Obesidade I";
        } else if (resultado >= 35.0 && resultado <= 39.9) {
            mensagem+="Sua Classificação é Obesidade II";
        } else if (resultado >= 40.0 ) {
            mensagem+="Sua Classificação é Obesidade Grave III";
        }


        M_Resultados m_resultado = new M_Resultados(mensagem,(String.valueOf(resultado)));
        return m_resultado;
    }



}
