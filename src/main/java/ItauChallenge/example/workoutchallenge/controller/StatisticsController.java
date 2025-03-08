package ItauChallenge.example.workoutchallenge.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ItauChallenge.example.workoutchallenge.dto.StatisticsResponse;
import ItauChallenge.example.workoutchallenge.services.TransactionService;

@RestController
@RequestMapping
public class StatisticsController {
    
    private final TransactionService transactionService;

    public StatisticsController(TransactionService transactionService){

        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<StatisticResponse> getStatistics(){
        
        DoubleSummaryStatistics stats = transactionService.getStatistics();
        
        return ResponseEntity.ok(new StatisticsResponse(stats));

    }
}
