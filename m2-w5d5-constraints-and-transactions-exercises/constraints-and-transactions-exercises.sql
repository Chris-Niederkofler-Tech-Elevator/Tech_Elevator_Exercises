-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

SELECT * FROM actor 
ORDER BY last_name

BEGIN TRANSACTION;

INSERT INTO actor(actor_id, first_name, last_name)
VALUES (201, 'HAMPTON', 'AVENUE');
INSERT INTO actor(actor_id, first_name, last_name)
VALUES (202, 'LISA', 'BYWAY');

COMMIT;

ROLLBACK;


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

SELECT * FROM film
ORDER BY film_id

BEGIN TRANSACTION;

INSERT INTO film(film_id, title, description, release_year, language_id, length)
VALUES ('1001', 'Euclidean PI','The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece','2008','1','198')

COMMIT;

ROLLBACK;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT * FROM film_actor
ORDER BY film_id DESC

BEGIN TRANSACTION;

INSERT INTO film_actor(actor_id,film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'HAMPTON' AND last_name = 'AVENUE'),(SELECT film_id FROM film WHERE title = 'Euclidean PI'));

INSERT INTO film_actor(actor_id,film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'LISA' AND last_name = 'BYWAY'),(SELECT film_id FROM film WHERE title = 'Euclidean PI'))

COMMIT;

ROLLBACK;


-- 4. Add Mathmagical to the category table.
SELECT * FROM category

BEGIN TRANSACTION;

INSERT INTO category (name) VALUES ('Mathmagical')

COMMIT;

ROLLBACK;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category(film_id, category_id)
VALUES(1001, 17)

UPDATE film_category
SET category_id = 17
WHERE film_id IN (494, 714, 966, 274,1002);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
UPDATE film 
SET rating = 'G'
WHERE film_id in ((494, 714, 966, 274,1002);


-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory
(film_id, story_id)
VALUES(1001,1), (1001,2); 


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film 
WHERE title = 'Euclidean PI';
  --does not succeed because it violates foreign key constraint on film actor table!

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category
WHERE category.name = 'Mathmagical'
--Yes it did succeed, quite successfully!


-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category
WHERE category_id = 17

--Twas successful, because it was a direct command to a primary key and no foreign key constraints.


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
DELETE FROM film 
WHERE title = 'Euclidean PI';
--So Mathmagical is already gone but this time 'Euclidean PI' was deleted due to no foreign key constraint in the film_category table.


-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

--After looking at the references, one would need to adjust the inventory_id, film_id, and actor_id, in order to successfully
--delete the film, in all its glory!




