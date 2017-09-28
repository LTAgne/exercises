-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT title
FROM film f
JOIN film_actor fa ON fa.film_id = f.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.first_name = UPPER('Nick') AND a.last_name = UPPER('Stallone')

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT title
FROM film f
JOIN film_actor fa ON fa.film_id = f.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.first_name = UPPER('Rita') AND a.last_name = UPPER('Reynolds')

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT title
FROM film f
JOIN film_actor fa ON fa.film_id = f.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE (a.first_name = UPPER('Judy') AND a.last_name = UPPER('Dean')) OR (a.first_name = UPPER('River') AND a.last_name = UPPER('Dean'))

-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT *
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE name = 'Documentary'


-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT *
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE name = 'Comedy'

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT *
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE c.name = 'Children' AND f.rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT *
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE c.name = 'Family' AND f.rating = 'G' AND f.length < 120

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT f.title
FROM film f
JOIN film_actor fa ON fa.film_id = f.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE a.first_name = UPPER('Matthew') AND a.last_name = UPPER('Leigh') AND f.rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE c.name = 'Sci-Fi' AND f.release_year = 2006

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT f.title
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
JOIN film_actor fa ON fa.film_id = f.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE c.name = 'Action' AND a.first_name = UPPER('Nick') AND a.last_name = UPPER('Stallone')

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT a.address, c.city, a.district, country.country
FROM store s
JOIN address a ON a.address_id= s.address_id
JOIN city c ON a.city_id = c.city_id
JOIN country ON c.country_id = country.country_id


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT store.manager_staff_id, staff.first_name, staff.last_name, store.store_id, a.address, c.city, a.district, country.country
FROM store
JOIN staff ON staff.store_id = store.store_id
JOIN address a ON a.address_id= store.address_id
JOIN city c ON a.city_id = c.city_id
JOIN country ON c.country_id = country.country_id


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)



-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
SELECT customer.first_name, customer.last_name, SUM(p.amount) AS total_payment
FROM customer
JOIN payment p ON p.customer_id = customer.customer_id
GROUP BY customer.first_name, customer.last_name 
ORDER BY total_payment DESC LIMIT 10

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals) **total results should be the same as these numbers 

-- off by 5 need to fix 

SELECT COUNT(rental.inventory_id), s.store_id, a.address, c.city,country.country
FROM store s
JOIN address a ON s.address_id = a.address_id
JOIN city c ON c.city_id = a.city_id
JOIN country ON country.country_id = c.country_id
JOIN inventory i ON i.store_id = s.store_id
JOIN rental ON rental.inventory_id = i.inventory_id
GROUP BY s.store_id, a.address, c.city,country.country

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)



-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
