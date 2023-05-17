--Sorgu 1 --
SELECT * FROM film
WHERE lengt>
(
    SELECT AVG(length) FROM film
)

--Sorgu 2 --

SELECT * FROM film 
WHERE rental_rate >
(
    SELECT MAX (rental_rate) FROM film
)
--Sorgu 3 --

SELECT * FROM film
WHERE rental_rate = ANY
(
    SELECT MIN(rental_rate) FROM film
)
and
replacement_cost =
(
    SELECT MIN(replacement_cost) FROM film
)
--Sorgu 4 --

SELECT customer_id, COUNT(*) AS most_payments FROM payment
GROUP BY customer_id
ORDER BY most_payments DESC;