-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT title 
FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.first_name='NICK' AND actor.last_name='STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT title 
FROM film_actor
JOIN film ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.first_name ='RITA' AND actor.last_name ='REYNOLDS';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
select title from film_actor
join film on film_actor.film_id = film.film_id
join actor on film_actor.actor_id = actor.actor_id
where actor.first_name = 'JUDY' or actor.first_name = 'RIVER' and actor.last_name = 'DEAN';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)
select f.title from film.f
join film_category fc on f.film_id = fc.film_id
join category com on fc.category_id = com.category_id
where com.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
select f.title from film f 
join film_category fc on f.film_id = fc.film_id
join category chi on fc.category_id = chi.category_id
where chi.name = 'Children' and f.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
select f.title from film f 
join film_category fc on f.film_id = fc.film_id
join category fam on fc.category_id = fam.category_id
where fam.name = 'Family' and f.rating = 'G' and f.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
select film.title from film_actor
join film on film_actor.film_id = film.film_id
join actor on film_actor.actor_id = actor.actor_id
where actor.first_name = 'MATTHEW' and actor.last_name = 'LEIGH' and film.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
select f.title from film f
join film_category fc on f.film_id = fc.film_id
join category syfi on fc.category_id = syfi.category_id
where syfi.name = 'Sci-Fi' and f.release_year = '2006'


-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT f.title, c.name AS category,a.first_name, a.last_name FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
JOIN film_actor fa ON fa.film_id = f.film_id
JOIN actor a ON a.actor_id = fa.actor_id
WHERE c.name= 'Action' AND a.first_name = 'NICK' AND a.last_name = 'STALLONE';


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

select category.name, count(rental.rental_id)as rental_count
from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
group by category.name
order by rental_count desc
limit 5;


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
