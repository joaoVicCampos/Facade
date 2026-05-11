package org.padroes;

public class ReservaViagemFacade {
    private final ServicoValidacaoDocumentos servicoValidacaoDocumentos;
    private final ServicoReservaVoo servicoReservaVoo;
    private final ServicoReservaHotel servicoReservaHotel;
    private final ServicoSeguroViagem servicoSeguroViagem;
    private final ServicoPagamento servicoPagamento;

    public ReservaViagemFacade() {
        this.servicoValidacaoDocumentos = new ServicoValidacaoDocumentos();
        this.servicoReservaVoo = new ServicoReservaVoo();
        this.servicoReservaHotel = new ServicoReservaHotel();
        this.servicoSeguroViagem = new ServicoSeguroViagem();
        this.servicoPagamento = new ServicoPagamento();
    }

    public String reservarPacote(String viajante, String origem, String destino, int noites, double valorTotal) {
        StringBuilder resumo = new StringBuilder();


        resumo.append(servicoValidacaoDocumentos.validar(viajante)).append("\n");
        resumo.append(servicoReservaVoo.reservar(origem, destino)).append("\n");
        resumo.append(servicoReservaHotel.reservar(destino, noites)).append("\n");
        resumo.append(servicoSeguroViagem.contratar(viajante)).append("\n");
        resumo.append(servicoPagamento.processar(viajante, valorTotal)).append("\n");
        resumo.append("Pacote de viagem finalizado com sucesso para ").append(viajante).append(".");

        return resumo.toString();
    }
}

