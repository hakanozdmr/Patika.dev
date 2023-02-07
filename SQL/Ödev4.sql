--Sorgu 1 --

SELECT DISTINCT replacement_cost FROM film ORDER BY replacement_cost;

--Sorgu 2 --

SELECT COUNT( DISTINCT replacement_cost) FROM film ;

--Sorgu 3 --

SELECT  COUNT( DISTINCT title) FROM film WHERE title LIKE 'T%' AND rating = 'G';

--Sorgu 4 --

SELECT COUNT(*) FROM country WHERE length(country)=5;

--Sorgu 5 --

SELECT COUNT(*) FROM city WHERE city ILIKE '%R';
