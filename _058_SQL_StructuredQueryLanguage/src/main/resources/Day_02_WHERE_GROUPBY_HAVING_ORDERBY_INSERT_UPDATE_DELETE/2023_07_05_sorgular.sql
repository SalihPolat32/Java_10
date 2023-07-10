SELECT *
FROM customers
WHERE country = 'DE';

SELECT *
FROM customers;
select *
from customers;
selecT *
From customers;

-- Ülkesi Almanya Olmayanlar
SELECT *
FROM customers
WHERE NOT country = 'DE';

-- Ülkelerin İsimlerini Unique Tek Olarak Listeleyelim
SELECT DISTINCT country
FROM customers;

-- Yaşı 25'den Büyük Olanları Göster
-- SELECT * FROM customers
-- WHERE age > 25;

-- Ülkelerin İsimlerini Unique Tek Olarak Listeleyelim ve Sayılarını da Gösterelim
SELECT DISTINCT country
FROM customers;
SELECT COUNT(DISTINCT country)
FROM customers;

-- Alias (Lakap Takmak)
SELECT first_name AS fname
FROM customers;

-- Alias (Lakap Takmak)
SELECT customer_id AS c_id, first_name AS c_name
FROM customers;

-- Alias (Lakap Takmak)
SELECT customers.customer_id, customers.first_name
FROM customers;

SELECT c.customer_id, c.first_name
FROM customers AS c;

SELECT c.customer_id, c.first_name
FROM customers c;

-- SELECT o.id FROM order o;
-- SELECT s.id FROM shp s;

SELECT CONCAT(first_name, ' ', last_name) AS full_name
FROM customers;
SELECT CONCAT(first_name, ' ', last_name) full_name
FROM customers;

-- Tabloya Yeni Bir Kayıt Ekleyelim
INSERT INTO customers (first_name, last_name, phone, country, age)
VALUES ('AAA', 'BBB', '111', 'TR', 25);

-- INSERT INTO customers (customer_id, first_name, last_name, phone, country, age)
-- VALUES                (20         ,'ASLAN'    , 'MİMAR'  , '999', 'CA'   , 40);

INSERT INTO customers (first_name, last_name, phone, country, age)
VALUES ('AA1', 'BBB', '111', 'TR', 38),
       ('AA2', 'BBB', '111', 'TR', 42),
       ('AA3', 'BBB', '111', 'TR', 35);

SELECT *
FROM customers;

-- Sakın Böyle id Değeri Belirtilmeyen Update Yapmayın

UPDATE customers
SET age = 22;
SELECT *
FROM customers;

-- Güncelleme, Edit, Update Önce id Değerini belirtmemiz Lazım customer_id = 16
UPDATE customers
SET age = 26
Where customer_id = 1;

SELECT *
FROM customers;

SELECT *
FROM customers
Where customer_id = 1;

SELECT *
FROM customers;

-- id Değeri 16'dan Büyük Olan Kişilerin Ülke Kodlarını Polonya (PL) Yapalım
UPDATE customers
SET country = 'PL'
WHERE customer_id > 16;
-- WHERE customer_id >= 16;

SELECT *
FROM customers;

-- Silme İşleminde Mutlaka Silinecek Kaydın id Değerini Seçiniz. Yoksa Tüm Kaydı Sileriz.
-- DELETE * FROM customers; -- Bunu Sakın Çalıştırma. Bu Tablodaki Tüm Verileri Siler.

-- id Değeri 16'dan Büyükleri Olan Kaydı Silelim
DELETE
FROM customers
WHERE customer_id > 16;

SELECT *
FROM customers;

-- Tabloyu Fabrika Çıkışlı Haline Getirir. Her Şeyi Sıfırlar.
-- TRUNCATE TABLE customers;

-- Sıralama İçin
SELECT *
FROM customers
ORDER BY first_name;

SELECT *
FROM customers;

-- ASC A'dan Z'ye Sıralama, Yazmak Zorunda Değiliz. Varsayılan Olarak Var.
SELECT *
FROM customers
ORDER BY first_name ASC;

SELECT *
FROM customers;

-- DESC Z'den A'ya Sıralama, Yazmak Zorundayız. Tersten Sıralama Yapar.
SELECT *
FROM customers
ORDER BY first_name DESC;

SELECT *
FROM customers;

SELECT *
FROM customers
ORDER BY customer_id;

SELECT *
FROM customers;

-- Birden Fazla Durumla Sıralama
SELECT *
FROM customers
ORDER BY first_name, last_name, age;

SELECT *
FROM customers;

-- DESC Çoklu Sıralama
SELECT *
FROM customers
ORDER BY country DESC, first_name DESC;

SELECT *
FROM customers;

-- DESC İle Sadece first_name Sıralanır. country ASC İle Sıralanır. Yazılmasa da ASC Default Vardır.
SELECT *
FROM customers
ORDER BY country, first_name DESC;

SELECT *
FROM customers;

-- Ülke Adı (Kişi Sayısı) Gruplama. Gruplamalarda 1 Kolonu Seçiniz.
SELECT country, COUNT(*) AS numbers
FROM customers
GROUP BY country;

-- Grubun Şartı HAVING
SELECT country, COUNT(*) AS numbers
FROM customers

-- WHERE age > 23
GROUP BY country
HAVING country = 'TR';

SELECT *
FROM customers
WHERE country = 'TR';