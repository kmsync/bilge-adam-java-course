# Ödev 4

- YurtDışı çıkışını kontrol eden eğer yurt dışına çıkışta bir problem varsa duruma göre istisna fırlatan bir
uygulama yazınız.
- Passenger isimli bir sınıf oluşturunuz. Bu sınıf içerisinde "departureFee", "isBanOnLeavingTheCountry",
"visaStatus" alanlarını tanımlayınız.
- Passenger objesi oluşturulurken bu alanların değerlerinin kullanıcıdan alınmasını
sağlayınız.BorderController isimli bir sınıf oluşturunuz. Bu sınıf içerisinde checkDepartureFee,
checkBanOnLeavingTheCountry, checkVisa isimli metodlar oluşturunuz.
- checkDepartureFee metodu içerisinde yatırılan harç 100 tl'den düşük ise DepartureFeeException
fırlatılmasını sağlayınız.
- checkBanOnLeavingTheCountry metodu içerisinde değer false ise BanOnLeavingTheCountryException
fırlatılmasını sağlayınız.
- checkVisa isimli metod içerisinde değer visa alanının değeri false ise VisaException fırlatılmasını
sağlayınız.
- Main metodu içerisinde while döngüsü oluşturarak exception alınması durumunda döngünün başına
dönülmesini exception alınmaması halinde uygulamanın 0 çıkış koduyla sonlanmasını sağlayınız
