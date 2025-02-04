package be.vinci.cae.fiche1.controllers;

import be.vinci.cae.fiche1.Quote;
import be.vinci.cae.fiche1.services.QuotesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuotesController {
    private final QuotesService quotesService;

    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }
    @GetMapping("/")
    public Iterable<Quote> all() {
        return quotesService.getAllQuotes();
    }
}
