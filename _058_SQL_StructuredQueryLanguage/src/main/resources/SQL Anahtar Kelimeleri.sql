-- AS LIKE IN BETWEEN
-- MIN MAX COUNT AVG SUM --> Bunlar Bize Tek Sonuç Getirir Ve Şart Olarak Kullanılır.

SELECT *
FROM customers;

-- AS as Lakap Tabloda
SELECT c.first_name, c.last_name
FROM customers AS c;

-- AS Kolonda Sütunda Kullanımı
SELECT age AS yas
FROM customers AS c;

-- AS Kısa Kullanımı - Kolonda Sütunda Kullanımı
SELECT c.age yas, c.country ülke
FROM customers c;

-- En Büyük Yaşı Bulma
SELECT MAX(age)
FROM customers;

-- En Küçük Yaşı Bulma
SELECT MIN(age)
FROM customers;

-- En Büyük Ve En Küçük Yaşı Bulma
SELECT MAX(age), MIN(age)
FROM customers;

-- En Büyük Ve En Küçük Yaşı Bulma Ve Lakap Verme
SELECT MAX(age) "en büyük", MIN(age) "en küçük"
FROM customers;

-- En Küçük Yaşı Bulma
SELECT MIN(age)
FROM customers;

-- Şart Kısmı
SELECT *
FROM customers
WHERE age = 22;

-- Şart Kısmında İç Sorgu
SELECT *
FROM customers
WHERE age = (SELECT MIN(age)
             FROM customers);

-- Şart Kısmında İç Sorgu
SELECT *
FROM customers
WHERE age = (SELECT MAX(age)
             FROM customers);

-- Toplam Müşteri Sayısı
SELECT COUNT(*)
FROM customers;

-- Toplam Müşteri Sayısı Lakaplı AS
SELECT COUNT(*) AS musteri_sayisi
FROM customers;

-- Toplam Müşteri Sayısı Lakaplı
SELECT COUNT(*) musteri_sayisi
FROM customers;

-- Ülkeye Göre Listeleyelim
SELECT *
FROM customers
WHERE country = 'TR';

SELECT COUNT(country) AS ulkesi_TR_olan_kisiler
FROM customers
WHERE country = 'TR';

SELECT COUNT(country) AS ulkesi_TR_olan_kisiler
FROM customers
WHERE country = 'DE';

-- Tüm Ülke Sayısını Sayıyor
SELECT COUNT(country)
FROM customers;

-- Tekil Olarak Sayma İçin DISTINCT Kullanırız
SELECT COUNT(DISTINCT country)
FROM customers;

-- Ülke Adına Göre Grupladık Ve O Ülkedeki Müşteri Sayısını Aldık
SELECT country, COUNT(*)
FROM customers
GROUP BY country;

-- Müşteri Sayısına Göre Sıralama A -> Z, 0 -> 9
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
ORDER BY customer_totals;

-- Müşteri Sayısına Göre Sıralama Z -> A, 9 -> 0
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
ORDER BY customer_totals DESC;

-- ASC Müşteri Sayısına ve DESC Ülke Adına Göre Sıralama
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
ORDER BY customer_totals DESC, country ASC;

-- Gruplanmış ülke Listesindeki Müşteri Sayısına Göre 2'den Çok Olan Ülkeleri Listeleme
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
HAVING COUNT(*) > 2
ORDER BY customer_totals DESC, country ASC;

SELECT country, COUNT(customer_id) AS mytotal
FROM customers
GROUP BY country
HAVING COUNT(customer_id) > 2;

-- Müşterilerin Yaşları Toplamı
SELECT SUM(age) FROM customers;

-- Müşterilerin Yaşları Toplamı ve Yaş Ortalaması
SELECT MIN(age), MAX(age), SUM(age), COUNT(age), AVG(age) FROM customers;

-- Şart Kullanıldı
SELECT * FROM customers
WHERE country = 'USA' OR country = 'CA' OR country = 'DE';

-- Şart Kullanıldı
SELECT * FROM customers
WHERE country IN('USA', 'CA', 'DE')
ORDER BY age;

-- Şart Kullanıldı Olumsuz Durum - NOT
SELECT * FROM customers
WHERE country NOT IN('USA', 'CA', 'DE');

-- İki Şeyin Arası
SELECT * FROM customers
WHERE age > 18 AND age < 25;

-- İki Şeyin Arası
SELECT * FROM customers
WHERE age BETWEEN 19 AND 24;

-- İki Şeyin Arasında Olmayan - NOT
SELECT * FROM customers
WHERE age NOT BETWEEN 19 AND 24;

-- Seçilen Ülkeye Göre Listeleme
SELECT * FROM customers
WHERE country = 'DE';

-- Seçilen Müşteri Adı O Harfi İLe Başlayanları Listeleme
SELECT * FROM customers
WHERE first_name LIKE 'O%';

-- Seçilen Müşteri Adında a Harfi geçenleri Listeleme
SELECT * FROM customers
WHERE first_name LIKE '%a%';

-- Seçilen Müşteri Adında a veya A Harfi geçenleri Listeleme
SELECT * FROM customers
WHERE first_name LIKE '%a%' OR first_name LIKE '%A%';

-- Seçilen Müşteri Adında a Harfi Geçmeyenleri Listeleme
SELECT * FROM customers
WHERE first_name NOT LIKE '%a%';