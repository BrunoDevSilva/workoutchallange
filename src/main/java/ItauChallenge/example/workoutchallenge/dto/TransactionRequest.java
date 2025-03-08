package ItauChallenge.example.workoutchallenge.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionRequest {
    @NotNull
    @Min(0)
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
