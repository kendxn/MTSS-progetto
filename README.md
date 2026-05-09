# MTSS-roman-number
[![Roman CI](https://github.com/kendxn/MTSS-roman-number/actions/workflows/builld.yml/badge.svg)](https://github.com/kendxn/MTSS-roman-number/actions/workflows/builld.yml)
[![Coverage Status](https://coveralls.io/repos/github/kendxn/MTSS-roman-number/badge.svg?branch=main)](https://coveralls.io/github/kendxn/MTSS-roman-number?branch=main)

# Roman Number Converter & Printer

Sistema Java per la conversione di numeri interi in numeri romani (range 1-1000) e la loro rappresentazione in formato ASCII Art. Il progetto segue rigorosamente le metodologie di Test-Driven Development e gli standard di qualità del software richiesti.

## Requisiti Tecnici

### **Core Stack**

- **Linguaggio**: Java 17
    
- **Build Tool**: Maven 3.x
    
- **Encoding**: UTF-8
    

### **Testing & Quality**

- **Unit Testing**: JUnit 5.11 (Jupiter)
    
- **Analisi Statica**: Checkstyle 3.3.1 
    
- **Code Coverage**: Jacoco 0.8.10 (target minimo richiesto: 85%)
    

### **CI/CD**

- **Piattaforma**: GitHub Actions (Ubuntu)
    
- **Reporting**: Coveralls (via `coveralls-maven-plugin`)

## Struttura del Progetto

Il codice è organizzato per garantire la separazione delle responsabilità:

- **it.unipd.mtss.IntegerToRoman**: Logica di conversione e validazione dell'input (Right BICEP).
    
- **it.unipd.mtss.RomanPrinter**: Generazione dell'output grafico in ASCII Art.
    

## Gestione del Ciclo di Vita

### Build e Analisi Statica

Il comando seguente compila il progetto, esegue i test e avvia l'analisi statica con Checkstyle:

Bash

```
mvn clean package
```

In caso di violazioni delle regole di stile o errori di compilazione, la build viene interrotta per garantire l'integrità del branch principale.

### Testing e Copertura del Codice

La suite di test JUnit 5 è progettata per superare una soglia di copertura del codice dell'85%.

Bash

```
mvn test jacoco:report
```

Il report dettagliato viene generato in `target/site/jacoco/index.html`.

## Standard Qualitativi

- **Git Flow**: Sviluppo basato su feature branch e integrazione tramite Pull Request.
    
- **A-TRIP**: Implementazione di test automatici, esaustivi, ripetibili, indipendenti e professionali.
    
- **Static Analysis**: Rispetto dei vincoli Checkstyle per la manutenibilità del codice.
    
