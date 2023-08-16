package atividade.calculoIMC.Model;

public class M_Resultados {

    private  String mensagem;
    private String resultado;

    public M_Resultados(String mensagem, String resultado) {
        this.mensagem = mensagem;
        this.resultado = resultado;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
