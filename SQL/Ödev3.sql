--Sorgu 1 --

 SELECT * FROM country WHERE country LIKE 'A%a'; 

--Sorgu 2 --

 SELECT * FROM country WHERE length(country)>=6 AND country LIKE '%n'; 

--Sorgu 3 --

SELECT title FROM film WHERE title ILIKE '%T%T%T%T%';

--Sorgu 4 --

SELECT * FROM film WHERE title LIKE 'C%' AND length>90 AND rental_rate = 2.99;