--Sorgu 1 --
SELECT ROUND(AVG(rental_rate),2) as rental_rate_degerinin_ortalaması FROM film;

--Sorgu 2 --

SELECT COUNT(*) as C_ile_başlayan_filmlerin_sayısı FROM film WHERE title LIKE 'C%';

--Sorgu 3 --

SELECT  MAX(length) FROM film WHERE rental_rate = 0.99;

--Sorgu 4 --

SELECT COUNT(DISTINCT replacement_cost) FROM film WHERE length>150;
