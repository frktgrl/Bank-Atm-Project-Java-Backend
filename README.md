#  Bank (ATM) Project
## Spring Boot Backend Project 
+ Roller: Admin(Banka) user(Müşteri)
+ Database relation: admin(1) - user (N) ==> Spring Data(@OneToMany @ManyToOne ilişki üzerinde olmalıdır)

+ Register/Login: Eğer kullanıcı üye değilse üye olması gerekiyor şifreler database maskelenmiş şekilde kaydedilmelidir. (Spring Security)

+ Tanımlama:Müşteri şifresini girerek sisteme giriş yapar (Login için 3 giriş hakkı vardır yoksa bloke olur)

+ Müşteri eğer para eklerse parasına ekleme , para çekerse hesaptan para eksilecek

+ Validation: Eğer Müşterinin parası yoksa para çekemez

+ Loglama: Yapılan her bir işlem için mutlaka loglama tutmak gerekiyor

# Müşteri ekranında:

+ Müşteri para ekleme
+ Müşteri para çekme
+ Müşteri para havale
+ Admin : admin gün içinde sisteme giren müşterileri takip edebilmeli. Her bir müşteri için bilgilerine erişim sağlama örneğin hangi müşterinin ne kadar parası var (ipucu: sql inner join)

Dikkat:

+ OOP kullanmak çok önemli(interface,abstract,inheritance) , Stream API,Optional,enum kullanılmalıdır.
+ Design pattern kullanmalıyız.
+ Clean code mantığında ilerlemeliyiz
+ S.O.L.I.D prensibine uygun kodlar yazmalıyız.
