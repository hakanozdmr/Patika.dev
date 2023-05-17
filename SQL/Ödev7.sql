--Sorgu 1 --
SELECT rating,COUNT(*) FROM film GROUP BY rating;

--Sorgu 2 --

SELECT replacement_cost,COUNT(*) FROM film GROUP BY replacement_cost HAVING  COUNT(*) > 50;

--Sorgu 3 --

SELECT store_id ,COUNT(customer_id) FROM customer GROUP BY store_id;

--Sorgu 4 --

SELECT country_id ,COUNT(city) FROM city GROUP BY country_id ORDER BY count(city) DESC LIMIT 1;
