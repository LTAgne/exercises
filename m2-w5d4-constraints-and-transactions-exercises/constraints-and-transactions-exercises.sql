-- Write queries to return the following:
-- The following changes are applied to the "dvd table" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor WHERE first_name = 'Hampton' OR first_name = 'Lisa'

INSERT INTO actor (first_name, last_name) VALUES ('Hampton', 'Avenue')
INSERT INTO actor (first_name, last_name) VALUES ('Lisa', 'Byway')

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
SELECT * FROM film WHERE title = 'Euclidean PI'
INSERT INTO film (title, description, language_id, release_year, length ) VALUES ('Euclidean PI', 'the epic story of Euclid as a pizza delivery boy in 
-- ancient Greece', 1, 2008, 198)

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT * FROM film WHERE title = 'Euclidean PI' -- 1001
SELECT * FROM actor WHERE first_name = 'Hampton' Or first_name = 'Lisa'     -- 201 ,  202

INSERT INTO film_actor (actor_id, film_id) VALUES (201, 1001)

-- 4. Add Mathmagical to the category table.
SELECT * FROM category WHERE name= 'Mathmagical'
INSERT INTO category (name) VALUES ('Mathmagical')

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE" id - 17 
SELECT film.film_id, title, fc.category_id FROM film
JOIN film_category fc ON fc.film_id = film.film_id 
WHERE film.title = 'Euclidean PI'

BEGIN TRANSACTION; 

INSERT INTO film_category (film_id, category_id) VALUES (1001, 17)

UPDATE film_category SET category_id = 17 WHERE film_id = 274
UPDATE film_category SET category_id = 17 WHERE film_id = 494
UPDATE film_category SET category_id = 17 WHERE film_id = 714
UPDATE film_category SET category_id = 17 WHERE film_id = 996

COMMIT; 

ROLLBACK;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
BEGIN TRANSACTION 

UPDATE film SET rating = 'G' WHERE film_id = 274
UPDATE film SET rating = 'G' WHERE film_id = 494
UPDATE film SET rating = 'G' WHERE film_id = 714 
SELECT * FROM film WHERE rating = 'G'
ROLLBACK;

COMMIT; 
-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT film_id FROM film WHERE title = 'Euclidean PI'

INSERT INTO inventory (film_id, store_id) VALUES (1001, 1)
INSERT INTO inventory (film_id, store_id) VALUES (1001, 2)

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
SELECT * FROM film WHERE title = 'Euclidean PI'

DELETE FROM film WHERE title = 'Euclidean PI'
 
 -- did not work because it is connected to the film_actor table 

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
SELECT * FROM category WHERE name = 'Mathmagical'

DELETE FROM category WHERE name = 'Mathmagical'

  -- did not work because it is connected to the film_category table 

-- 10. Delete all links to Mathmagical in the film_category table. 
-- (Did it succeed? Why?)
SELECT * FROM film_category WHERE category_id = 17

BEGIN TRANSACTION 

DELETE FROM film_category WHERE category_id = 17

ROLLBACK
COMMIT 

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
SELECT * FROM category WHERE name = 'Mathmagical'

BEGIN TRANSACTION 
DELETE FROM category WHERE name = 'Mathmagical'
ROLLBACK;
COMMIT;
- 
-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

SELECT * FROM film WHERE title = 'Euclidean PI'
 -- film_id is connected to film_actor so we would need to remove the connection between the film and the two actors we added 