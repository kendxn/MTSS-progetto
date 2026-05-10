<div align="center">

# 🏛️ Roman Number Converter & Printer

[![Roman CI](https://github.com/kendxn/MTSS-roman-number/actions/workflows/builld.yml/badge.svg)](https://github.com/kendxn/MTSS-roman-number/actions/workflows/builld.yml)
[![Coverage Status](https://coveralls.io/repos/github/kendxn/MTSS-roman-number/badge.svg?branch=main)](https://coveralls.io/github/kendxn/MTSS-roman-number?branch=main)

*Sistema Java per la conversione di numeri interi in numeri romani (range 1-1000) e la loro rappresentazione in formato ASCII Art. Il progetto segue rigorosamente le metodologie di Test-Driven Development e gli standard di qualità del software richiesti.*

</div>

<br>

## 🛠️ Requisiti Tecnici

### 🔹 Core Stack
> - **Linguaggio**: Java 17
> - **Build Tool**: Maven 3.x
> - **Encoding**: UTF-8

### 🔹 Testing & Quality
> - **Unit Testing**: JUnit 5.11 (Jupiter)
> - **Analisi Statica**: Checkstyle 3.3.1 
> - **Code Coverage**: Jacoco 0.8.10 (target minimo richiesto: 85%)

### 🔹 CI/CD
> - **Piattaforma**: GitHub Actions (Ubuntu)
> - **Reporting**: Coveralls (via `coveralls-maven-plugin`)

---

## 📂 Struttura del Progetto

Il codice è organizzato per garantire la separazione delle responsabilità:
- 🔸 `it.unipd.mtss.IntegerToRoman`: Logica di conversione e validazione dell'input (Right BICEP).
- 🔸 `it.unipd.mtss.RomanPrinter`: Generazione dell'output grafico in ASCII Art.

---

## ⚙️ Gestione del Ciclo di Vita

### Build e Analisi Statica

Il comando seguente compila il progetto, esegue i test e avvia l'analisi statica con Checkstyle:

```bash
mvn clean package
```

> ⚠️ **Nota:** *In caso di violazioni delle regole di stile o errori di compilazione, la build viene interrotta per garantire l'integrità del branch principale.*

### Testing e Copertura del Codice

La suite di test JUnit 5 è progettata per superare una soglia di copertura del codice dell'85%.

```bash
mvn test jacoco:report
```

> 📊 **Report:** *Il report dettagliato viene generato in `target/site/jacoco/index.html`.*

---

## 🚀 Esecuzione (Usage)

Una volta completata la fase di build con Maven, verrà generato l'eseguibile del progetto all'interno della directory `target/`. 

Per avviare il convertitore e visualizzare l'ASCII Art del numero romano, esegui questo comando da terminale:

```bash
java -jar target/[nome-esatto-del-tuo-file].jar <numero>
```

**Esempio di utilizzo:**
```bash
java -jar target/roman-number-1.0-SNAPSHOT-jar-with-dependencies.jar 42
```
> 💡 *(Nota: il numero in input deve essere un intero compreso tra 1 e 1000, come da specifiche di progetto).*

---

## 📏 Standard Qualitativi

- ✅ **Git Flow**: Sviluppo basato su feature branch e integrazione tramite Pull Request.
- ✅ **A-TRIP**: Implementazione di test automatici, esaustivi, ripetibili, indipendenti e professionali.
- ✅ **Static Analysis**: Rispetto dei vincoli Checkstyle per la manutenibilità del codice.

---

## 👥 Autori

| 👤 Autore | 🎓 Matricola |
| :--- | :--- |
| **Aurelio Rrena** | `2147993` |
| **Chen Daxin** | `2148627` |
