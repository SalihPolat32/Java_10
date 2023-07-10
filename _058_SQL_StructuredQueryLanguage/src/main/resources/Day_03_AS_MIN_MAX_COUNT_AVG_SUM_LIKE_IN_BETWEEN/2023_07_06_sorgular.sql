--  AS LIKE IN BETWEEN
--  MIN MAX COUNT AVG SUM Bunlar Bize Tek Sonuç Döndürür

SELECT *
FROM customers;

-- AS(as) Lakap TABLODA
SELECT c.last_name, c.last_name
FROM customers AS c;

-- AS Kolonda, Sütunda Kullanımı
SELECT c.age AS yas
FROM customers AS c;

-- AS Kısa Kullanımı -- Kolonda, Sütunda Kullanımı
SELECT c.age yaş, c.country ülke
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
SELECT MAX(age) "en büyük", MIN(age) AS "en küçük"
FROM customers;

-- En Küçük Yaş
SELECT MIN(age)
FROM customers;

-- Şart Kısmı
SELECT *
FROM customers
WHERE age = 19;

-- Şart Kısmına İç Sorgu Yazma
SELECT *
FROM customers
WHERE age = (SELECT MIN(age) FROM customers);

-- En Büyük Yaş
SELECT MAX(age)
FROM customers;

-- Şart Kısmına İç Sorgu Yazma
SELECT *
FROM customers
WHERE age = (SELECT MAX(age) FROM customers);

-- Toplam Müşteri Sayısı
SELECT COUNT(*)
FROM customers;

-- Toplam Müşteri Sayısı -- Lakaplı AS
SELECT COUNT(*) AS musteri_sayisi
FROM customers;

-- Toplam Müşteri Sayısı -- Lakaplı
SELECT COUNT(*) musteri_sayisi
FROM customers;

-- Ülkeye Göre Listeleme
SELECT *
FROM customers
WHERE country = 'TR';

SELECT count(country) AS ulkesi_TR_olan_kisiler
FROM customers
WHERE country = 'TR';

SELECT count(country) AS ulkesi_DE_olan_kisiler
FROM customers
WHERE country = 'DE';

-- Tüm Ülke Sayısını Sayma
SELECT COUNT(country)
FROM customers;

-- Tekil Olarak Sayma İçin DISTINCT Kullanıyoruz
SELECT COUNT(DISTINCT country)
FROM customers;

-- Ülke Adına Göre Gruplama Ve O Ülkedeki Müşteri Sayısını Alma
SELECT country, COUNT(*)
FROM customers
GROUP BY country;

-- Müşteri Sayısına Göre Sıralama DESC :  Z -> A   9 -> 0
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
ORDER BY customer_totals DESC;

-- DESC Müşteri Sayısına Ve ASC Ülke Adına Göre Sıralama -- DESC :  Z -> A   9 -> 0
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
ORDER BY customer_totals DESC, country ASC;

-- Guruplanmış Ülke Listesindeki Müşteri Sayısına Göre 2'den Çok Olan Ülkeleri Listele
SELECT country, COUNT(*) AS customer_totals
FROM customers
GROUP BY country
HAVING COUNT(*) > 2
ORDER BY customer_totals DESC, country ASC;

-- Müşterilerin Yaşları Toplamı
SELECT SUM(age)
FROM customers;

-- Müşterilerin Yaşları Toplamı Ve Yaş Ortalaması
SELECT MIN(age), MAX(age), SUM(age), count(age), AVG(age)
FROM customers;

-- Şart Kullanıldı
SELECT *
FROM customers
WHERE country = 'BR'
   OR country = 'CA'
   OR country = 'DE';

-- Şart Kullanıldı
SELECT *
FROM customers
WHERE country IN ('BR', 'CA', 'DE');

-- Şart Kullanıldı Olumsuz Durum - NOT
SELECT *
FROM customers
WHERE country NOT IN ('BR', 'CA', 'DE');

-- İki Şeyin Arasını Bulma
SELECT *
FROM customers
WHERE age > 18
  AND age < 25;

-- İki Şeyin Arasını Bulma
SELECT *
FROM customers
WHERE age BETWEEN 19 AND 24;

-- İki Şeyin Arasında Olmayanı Bulma
SELECT *
FROM customers
WHERE age NOT BETWEEN 19 AND 24;

-- Müşterileri Seçilen Ülkeye Göre Listeleme
SELECT *
FROM customers
WHERE country LIKE 'DE';

-- Seçilen Müşteri Adında O Harfi İle Başlayanlari Listeleme
SELECT *
FROM customers
WHERE first_name LIKE 'O%';

-- Seçilen Müşteri Adında a Harfi Olanları Listeleme
SELECT *
FROM customers
WHERE first_name LIKE '%a%';

-- Seçilen Müşteri Adında a Harfi Olmayanlari Listeleme
SELECT *
FROM customers
WHERE first_name NOT LIKE '%a%';

-- Seçilen Müşteri Adında a ve A Harfi Onlanları Listeleme
SELECT *
FROM customers
WHERE first_name LIKE '%a%'
   OR first_name LIKE '%A%';