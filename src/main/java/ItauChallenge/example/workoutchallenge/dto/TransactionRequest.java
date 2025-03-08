package ItauChallenge.example.workoutchallenge.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransactionRequest {
    @NotNull

    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

   public OffsetDateTime getDataHora() {
       return dataHora;
   }
   
   public Double getValor() {
       return valor;
   }
}
