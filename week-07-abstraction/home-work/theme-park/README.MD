# Theme Park - Abstract Class, Interface ve Polymorphism içeren ev ödevi.

Ödevlerinizin teslimini bu dosyanın bulunduğu dizin içerisine adınızla bir dizin oluşturup altına ekleyebilirsiniz. Ekleme işlemini farklı bir branch üzerinden pull request oluşturarak yapabilirsiniz. Aşağıdaki komutlardan faydalanarak bu işlemi yapabilirsiniz.

```
git checkout -b "isim-soyisim-theme-park"
git add .
git commit -m "Commit mesajı"
git push origin "isim-soyisim-theme-park"
```

18.02.2022 18.00 tarihine kadar tamamladığınız kadarı ile pull requestlerini oluşturmanız gerekmektedir. Pull request oluşturduktan sonra üzerine çalışmaya devam edip pull requestinizi güncelleyebilirsiniz.

### Pekiştirilecek Konular

Büyük bir gerçek dünya alanını modellemeyi ve aşağıda bulunan java enstrümanlarının kullanımı hakkında öğrendiklerinizi uygulamayı pekiştireceksiniz:

* classlar
* inheritance
* abstract classlar
* interfaceler

## ThemePark

#### Classlar ve Abstract Classlar


 - `Visitor` isimli bir sınıf oluşturalım. İçerisinde age, height ve money bilgisi bulunmalıdır.
 - `Attraction` isimli bir soyut sınıf oluşturalım.İçerisinde name, rating and visitCount(0 ile başlayacak) bilgilisi bulunmalıdır.
 - `Rollercoaster`, `Dodgems`, `Park` ve `Playground` sınıfları `Attraction` sınıfından türemelidir.
 - `Stall` isimli bir soyut sınıf oluşturalım. İçerisinde name, owner name, rating ve parking spot alanları bulunmalıdır.
 - `FrenchFriesStall`. `ChickenWrapStall` and `IceCreamStall` sınıfları `Stall` sınıfından türemelidir.

Bu sınıfların test edilmesi için algoritma kurunuz.

#### Interfaceler

Biletlemeleri gözlem altında tutmak, kısıtlamak ve gözden geçirmek için aşağıdaki interfaceleri kullanın:

1. `Ticketed` `double defaultPrice()` ve `double priceFor(Visitor)` metodlarını içermelidir.
2. `Security` `boolean isAllowedTo(Visitor)` metodunu içermelidir.
3. `Reviewed` `int getRating()` ve `String getName()` metodlarını içermelidir.

Aşağıdaki kurallara göre implementasyonları sağlayın.

4. `Playground` `Security` interfaceini implemente etmelidir çünkü Visitor tarafından kullanımı Visitor'ın en fazla 15 yaşında olması gerekmektedir.
5. `Rollercoster` `Security` interfaceini implemente etmelidir çünkü ziyaretçinin boyu 145 cm'den uzun olmalı ve ziyaretçi 12 yaşından büyük olmalıdır.
6. Tüm standlar (Stall) ve oyuncaklar(Attraction) `Reviewed` interfaceini implemente etmelidir.

###### Not: Başlangıç Fiyatları:
 - `Rollercoaster` 10TL
 - `Dodgems` 8TL

8. `Rollercoaster``Ticketed` interfaceini implemente etmelidir. Boyu 200cm üzerinde olan ziyaretçilerden iki katı fiyat alınmalıdır.
9. `Dodgems` `Ticketed` interfaceini implemente etmelidir.12 yaşından küçük çoçuklar için ücret yarım olmalıdır.

### Theme Park Sınıfı Kuralları

`ThemePark` isimli bir class oluşturun. Bu class tüm oyuncakların (Attraction) ve standların (Stall) bilgisini tutmalıdır.

1. `ThemePark` tüm `Attractions` ve `Stalls` bilgisini saklamalıdır.
2. `ThemePark` içerisinde `getAllReviewed()` isimli bir metod oluşturun. Dönüş değeri olarak ArrayList içerisinde Reviewed interfaceini dönünüz.
3. `Visitor` sınıfı içerisinde `visitedAttractions` isimli boş bir ArrayList oluşturun. Bu arraylist ziyaretçinin kullanmış olduğu `Attractions` bilgisini tutacaktır. Yine bu class içerisinde addVisited isimli bir metod oluşturarak çağrıldığında içerisinde gönderilen `Attractions` 'ın `Visitor` 'a eklenmesini sağlayın.
4. `ThemePark` içerisine `visit(Visitor, Attraction)` metodunu ekleyin. Bu metod ilgili `Attraction`'ın visitCount alanını 1 artırmalıdır. Bunun yanısıra `Visitor` içerisinde bulunan `visitedAttractions` alanına bu ziyareti eklemelidir.
