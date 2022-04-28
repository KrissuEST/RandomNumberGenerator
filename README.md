## Projekti lühikirjeldus

Programm genereerib 6 erinevat suvalist numbrit, mis jäävad vahemikku 1-48. <br/>
Väljastamisel numbrid järjestatakse kasvavas järjekorras. Programm tagab, et genereeritud <br/>
numbrid ei kordu. Lisaks võrdleb programm failis Combinations.csv olevaid kombinatsioone <br/>
loodud suvalise kombinatsiooniga (6 erinevat numbrit). Kui kombinatsioon failis kordub, <br/>
annab programm sellest teada ja viitab mitmendal Combinations.csv failireal on korduv kombinatsioon. <br/>
Kui ei kordu, siis üleb, et tegu on unikaalse kombinatsiooniga ja kuvab loodud kombinatsiooni. <br/>
Varasemalt on koodi jäänud palju System.out.println(); kommentaare, kuna nendega oli hea testida.

## Projekti info

Programm kasutab **Java 8** versiooni. <br/>
Kontrollisin ka *Whitespace characters* ehk tähemärke, et kood oleks puhtam. <br/>
Kood on inglise keeles, README.md eesti keeles.

## Projekti käivitamise juhend

Projekt lisada endale sobivasse arenduskeskkonda: Eclipse, NetBeans, Atom, IntelliJ IDEA vms. <br/>
Kui projekt on lisatud, siis parem klikk projekti peal ja valida Run As -> Java Application <br/>
Projekti peab mitmel korral käivitama, et saada erinevaid kombinatsioone. <br/>
Programmile on kaasa lisatud **Combinations.csv** fail, mille võib enda arvutis Desktopile lisada. <br/>
Kasutada kindlasti seda faili, kuna siis on kindel et programm töötab vigadeta. <br/>
Näitamaks, kus sinu arvutis asub **Combinations.csv** fail, tuleb **CodesList.java** klassis <br/>
**CodesList()** meetodis ära muuta url.

NB: Kui on soov iga kord sisendfaili kombinatsioonid sorteerituna välja printida uude CS_Output.csv faili, <br/>
tuleb muuta väljundfaili url **MainClass.java** klassi **main()** meetodis, siis on teada kuhu kausta <br/>
sinu arvutisse väljnudfail tekib. Samuti tuleb **ProgramBody.java** klassi **start()** meetodis vastav kood <br/>
kommentaaridest vabastada. Samuti ei tohi unustada, et samas klasssis //import java.io.FileWriter; <br/>
tuleb samuti kommentaari alt vabastada.

### Autor

Kristjan Tõnismäe
