# TODO APP

Service -> Business logiclerin gerçekleştirildiği. Veritabanı bağlantısı. İd ataması. Kullanıcıdan alınan veriye göre title alanın değiştirilmesi gibi işlemlerin yapıldığı sınıfları kapsar.
Controller> -> Kullanıcıdan veri alma ve kullanıcıya veri verme işlemlerinin yapıldığı sınıfları temsil eder.
DTO (Data Transfer Object) -> Controllerda verilerin kullanıcıdan alınması ve kullanıcıya iletilmesi için gerekli alanlar bu sınıf içerisinde bulunur. Verinin saklanacağı sınıfın güvenliği için gereklidir.
Entity -> Verinin saklandığı asıl sınıftır. Veri bu sınıf aracılığı ile bir persistence kaynağına (database,file vb) aktarılır ya da kaynaktan alınır.
