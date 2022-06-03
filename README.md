# CHARACTERS
![image1](/img/Characters.PNG)
# MONSTERS
![image1](/img/Monsters.PNG)
# WEAPONS
![image1](/img/Weapons.PNG)
# ARMORS
![image1](/img/Armors.PNG)

# LOCATIONS
## Safe House
- Feature : Life regeneration.
## Cave
- Monster : Zombie (1-3)
- Feature : War + Tresure
- Item : Food
## Forest
- Monster : Vampire (1-3)
- Feature : War + Tresure
- Item : Firewood
## River
- Monster : Bear (1-3)
- Feature : War + Tresure
- Item : Water
## Shop
- Feature : Buying items
- Weapons : Pistol,Sword,Rifle
- Armor : Light,Medium,Heavy
## Class Diagram
![image1](/img/class-diagram.jpg)
1 - Oyunu bitirebilmek için savaş bölgelerindeki tüm düşmanlar temizlendikten sonra bölgeye özel ödülü oyunucun envanterine eklenmelidir. Eğer oyuncu tüm ödülleri toplayıp "Güvenli Eve" dönebilirse oyunu kazanır. Ayrıca ödül kazanılan bölgeye tekrar giriş yapılamaz.



Bölge Ödülleri :



Mağara => Yemek (Food)


Orman => Odun (Firewood)


Nehir => Su (Water)


2 - Oyuncu bir canavarla karşılaştığında ilk hamleyi kimin yapacağını, %50 şans ile belirlenmesi. (Şuan ki durumda ilk vuran her zaman oyuncu)



3 - Yeni bir savaş bölgesi eklenmeli. Bu bölgenin amacı yenilen rakiplerden rastgele para, silah veya zırh kazanma ihtimali olması.



Bölge Adı : Maden


Canavar : Yılan (1-5 Adet)


Özellik : Savaş ve Ganimet


Eşya : Para, Silah veya Zırh


Yılan Özellikleri :



ID : 4


HASAR : Rastgele (3 ve 6 arası)


SAĞLIK :12


PARA : Yok (Onun yerine eşya kazanma ihtimali)


Yenilen bir rakiplerden düşen eşyalar :



Silah Kazanma İhtimali : 15%


Tüfek Kazanma İhtimali : 20%


Kılıç Kazanma İhtimali : 30%


Tabanca Kazanma İhtimali : 50%


Zırh Kazanma İhtimali : 15%


Ağır Zırh Kazanma İhtimali : 20%


Orta Zırh Kazanma İhtimali : 30%


Hafif Zırh Kazanma İhtimali : 50%


Para Kazanma İhtimali : 25%


10 Para Kazanma İhtimali: 20%


5 Para Kazanma İhtimali: 30%


1 Para Kazanma İhtimali: 50%


Hiç birşey kazanamama ihtimali : 45%
