## Projekti lühikirjeldus

Programm genereerib 6 erinevat suvalist numbrit, mis jäävad vahemikku 1-48. <br>
Väljastamisel numbrid järjestatakse kasvavas järjekorras. Programm tagab, et genereeritud <br>
numbrid ei kordu. Lisaks võrdleb programm failis Combinations.csv olevaid kombinatsioone <br>
loodud suvalise kombinatsiooniga (6 erinevat numbrit). Kui kombinatsioon failis kordub, <br>
annab programm sellest teada ja viitab mitmendal Combinations.csv failireal on korduv kombinatsioon. <br>
Kui ei kordu, siis ütleb, et tegu on unikaalse kombinatsiooniga. Varasemalt on koodi jäänud <br>
palju System.out.println(); kommentaare, kuna nendega oli hea testida.

## Projekti asukoht

https://github.com/KrissuEST/RandomNumberGenerator

## Projekti info

Programm kasutab **Java 8** versiooni. <br>
Kontrollisin ka Whitespace characters ehk tühimärke, et kood oleks puhtam. <br>
Kood on inglise keeles, README.md eesti keeles.

## Projekti käivitamise juhend

Projekt lisada endale sobivasse arenduskeskkonda: Eclipse, NetBeans, Atom, IntelliJ IDEA vms. <br>
Kui projekt on lisatud, siis parem klikk projekti peal ja valida Run As -> Java Application <br>
Projekti peab mitmel korral käivitama, et saada erinevaid kombinatsioone. <br>
Programmile on kaasa lisatud **Combinations.csv** fail, mille võib enda arvutis Desktopile lisada. <br>
Kasutada kindlasti seda faili, kuna siis on kindel et programm vigadeta töötab. <br>
Siis tuleb CodesList.java klassis CodesList() meetodis ära muuta url, näitamaks asub fail sinu arvutis.

NB: Kui on soov iga kord sisendfaili kombinatsioonid sorteerituna välja printida uude CS_Output.csv faili, <br>
siis tuleb muuta väljundfaili url MainClass.java main() meetodis. <br>
Samuti tuleb ProgramBody.java klassis ja start() meetodis vastav kood kommentaaridest vabastada. <br>
Samuti ei tohi unustada, et //import java.io.FileWriter; tuleb samuti kommentaari alt vabastada.
