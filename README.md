# Kontoappen
Bankapp i konsolen.Skapa bankkonto, skriva ut alla konto, lägg till pengar till konto, ta bort pengar från konto, leta
efter en specifik konto, skapa sparkonto och beräkna räntan på ett belopp.
## Köra
JDK + IDE
## Teori
### 1. Inkapsling
Kontos variabler som owner och balance är privata som förhindrar att man förändrar värde till någonting olämpligt.
Dessutom har jag inte skapat en set metod som låter programerare förändra värdet av owner eller balance till vad 
som helst.
### 2. Factory
Nya kontos skapas i accountregister, vilket är klassen för lista av kontos och läggs till Listan i metoden 
createAccount. Account skapas i accountregister eftersom man vill inte skapa konto utan att lägga till de till listan. 
### 3. Stegkedja
Stegkedja deposit:
Användaren skriver kontots typ:regular eller savings, sen skriver namnet på kontot. Dessa strängar sparas på accounttype
och owner. Om kontot är en account så letar man efter kontot inom accountlist, DVS köra metoden findaccount och om 
kontot är en savingsaccount så körs metoden findsavingsaccount. Sen skriver användaren amount som de vill sätta in på 
kontot, vilket sker via metoden deposit. Savingsaccount ärver från account så klassen har redan metoden deposit.

## Reflektion
Jag behövde lägga till super till savingsaccount för att köra programmet.
Scanner objekt måste skapas innan loopen men ska inte scanna innan loopen.
Jag laddade upp .idea mappen till git och jag hittade kommandon på stack overflow efter jag sökte på google.
## Muntligt reflektion
https://funet-my.sharepoint.com/:v:/g/personal/3kdyhapp26_sawble_folkuniversitetet_nu/IQDRAwXSHqXxR6JoGYAdUiN7AX2hQOTrgxECBArl8HS6FBA?e=i7OaNK&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D