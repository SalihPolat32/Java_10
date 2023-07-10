--  SQL (INNER JOIN, LEFT JOIN RIGHT JOIN, FULL OUTER JOIN) UNION 

SELECT *
FROM customers;

SELECT *
FROM orders;

SELECT *
FROM shippings;

/*
 * SELECT *
 * FROM Tablo1
 * JOIN Tablo2
 * ON Şart
 */

-- Bütün Kolonları(Sütunları) Dahil Etti. Bu Babadan Kalma, Klasik JOIN'dir
SELECT *
FROM customers
         JOIN orders
              ON orders.customer_id = customers.customer_id;


SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers AS c
         INNER JOIN orders AS o
                    ON o.customer_id = c.customer_id;

SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         INNER JOIN orders o
                    ON o.customer_id = c.customer_id;


SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         LEFT JOIN orders o
                   ON o.customer_id = c.customer_id;



SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         RIGHT JOIN orders o
                    ON o.customer_id = c.customer_id;



SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         RIGHT JOIN orders o
                    ON o.customer_id = c.customer_id
WHERE o.amount > 500;



SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         LEFT JOIN orders o
                   ON o.customer_id = c.customer_id
WHERE o.amount > 500;

SELECT c.customer_id, c.first_name, c.last_name, o.item, o.amount, o.customer_id
FROM customers c
         FULL OUTER JOIN orders o
                         ON c.customer_id = o.customer_id;