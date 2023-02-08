# MAP-ATI

Spitalul Clinic de Urgență pentru Copii Cluj-Napoca are o secție de ATI pentru nou-născuți.
Se cere proiectarea unei aplicații care să gestioneze paturile din cadrul secției
1. 1p. La deschiderea aplicației se afișează o fereastră cu toate paturile ocupate și numărul de
paturi libere. O altă fereastră conține o listă de pacienți aflați în așteptare pentru primirea unui
pat.
Numărul de paturi se obține dintr-un fișier/tabelă
Paturi ocupate: 21
TIC 3 paturi libere
TIM 6 paturi libere
TIIP 0 paturi libere
Un Pat are următoarele informații:
id
tip
1. TIC (Terapie intensivă chirurgicală) 14 paturi în fișier
2. TIM (Terapie intensivă medicală) 8 locuri
3. TIIP (Îngrijire postoperatorie) 8 locuri
ventilație
DA/NU
pacient (CNP/Pacient) - null liber
Orice Pacient are următoarele:
CNP
vârstă (luni)
prematur (Da/Nu)
diagnostic_principal
gravitate (Scară de la 1 la 14)
Există un număr de minim 20 de pacienți aflați în lista de așteptare (în fișier)
2. 2p. În fereastra asociată pacienților în așteptare vor fi ordonați descrescător pacienții în funcție de
gravitate (cazurile grave primele), afișându-se CNP-ul acestora împreună cu diagnosticul dat.
3. 2p. Cadrul medical poate selecta din lista un copil și să-l plaseze pe oricare pat liber din cele 3
tipuri de paturi.
4. 2p. În momentul în care s-a plasat un copil pe un pat, se actualizează fereastra de paturi ocupate și
paturi disponibile. Lista cu paturi va fi grupată după tip, ca în exemplu:
Paturi ocupate: 21
TIC 3 paturi libere
TIM 6 paturi libere
TIIP 0 paturi libere
Cerinte non-functionale - 2p:
• Validarea datelor de intrare
Exemplu: Nu se poate aloca unui pacient un pat de un anumit tip dacă nu sunt paturi disponibile
• Procesarea va avea loc numai la nivel de service sau de controller; interacțiunea cu sursa de date se
va face numai prin intermediul repository-ului (puteti folosi baze de date sau fișiere text)
• Interactiunea cu utilizatorul va avea loc numai in UI (GUI)
• Se cere eliminarea codului care nu este folosit, precum și a functionalitatilor care nu s-au cerut (dacă
ați lucrat cu ceva template de la lab)
• Clasele, atributele și metodele lor vor avea exact numele cerute în problema sau nume sugestiv dacă
nu s-a specificat explicit numele lor
IMPORTANT
• Se punctează doar cerințele funcționale care rulează
• Orice cod care nu poate fi explicat, atrage după sine nepunctarea cerintei/cerințelor din care face
parte
• Nu aveți voie sa comunicati în timpul examenului, în nicio modalitate posibila de a face acest lucru
(chat, mail, …etc.)
Cerințe extra – pt. bonus: 1p în plus la nota finală:
1. Posibilitatea de a selecta la un pacient ce fel de pat să îi fie alocat (cu ventilație sau nu -
checkbox de exemplu). În cazul în care se încearcă alocarea unui pat cu ventilație, dar toate
sunt ocupate, se afișează un mesaj de eroare.
2. Eliberarea unui pat. Se introduce în fereastra destinată paturilor un CNP care ocupă un pat.
Dacă acesta este cu adevărat un pacient internat, înseamnă că din diferite motive a eliberat
patul (ameliorare/deces) și patul este din nou înregistrat ca fiind eliberat. Dacă pacientul nu
este internat se afișează un mesaj de eroare.
Cerință extra pentru respect:
- Dacă o categorie de paturi rămâne fără locuri libere, se va folosi text roșu (verde în caz
contrar):
TIIP 0 paturi libere
TIM 5 paturi libere
